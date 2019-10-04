package com.skytalking.services.impl;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.diagnostic.Logger;
import com.qq.jce.wup.UniPacket;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.skytalking.bean.SocketLoginFinished;
import com.skytalking.huya.*;
import com.skytalking.services.HuyaMonitorService;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HuyaMonitorServiceImpl implements HuyaMonitorService {
        public static long PRESENTER_ID = 961825702;
//    public static long PRESENTER_ID = 1571877666;
    private final Logger logger;

    public HuyaMonitorServiceImpl() {
        WupService.getInstance().init();
        OkHttpService.getInstance().init();
        EventBus.getDefault().register(this);
        logger = Logger.getInstance("HuyaMonitor");
    }

    private ArrayList<String> mUrls = new ArrayList<>();
    private WebSocket mWebSocket;
    private WebSocketListener mWebSocketListener = new HuyaWebSocketListener();
    private Runnable mConnectRunnable = new Runnable() {
        public void run() {
            mWebSocket = null;
            connect();
        }
    };
    private boolean mLoginSuccessful = false;
    private boolean mConnectSuccessful = false;
    private long mChannelId;
    private long mSubChannelId;
    private int mHeartbeatInterval;
    private long mLiveId;
    private boolean mSayHello = false;
    private boolean mBroadcastEnabled;
    private boolean mIsLiving = false;
    private int mAttendeeCount;
    private Disposable mConnectDisposable;
    private int mCurrentUriIndex = 0;
    private long mLastHeartBeatTime = 0;
    private int mLastHeartElapseTime = 0;
    private int mTreasureBoxIndex = 0;
    private GetWebdbUserInfoRsp getWebdbUserInfoRsp;
    private Runnable mHeartBeatRunnable = new Runnable() {
        public void run() {
            if (mWebSocket != null) {
                WebSocketCommand var1 = new WebSocketCommand();
                var1.iCmdType = 5;
                JceOutputStream jceOutputStream = CommonLib.out();
                var1.writeTo(jceOutputStream);
                mWebSocket.send(ByteString.of(jceOutputStream.toByteArray()));
                UserHeartBeatReq userHeartBeatReq = new UserHeartBeatReq();
                userHeartBeatReq.tId = WupService.getInstance().getUserId();
                userHeartBeatReq.lTid = mChannelId;
                userHeartBeatReq.lSid = mSubChannelId;
                userHeartBeatReq.bWatchVideo = true;
                userHeartBeatReq.iAttendee = mAttendeeCount;
                userHeartBeatReq.lPid = PRESENTER_ID;
                userHeartBeatReq.eLineType = 8;
                userHeartBeatReq.iFps = 30;
                userHeartBeatReq.iLastHeartElapseTime = mLastHeartElapseTime;
                mLastHeartBeatTime = System.currentTimeMillis();
                logger.info("heart beat send");
                System.out.println("heart beat send");
                WupHelper.send("OnUserHeartBeat", "onlineui", userHeartBeatReq);
//                testVideo();
            }

            if (mHeartBeatDisposable != null && !mHeartBeatDisposable.isDisposed()) {
                mHeartBeatDisposable.dispose();
            }
            int interval = mHeartbeatInterval > 0 ? mHeartbeatInterval : 60;
            mHeartBeatDisposable = Schedulers.io().scheduleDirect(this, interval, TimeUnit.SECONDS);
        }
    };
    private Disposable mHeartBeatDisposable;
    private Runnable mRegisterTimeoutRunnable = new Runnable() {
        public void run() {
            connect();
        }
    };
    private Disposable mRegisterTimeoutDisposable;

    private void addURL(String var1) {
        this.mUrls.add(var1);
    }

    private String getDefaultUri() {
        return "ws://ows.api.huya.com:80";
    }

    private String nextUrl() {
        if (this.mUrls.isEmpty()) {
            return this.getDefaultUri();
        } else {
            ArrayList var2 = this.mUrls;
            int var1 = this.mCurrentUriIndex++;
            String var3 = (String) var2.get(var1);
            this.mCurrentUriIndex %= this.mUrls.size();
            return var3;
        }
    }

    private void reconnect() {
        if (mConnectDisposable != null && !mConnectDisposable.isDisposed()) {
            mConnectDisposable.dispose();
        }
        showNotification("网络连接", "网络连接已断开,正在尝试重连");
        mConnectDisposable = Schedulers.io().scheduleDirect(mConnectRunnable, 2000, TimeUnit.MILLISECONDS);
    }

    private void enterChannel(long tid, long sid) {
        EnterChannelReq enterChannelReq = new EnterChannelReq();
        enterChannelReq.tUserId = WupService.getInstance().getUserId();
        enterChannelReq.lTid = tid;
        enterChannelReq.lSid = sid;
        WupHelper.send("OnClientReady", "ActivityUIServer", enterChannelReq);
        enterLivingRoom();
    }

    private void fireFirstHeartBeat() {

    }

    private void enterLivingRoom() {
        logger.info("enter room");
        UserEventReq userEventReq = new UserEventReq();
        userEventReq.tId = WupService.getInstance().getUserId();
        userEventReq.eOp = 1;
        userEventReq.eSource = 3;
        userEventReq.lTid = mChannelId;
        userEventReq.lSid = mSubChannelId;
        userEventReq.lPid = PRESENTER_ID;
        userEventReq.bAnonymous = false;
        userEventReq.eTemplateType = 1;
        userEventReq.bWatchVideo = true;
        UniPacket uniPacket = WupHelper.buildUniPacket("OnUserEvent", "onlineui", userEventReq);
        sendPacket(uniPacket);
    }

    @Override
    public void sendPacket(UniPacket uniPacket) {
        if (!mLoginSuccessful) {
            logger.info("未登录,无法发送消息");
            return;
        }
        WebSocketCommand var2 = new WebSocketCommand();
        var2.iCmdType = 3;
        var2.vData = uniPacket.encode();
        JceOutputStream var3 = new JceOutputStream();
        var2.writeTo(var3);
        this.mWebSocket.send(ByteString.of(var3.toByteArray()));
    }

    public void connect() {
        mLoginSuccessful = false;
        mConnectSuccessful = false;
        mIsLiving = false;
        if (this.mWebSocket != null) {
            this.mWebSocket.close(1002, "");
        } else {
            String var1 = this.nextUrl();
            Request var2 = (new Request.Builder()).url(var1).build();
            System.out.println("connect url:" + var1);
            showNotification("网络连接", "正在连接服务器:" + var1);
            this.mWebSocket = CommonLib.okHttp().newWebSocket(var2, this.mWebSocketListener);
        }
    }

    @Subscribe
    public void onDoLaunch(LiveLaunchRsp liveLaunchRsp) {
        if (liveLaunchRsp != null && liveLaunchRsp.vProxyList != null) {
            PropertiesComponent.getInstance().setValue("guid", liveLaunchRsp.sGuid);
            ArrayList vProxyList = liveLaunchRsp.vProxyList;
            mUrls.clear();
            for (int index = vProxyList.size() - 1; index >= 0; --index) {
                LiveProxyValue liveProxyValue = (LiveProxyValue) vProxyList.get(index);
                if (liveProxyValue.eProxyType == 5 || liveProxyValue.eProxyType == 7) {
                    ArrayList proxyList = liveProxyValue.sProxy;
                    for (int index1 = 0; index1 < proxyList.size(); ++index1) {
                        this.addURL("ws://" + (String) proxyList.get(index1));
                    }
                }
            }
        }
        this.addURL(this.getDefaultUri());
        this.connect();
    }

    public void register(long tid, long sid) {
        mChannelId = tid;
        mSubChannelId = sid;
        if (this.mWebSocket == null) {
            this.connect();
        } else {
            mIsLiving = true;
            WebSocketCommand var5 = new WebSocketCommand();
            var5.iCmdType = 1;
            String uid = PropertiesComponent.getInstance().getValue("uid");
            System.out.println("uid" + uid);
            WSUserInfo var6 = new WSUserInfo();
            var6.bAnonymous = false;
            var6.lUid = Long.parseLong(uid);
            System.out.println("tid:" + tid + "sid:" + sid);
            var6.lTid = tid;
            var6.lSid = sid;
            JceOutputStream var7 = CommonLib.out();
            var6.writeTo(var7);
            var5.vData = var7.toByteArray();
            JceOutputStream var8 = CommonLib.out();
            var5.writeTo(var8);
            this.mWebSocket.send(ByteString.of(var8.toByteArray()));
            if (mRegisterTimeoutDisposable != null && !mRegisterTimeoutDisposable.isDisposed()) {
                mRegisterTimeoutDisposable.dispose();
            }
            mRegisterTimeoutDisposable = Schedulers.io().scheduleDirect(mRegisterTimeoutRunnable, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    public void unregister() {
        if (mRegisterTimeoutDisposable != null && !mRegisterTimeoutDisposable.isDisposed()) {
            mRegisterTimeoutDisposable.dispose();
        }
        if (this.mWebSocket != null) {
            WebSocketCommand socketCommand = new WebSocketCommand();
            socketCommand.iCmdType = 8;
            WSDeRegisterReq deRegisterReq = new WSDeRegisterReq();
            deRegisterReq.iDeRegisterType = 2;
            JceOutputStream var3 = CommonLib.out();
            deRegisterReq.writeTo(var3);
            socketCommand.vData = var3.toByteArray();
            JceOutputStream var4 = CommonLib.out();
            socketCommand.writeTo(var4);
            this.mWebSocket.send(ByteString.of(var4.toByteArray()));
        }
    }

    private class HuyaWebSocketListener extends WebSocketListener {


        private HuyaWebSocketListener() {
        }

        public void onClosed(WebSocket var1, int var2, String var3) {
            mConnectSuccessful = false;
            mLoginSuccessful = false;
            mIsLiving = false;
            mTreasureBoxIndex = 0;
            mLastHeartBeatTime = 0;
            System.out.println("websocket closed : " + var3);
            reconnect();
        }

        public void onClosing(WebSocket var1, int var2, String var3) {
            mConnectSuccessful = false;
            mLoginSuccessful = false;
            mIsLiving = false;
            System.out.println("websocket closing : " + var3);
            logger.info("websocket closing : " + var3);
            if (mHeartBeatDisposable != null && !mHeartBeatDisposable.isDisposed()) {
                mHeartBeatDisposable.dispose();
            }
        }

        public void onFailure(WebSocket var1, Throwable var2, Response var3) {
            mConnectSuccessful = false;
            mLoginSuccessful = false;
            mIsLiving = false;
            System.out.println("websocket failure : " + var2.toString());
            logger.info("websocket failure : " + var2.toString());
            var2.printStackTrace();
            if (mHeartBeatDisposable != null && !mHeartBeatDisposable.isDisposed()) {
                mHeartBeatDisposable.dispose();
            }
            reconnect();
        }

        public void onMessage(WebSocket var1, String var2) {
            System.out.println("ssss;" + var2);
        }

        /**
         * HUYA.EWebSocketCommandType = {
         * EWSCmd_NULL: 0,
         * EWSCmd_RegisterReq: 1,
         * EWSCmd_RegisterRsp: 2,
         * EWSCmd_WupReq: 3,
         * EWSCmd_WupRsp: 4,
         * EWSCmdC2S_HeartBeat: 5,
         * EWSCmdS2C_HeartBeatAck: 6,
         * EWSCmdS2C_MsgPushReq: 7,
         * EWSCmdC2S_DeregisterReq: 8,
         * EWSCmdS2C_DeRegisterRsp: 9,
         * EWSCmdC2S_VerifyCookieReq: 10,
         * EWSCmdS2C_VerifyCookieRsp: 11,
         * EWSCmdC2S_VerifyHuyaTokenReq: 12,
         * EWSCmdS2C_VerifyHuyaTokenRsp: 13,
         * EWSCmdC2S_UNVerifyReq: 14,
         * EWSCmdS2C_UNVerifyRsp: 15,
         * EWSCmdC2S_RegisterGroupReq: 16,
         * EWSCmdS2C_RegisterGroupRsp: 17,
         * EWSCmdC2S_UnRegisterGroupReq: 18,
         * EWSCmdS2C_UnRegisterGroupRsp: 19,
         * EWSCmdC2S_HeartBeatReq: 20,
         * EWSCmdS2C_HeartBeatRsp: 21,
         * EWSCmdS2C_MsgPushReq_V2: 22,
         * EWSCmdC2S_UpdateUserExpsReq: 23,
         * EWSCmdS2C_UpdateUserExpsRsp: 24,
         * EWSCmdC2S_WSHistoryMsgReq: 25,
         * EWSCmdS2C_WSHistoryMsgRsp: 26,
         * EWSCmdS2C_EnterP2P: 27,
         * EWSCmdS2C_EnterP2PAck: 28,
         * EWSCmdS2C_ExitP2P: 29,
         * EWSCmdS2C_ExitP2PAck: 30
         * };
         *
         * @param var1
         * @param var2
         */
        public void onMessage(WebSocket var1, ByteString var2) {
//            System.out.println("websocket received data : " + var2.toString());
            WebSocketCommand var3 = new WebSocketCommand();
            JceInputStream jceInputStream = CommonLib.in(var2.toByteArray());
            var3.readFrom(jceInputStream);
//            System.out.println("web command type:" + var3.iCmdType);
            switch (var3.iCmdType) {
                case 2://EWSCmd_RegisterRsp
                    if (mRegisterTimeoutDisposable != null && !mRegisterTimeoutDisposable.isDisposed()) {
                        mRegisterTimeoutDisposable.dispose();
                    }
                    WSRegisterRsp var11 = new WSRegisterRsp();
                    var11.readFrom(new JceInputStream(var3.vData));
                    logger.info("register result : " + var11.iResCode + " " + var11.sMessage);
                    if (var11.iResCode == 0) {
                        enterChannel(mChannelId, mSubChannelId);
                    } else {
                        reconnect();
                    }
                    break;
                case 3://EWSCmd_WupReq
                case 5://EWSCmdC2S_HeartBeat
                case 6://EWSCmdS2C_HeartBeatAck
                case 8://EWSCmdC2S_DeregisterReq
                default:
                    break;
                case 4://EWSCmd_WupRsp
                    UniPacket uniPacket = new UniPacket();
                    uniPacket.setEncodeName("UTF-8");
                    uniPacket.decode(var3.vData);
                    String funcName = uniPacket.getFuncName();
                    if ("sendMessage".equals(funcName)) {
                        SendMessageRsp sendMessageRsp = uniPacket.getByClass("tRsp", new SendMessageRsp());
                        EventBus.getDefault().post(sendMessageRsp);
                        onSendMessageRsp(sendMessageRsp);
                    } else if ("muteRoomUser".equals(funcName)) {
                        MuteRoomUserRsp muteRoomUserRsp = uniPacket.getByClass("tRsp", new MuteRoomUserRsp());
                        EventBus.getDefault().post(muteRoomUserRsp);
                        onMuteRoomUserRsp(muteRoomUserRsp);
                    } else if ("getRMessageList".equals(funcName)) {
                        GetRMessageListRsp rMessageListRsp = uniPacket.getByClass("tRsp", new GetRMessageListRsp());
                        System.out.println(CommonLib.display(rMessageListRsp));
                        EventBus.getDefault().post(rMessageListRsp);
                    } else if ("OnUserEvent".equals(funcName)) {
                        UserEventRsp userEventRsp = uniPacket.getByClass("tRsp", new UserEventRsp());
                        System.out.println(CommonLib.display(userEventRsp));
                        EventBus.getDefault().post(userEventRsp);
                        onEnterRoomRsp(userEventRsp);
                        startUserHeartbeat(userEventRsp.iUserHeartBeatInterval);
                        queryUserInfo();
                    } else if ("getLivingInfo".equals(funcName)) {
                        GetLivingInfoRsp getLivingInfoRsp = uniPacket.getByClass("tRsp", new GetLivingInfoRsp());
                        System.out.println(CommonLib.display(getLivingInfoRsp));
                        mLiveId = getLivingInfoRsp.tNotice.lLiveId;
                        mChannelId = getLivingInfoRsp.tNotice.lChannelId;
                        mSubChannelId = getLivingInfoRsp.tNotice.lSubChannelId;
                        if (getLivingInfoRsp.bIsLiving == 1) {
                            register(mChannelId, mSubChannelId);
                        } else {
                            registerGroup();
                        }
                        EventBus.getDefault().post(getLivingInfoRsp);
                        showNotification("频道信息", "查询频道信息成功,正在注册频道信息");
                    } else if ("getLiveInfoListsByUids".equals(funcName)) {
                        LiveInfoByUidRsp liveInfoByUidRsp = uniPacket.getByClass("tRsp", new LiveInfoByUidRsp());
                        System.out.println(CommonLib.display(liveInfoByUidRsp));
                        EventBus.getDefault().post(liveInfoByUidRsp);
                    } else if ("getTreasureBoxInfo".equals(funcName)) {
                        GetTreasureBoxInfoRsp treasureBoxInfoRsp = uniPacket.getByClass("tRsp", new GetTreasureBoxInfoRsp());
                        System.out.println(CommonLib.display(treasureBoxInfoRsp));
                        EventBus.getDefault().post(treasureBoxInfoRsp);
                        onReceiveTreasureBoxInfo(treasureBoxInfoRsp);
                    } else if ("queryTreasure".equals(funcName)) {
                        QueryTreasureInfoRsp queryTreasureInfoRsp = uniPacket.getByClass("tRsp", new QueryTreasureInfoRsp());
                        System.out.println(CommonLib.display(queryTreasureInfoRsp));
                        EventBus.getDefault().post(queryTreasureInfoRsp);
                    } else if ("OnUserHeartBeat".equals(funcName)) {
                        mLastHeartElapseTime = (int) (System.currentTimeMillis() - mLastHeartBeatTime);
                    } else if ("finishTaskNotice".equals(funcName)) {
                        FinishTaskNoticeRsp finishTaskNoticeRsp = uniPacket.getByClass("tRsp", new FinishTaskNoticeRsp());
                        System.out.println(CommonLib.display(finishTaskNoticeRsp));
                        EventBus.getDefault().post(finishTaskNoticeRsp);
                        onReceiveFinishTaskNotice(finishTaskNoticeRsp);
                    } else if ("getWebdbUserInfo".equals(funcName)) {
                        getWebdbUserInfoRsp = uniPacket.getByClass("tRsp", new GetWebdbUserInfoRsp());
                        queryTreasureInfo();
                    } else if ("videoGatewayProxy2VGPing".equals(funcName)) {
                        VideoGatewayProxy2VGPingRsp tRsp = uniPacket.getByClass("tRsp", new VideoGatewayProxy2VGPingRsp());
                        System.out.println("local time:" + tRsp.lLocalTime);
                    }
                    break;
                case 7:
                    WSPushMessage pushMessage = new WSPushMessage();
                    jceInputStream = CommonLib.in(var3.vData);
                    pushMessage.readFrom(jceInputStream);
                    jceInputStream = CommonLib.in(pushMessage.sMsg);
                    if (pushMessage.iUri == 1400L) {
                        MessageNotice messageNotice = new MessageNotice();
                        messageNotice.readFrom(jceInputStream);
                        EventBus.getDefault().post(messageNotice);
//                        System.out.println(CommonLib.display(messageNotice));
                        logger.info(CommonLib.getMessageNoticeContent(messageNotice));
                    } else if (pushMessage.iUri == 8001L) {
                        EndLiveNotice endLiveNotice = new EndLiveNotice();
                        endLiveNotice.readFrom(jceInputStream);
                        EventBus.getDefault().post(endLiveNotice);
                        onPresenterEndLive(endLiveNotice);
                    } else if (pushMessage.iUri == 8000L) {
                        BeginLiveNotice beginLiveNotice = new BeginLiveNotice();
                        beginLiveNotice.readFrom(jceInputStream);
                        EventBus.getDefault().post(beginLiveNotice);
                        onPresenterBeginLive(beginLiveNotice);
                    } else if (pushMessage.iUri == 8006L) {
                        AttendeeCountNotice attendeeCountNotice = new AttendeeCountNotice();
                        attendeeCountNotice.readFrom(jceInputStream);
                        mAttendeeCount = attendeeCountNotice.iAttendeeCount;
                        EventBus.getDefault().post(attendeeCountNotice);
                    } else if (pushMessage.iUri == 10041L) {
                        AuditorRoleChangeNotice auditorRoleChangeNotice = new AuditorRoleChangeNotice();
                        auditorRoleChangeNotice.readFrom(jceInputStream);
                        EventBus.getDefault().post(auditorRoleChangeNotice);
                    } else if (pushMessage.iUri == 6210) {//HUYA.VipBarListRsp,
                        VipBarListRsp vipBarListRsp = new VipBarListRsp();
                        vipBarListRsp.readFrom(jceInputStream);
                        EventBus.getDefault().post(vipBarListRsp);
                    } else if (pushMessage.iUri == 6501) {
                        SendItemSubBroadcastPacket sendItemSubBroadcastPacket = new SendItemSubBroadcastPacket();
                        sendItemSubBroadcastPacket.readFrom(jceInputStream);
                        EventBus.getDefault().post(sendItemSubBroadcastPacket);
                    } else if (pushMessage.iUri == 6502) {
                        SendItemNoticeWordBroadcastPacket sendItemNoticeWordBroadcastPacket = new SendItemNoticeWordBroadcastPacket();
                        sendItemNoticeWordBroadcastPacket.readFrom(jceInputStream);
                        EventBus.getDefault().post(sendItemNoticeWordBroadcastPacket);
                    } else if (pushMessage.iUri == 1025000) {//RMessageNotify
                        RMessageNotify rMessageNotify = new RMessageNotify();
                        rMessageNotify.readFrom(jceInputStream);
                        onRMessageNotify(rMessageNotify);
                    } else if (pushMessage.iUri == 9010) {
                        ReplayPresenterInLiveNotify presenterInLiveNotify = new ReplayPresenterInLiveNotify();
                        presenterInLiveNotify.readFrom(jceInputStream);
                        if (presenterInLiveNotify.lUid == PRESENTER_ID && !mIsLiving) {
                            showNotification("频道信息", "正在查询频道信息");
                            WupService.getInstance().getLivingInfo(PRESENTER_ID);
                        }
                    } else if (pushMessage.iUri == 7504) {
                        PresenterEndGameNotice presenterEndGameNotice = new PresenterEndGameNotice();
                        presenterEndGameNotice.readFrom(jceInputStream);
                        System.out.println(CommonLib.display(presenterEndGameNotice));
                    } else if (pushMessage.iUri == 1025605) {
                        LiveRoomTransferNotice liveRoomTransferNotice = new LiveRoomTransferNotice();
                        liveRoomTransferNotice.readFrom(jceInputStream);
                        if (liveRoomTransferNotice.tNotice.lPresenterUid == PRESENTER_ID && !mIsLiving) {
                            showNotification("频道信息", "正在查询频道信息");
                            WupService.getInstance().getLivingInfo(PRESENTER_ID);
                        }
                    } else if (pushMessage.iUri == 6604) {
                        TreasureUpdateNotice treasureUpdateNotice = new TreasureUpdateNotice();
                        treasureUpdateNotice.readFrom(jceInputStream);
                        System.out.println(CommonLib.display(treasureUpdateNotice));

                    }
                    break;
                case 9:
                    WSDeRegisterRsp wsDeRegisterRsp = new WSDeRegisterRsp();
                    wsDeRegisterRsp.readFrom(new JceInputStream(var3.vData));
                    logger.info("resister rsp:" + CommonLib.display(wsDeRegisterRsp));
                    break;
                case 11: {//EWSCmdS2C_VerifyCookieRsp
                    JceInputStream in = CommonLib.in(var3.vData);
                    WSVerifyCookieRsp wsVerifyCookieRsp = new WSVerifyCookieRsp();
                    wsVerifyCookieRsp.readFrom(in);
                    mLoginSuccessful = wsVerifyCookieRsp.iValidate == 0;
                    if (!mLoginSuccessful) {
                        PropertiesComponent.getInstance().setValue("biztoken", null);
                    }
                    logger.info("VerifyCookie Result:" + mLoginSuccessful);
                    EventBus.getDefault().post(new SocketLoginFinished(mLoginSuccessful));
                    WupService.getInstance().getLivingInfo(PRESENTER_ID);
                    showNotification("用户登录", mLoginSuccessful ? "登录成功,正在查询频道信息" : "登录失败,正在查询频道信息");
                }
                break;
                case 17: {
                    JceInputStream inputStream = CommonLib.in(var3.vData);
                    WSRegisterGroupRsp wsRegisterGroupRsp = new WSRegisterGroupRsp();
                    wsRegisterGroupRsp.readFrom(inputStream);
                    System.out.println(CommonLib.display(wsRegisterGroupRsp));
                    if (wsRegisterGroupRsp.iResCode == 0) {
                        enterChannel(mChannelId, mSubChannelId);
                    } else {
                        reconnect();
                    }
                }
                break;
                case 19: {
                    JceInputStream inputStream = CommonLib.in(var3.vData);
                    WSUnRegisterGroupRsp unRegisterGroupRsp = new WSUnRegisterGroupRsp();
                    unRegisterGroupRsp.readFrom(inputStream);
                    System.out.println(CommonLib.display(unRegisterGroupRsp));
                    if (mChannelId != 0 && mSubChannelId != 0) {
                        register(mChannelId, mSubChannelId);
                    }
                }
            }
        }

        public void onOpen(WebSocket webSocket, Response response) {
            mConnectSuccessful = true;
            logger.info("websocket opened");
            performCookieLogin();
        }
    }


    private void startUserHeartbeat(int interval) {
        this.mHeartbeatInterval = interval;
        if (mConnectDisposable != null && !mConnectDisposable.isDisposed()) {
            mConnectDisposable.dispose();
        }
        if (mHeartBeatDisposable != null && !mHeartBeatDisposable.isDisposed()) {
            mHeartBeatDisposable.dispose();
        }
        mHeartBeatDisposable = Schedulers.io().scheduleDirect(mHeartBeatRunnable);
    }

    private void performCookieLogin() {
        WSVerifyCookieReq wsVerifyCookieReq = new WSVerifyCookieReq();
        String uid = PropertiesComponent.getInstance().getValue("uid");
        String biztoken = PropertiesComponent.getInstance().getValue("biztoken");
        if (uid == null || biztoken == null) {
            System.out.println("uid =" + uid + ",biztoken=" + biztoken);
            EventBus.getDefault().post(new SocketLoginFinished(false));
            showNotification("用户登录", "登录失败,正在查询频道信息");
            WupService.getInstance().getLivingInfo(PRESENTER_ID);
            return;
        }
        showNotification("用户登录", "正在验证用户信息,请稍等");
        logger.info("uid" + uid);
        System.out.println("正在通过cookie登录");
        wsVerifyCookieReq.sGuid = PropertiesComponent.getInstance().getValue("guid");
        wsVerifyCookieReq.sCookie = "udb_uid=" + uid + "; udb_biztoken=" + biztoken;
        wsVerifyCookieReq.sUA = "XiaoHuYaWebSocket";
        wsVerifyCookieReq.lUid = Long.parseLong(uid);
        wsVerifyCookieReq.bAutoRegisterUid = 1;
        JceOutputStream out = CommonLib.out();
        wsVerifyCookieReq.writeTo(out);
        WebSocketCommand webSocketCommand = new WebSocketCommand();
        webSocketCommand.iCmdType = 10;//EWSCmdC2S_VerifyCookieReq: 10,
        webSocketCommand.vData = out.toByteArray();
        JceOutputStream out1 = CommonLib.out();
        webSocketCommand.writeTo(out1);
        mWebSocket.send(ByteString.of(out1.toByteArray()));
    }

    @Override
    public boolean isLoginSuccessful() {
        return mLoginSuccessful;
    }

    @Override
    public boolean isConnectSuccessful() {
        return mConnectSuccessful;
    }

    @Override
    public long getPresenterId() {
        return PRESENTER_ID;
    }

    @Override
    public long getLiveId() {
        return mLiveId;
    }

    @Override
    public long getChannelId() {
        return mChannelId;
    }

    @Override
    public long getSubChannelId() {
        return mSubChannelId;
    }

    @Override
    public void setBroadcastEnabled(boolean broadcastEnabled) {
        mBroadcastEnabled = broadcastEnabled;
    }

    @Override
    public boolean isBroadcastEnabled() {
        return mBroadcastEnabled;
    }

    public void onPresenterBeginLive(BeginLiveNotice beginLiveNotice) {
        new Notification("huya", "开播提醒", "[" + beginLiveNotice.sNick + "] 已开播,直播游戏:[" + beginLiveNotice.sGameName + "]"
                + ",直播内容:[" + beginLiveNotice.sLiveDesc + "]", NotificationType.WARNING).notify(null);
        if (beginLiveNotice.lPresenterUid == PRESENTER_ID) {
            mLiveId = beginLiveNotice.lLiveId;
            mChannelId = beginLiveNotice.lChannelId;
            mSubChannelId = beginLiveNotice.lSubChannelId;
            unRegisterGroup();
        }
    }

    public void onPresenterEndLive(EndLiveNotice endLiveNotice) {
        mSayHello = false;
        String content = CommonLib.getEndLiveContent(endLiveNotice);
        if (endLiveNotice.lPresenterUid == PRESENTER_ID) {
            mIsLiving = false;
            new Notification("huya", "下播提醒", content, NotificationType.INFORMATION).notify(null);
            registerGroup();
        }
    }

    public void onMuteRoomUserRsp(MuteRoomUserRsp muteRoomUserRsp) {
        showNotification("举报管理", muteRoomUserRsp.sMsg);
    }

    public void onSendMessageRsp(SendMessageRsp sendMessageRsp) {
        showNotification("消息发送", sendMessageRsp.iStatus == 0 ? "发送消息成功" : "发送消息失败");
    }

    public void onEnterRoomRsp(UserEventRsp userEventRsp) {
        boolean isLiving = userEventRsp.lTid != 0 && userEventRsp.lSid != 0;
        String content = isLiving ? "进入直播间成功" : "当前主播暂未开播";
        showNotification("进入直播间", content);
        if (isLiving && !mSayHello) {
            mSayHello = true;
            // WupService.getInstance().sendMessage(mChannelId, mSubChannelId, PRESENTER_ID, "");
        }
    }

    private void testVideo() {
        VideoGatewayProxy2VGPingReq videoGatewayProxy2VGPingReq = new VideoGatewayProxy2VGPingReq();
        videoGatewayProxy2VGPingReq.lLocalTime = System.currentTimeMillis() / 1000;
        WupHelper.send("videoGatewayProxy2VGPing", "videogateway", videoGatewayProxy2VGPingReq);
    }

    public void onRMessageNotify(RMessageNotify rMessageNotify) {
        mLiveId = rMessageNotify.lLiveId;
        showNotification("弹幕处理", "有新的举报弹幕需要处理");
    }

    @Override
    public void showNotification(String notification) {
        showNotification(null, notification);
    }

    @Override
    public void showNotification(String title, String notification) {
        new Notification("huya", title, notification, NotificationType.INFORMATION).notify(null);
    }

    @Override
    public void startMonitor() {
        WupService.getInstance().doLaunch();
    }

    private void registerGroup() {
        logger.info("register group");
        WSRegisterGroupReq wsRegisterGroupReq = new WSRegisterGroupReq();
        wsRegisterGroupReq.vGroupId.add("live:" + PRESENTER_ID);
        wsRegisterGroupReq.vGroupId.add("chat:" + PRESENTER_ID);
        JceOutputStream outputStream = CommonLib.out();
        wsRegisterGroupReq.writeTo(outputStream);
        WebSocketCommand webSocketCommand = new WebSocketCommand();
        webSocketCommand.iCmdType = 16;
        webSocketCommand.vData = outputStream.toByteArray();
        outputStream = CommonLib.out();
        webSocketCommand.writeTo(outputStream);
        mWebSocket.send(ByteString.of(outputStream.toByteArray()));
    }

    private void unRegisterGroup() {
        WSUnRegisterGroupReq wsUnRegisterGroupReq = new WSUnRegisterGroupReq();
        JceOutputStream outputStream = CommonLib.out();
        wsUnRegisterGroupReq.writeTo(outputStream);
        WebSocketCommand socketCommand = new WebSocketCommand();
        socketCommand.iCmdType = 18;
        socketCommand.vData = outputStream.toByteArray();
        outputStream = CommonLib.out();
        socketCommand.writeTo(outputStream);
        mWebSocket.send(ByteString.of(outputStream.toByteArray()));
    }

    private void queryUserInfo() {
        WupService.getInstance().getWebdbUserInfo();
    }

    private void queryTreasureInfo() {
        WupService.getInstance().getTreasureBoxInfo(PRESENTER_ID);
    }

    private void onReceiveTreasureBoxInfo(GetTreasureBoxInfoRsp treasureBoxInfoRsp) {
        List<BoxTaskInfo> vBoxTaskInfo = treasureBoxInfoRsp.vBoxTaskInfo;
        BoxTaskInfo boxTaskInfo;
        for (int i = 0; i < vBoxTaskInfo.size(); i++) {
            boxTaskInfo = vBoxTaskInfo.get(i);
            if (boxTaskInfo.iStat == 0 && mTreasureBoxIndex == 0) {
                mTreasureBoxIndex = boxTaskInfo.iTaskId;
                break;
                //未开启的宝箱
            }
        }

//        startTreasureBoxLopper();
    }

    private Runnable mTreasureBoxNoticeRunnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("finish treasure task :" + mTreasureBoxIndex + "," + getWebdbUserInfoRsp.tUserInfo.sPassport);
            WupService.getInstance().finishTaskNotice(mChannelId, mSubChannelId, PRESENTER_ID, mTreasureBoxIndex, getWebdbUserInfoRsp.tUserInfo.sPassport);
        }
    };

    private void onReceiveFinishTaskNotice(FinishTaskNoticeRsp finishTaskNoticeRsp) {
        if (finishTaskNoticeRsp.iRspCode == 0) {
            mTreasureBoxIndex = (++finishTaskNoticeRsp.iTaskId);
//            startTreasureBoxLopper();
        }
    }

    private void startTreasureBoxLopper() {
        if (mTreasureBoxIndex < 1 || mTreasureBoxIndex > 6) {
            System.out.println("所有宝箱都计时完毕,将开启所有宝箱.");
            openTreasureBox();
        } else {
            long cdTime = (mTreasureBoxIndex == 1 ? 3 * 60 : 10 * 60) + 5;
            System.out.println("start treasure looper in:" + cdTime + ",taskId:" + mTreasureBoxIndex);
            Schedulers.io().scheduleDirect(mTreasureBoxNoticeRunnable, cdTime, TimeUnit.SECONDS);
        }
    }

    private void openTreasureBox() {

    }
}
