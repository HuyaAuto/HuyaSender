//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.intellij.ide.util.PropertiesComponent;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.UUID;

public class WupService {
    private static WupService ourInstance = new WupService();
    private UserId mUserId = new UserId();

    private WupService() {
    }

    public static WupService getInstance() {
        return ourInstance;
    }

    public void doLaunch() {
        LiveLaunchReq var1 = new LiveLaunchReq();
        var1.tId = this.getUserId();
        WupHelper.send(OkHttpService.getInstance().get(), var1, "doLaunch", "liveui", new LiveLaunchRsp(), false);
    }

    public void getAllCategoryGame() {
        GetMyAllCategoryGameReq var1 = new GetMyAllCategoryGameReq();
        var1.tId = this.getUserId();
        WupHelper.send(var1, "getMyAllCategoryGame", "mobileui", new GetMyAllCategoryGameRsp(), false);
    }

    public void getAssociateKeyword(String var1) {
        GetAssociateKeyWordReq var2 = new GetAssociateKeyWordReq();
        var2.sKeyWord = var1;
        WupHelper.send(var2, "getAssociateKeyWord", "liveui", new GetAssociateKeyWordRsp(), false);
    }

    public void getCdnTokenInfo(String var1, int var2, String var3) {
        GetCdnTokenReq var4 = new GetCdnTokenReq();
        StringBuilder var5 = (new StringBuilder()).append(var1);
        if (var2 == 0) {
            var1 = "";
        } else {
            var1 = "_" + String.valueOf(var2);
        }

        var4.stream_name = var5.append(var1).toString();
        var4.cdn_type = var3;
        WupHelper.send(var4, "getCdnTokenInfo", "liveui", new GetCdnTokenRsp(), false);
    }

    public void getHomePageData() {
        MGetHomePageDataReq var1 = new MGetHomePageDataReq();
        var1.tId = this.getUserId();
        var1.iType = 1;
        WupHelper.send(var1, "getMobileHomePageData", "liveui", new MGetHomePageDataRsp(), false);
    }

    public void getLiveInfoByUids(ArrayList<Long> var1) {
        LiveInfoByUidReq var2 = new LiveInfoByUidReq();
        var2.tId = this.getUserId();
        var2.vUids = var1;
        WupHelper.send(var2, "getLiveInfoListsByUids", "liveui", new LiveInfoByUidRsp(), false);
    }

    public void getLiveListByGameId(int var1, int var2, int var3, int var4) {
        MGetLiveListReq var5 = new MGetLiveListReq();
        var5.tId = this.getUserId();
        var5.iPage = var1;
        var5.iPageSize = var2;
        var5.iSectionId = var3;
        var5.iTag = var4;
        WupHelper.send(var5, "getMLiveList", "liveui", new MGetLiveListRsp(), false);
    }

    public void getLiveSearchResult(String var1, int var2, int var3) {
        GetLivePageInfoReq var4 = new GetLivePageInfoReq();
        var4.iPageNum = var2;
        var4.iPageSize = var3;
        var4.iTerminalType = 2;
        var4.sCacheId = var1;
        WupHelper.send(var4, "getLivePageInfo", "liveui", new GetLivePageInfoRsp(), false);
    }

    public void getLivingInfo(long presenterId) {
        GetLivingInfoReq var5 = new GetLivingInfoReq();
        var5.tId = this.getUserId();
        var5.lPresenterUid = presenterId;
        WupHelper.send(var5, "getLivingInfo", "liveui", new GetLivingInfoRsp(), false);
    }

    public void getPresenterSearchResult(String var1, int var2, int var3) {
        GetPresenterPageInfoReq var4 = new GetPresenterPageInfoReq();
        var4.iLiveState = 0;
        var4.iPageNum = var2;
        var4.iPageSize = var3;
        var4.iTerminalType = 2;
        var4.sCacheId = var1;
        WupHelper.send(var4, "getPresenterPageInfo", "liveui", new GetPresenterPageInfoRsp(), false);
    }

    public void getSearchResult(String var1) {
        GetResultByKeyWordReq var2 = new GetResultByKeyWordReq();
        var2.tId = this.getUserId();
        var2.sKeyWord = var1;
        var2.iPresentPageSize = 8;
        var2.iPresentFirstPageNum = 1;
        var2.iLivePageSize = 12;
        var2.iLiveFirstPageNum = 1;
        var2.iTerminalType = 2;
        var2.iLiveState = 0;
        WupHelper.send(var2, "getResultByKeyWord", "liveui", new GetResultByKeyWordRsp(), false);
    }

    public void getSubscribeList() {
        SubscribeToListReq var1 = new SubscribeToListReq();
        var1.tId = this.getUserId();
        var1.tFrom = new Subscriber();
        var1.tFrom.iType = 1;
        var1.tFrom.sKey = String.valueOf(var1.tId.lUid);
        WupHelper.send(var1, "getSubscribeToPresenterList", "liveui", new SubscribeToPresenterListResp(), false);
    }

    public void getSubscribeStatus(long var1) {
        SubscribeStatusReq var3 = new SubscribeStatusReq();
        var3.tId = this.getUserId();
        var3.tFrom = new Subscriber();
        var3.tFrom.iType = 1;
        var3.tFrom.sKey = "String.valueOf(LoginService.getInstance().getUId());";
        var3.tTo = new Activity();
        var3.tTo.iType = 2;
        var3.tTo.sKey = String.valueOf(var1);
        WupHelper.send(var3, "getSubscribeStatus", "liveui", new SubscribeStatusResp(), false);
    }

    public void getTopHotKey() {
        WupHelper.send(new EmptyReq(), "getFinalHotKeywords", "liveui", new SMGetFinalHotKeywordsRsp(), false);
    }

    public void getUpdateInfo(String var2) {
        GetMobileUpdateInfoReq var3 = new GetMobileUpdateInfoReq();
        var3.tId = this.getUserId();
        var3.sMd5 = var2;
        var3.sSystemMobileInfo = "";
        WupHelper.send(var3, "getMobileUpdateInfo", "mobileui", new GetMobileUpdateInfoRsp(), true);
    }

    public void getUserCardPackage() {
        GetUserCardPackageReq var1 = new GetUserCardPackageReq();
        var1.tId = this.getUserId();
        var1.eSource = 2;
        var1.eTempleteType = 4;
        WupHelper.send(var1, "getUserCardPackage", "liveui", new GetUserCardPackageResp(), false);
    }

    public UserId getUserId() {
        String uid = PropertiesComponent.getInstance().getValue("uid");
        String biztoken = PropertiesComponent.getInstance().getValue("biztoken");
        String guid = PropertiesComponent.getInstance().getValue("guid");
        long lUid = 0;
        String sBiztoken = "";
        String sGuid = null;
        if (uid != null) {
            lUid = Long.parseLong(uid);
        }
        if (biztoken != null) {
            sBiztoken = biztoken;
        }
        if (guid == null) {
            sGuid = UUID.randomUUID().toString();
            PropertiesComponent.getInstance().setValue("guid", sGuid);
        }
        mUserId.lUid = lUid;
        mUserId.sGuid = sGuid;
        mUserId.sCookie = "udb_uid=" + lUid + "; udb_biztoken=" + sBiztoken;
//        mUserId.sCookie = "vplayer_sbanner_77259038_2622305892=1; vplayer_sbanner_0_0=1; __yamid_tt1=0.022256063163378137; __yamid_new=C89EE9B614B00001E7DB80F01A3E151A; udb_guiddata=96e47e91c3f44c90a3c361588f6fbf82; udb_accdata=undefined; SoundValue=0.50; alphaValue=0.80; guid=0acf6cbbd814935d6c79852e862ea338; sdid=; __yasmid=0.022256063163378137; Hm_lvt_51700b6c722f5bb4cf39906a596ea41f=1569996594,1569997273,1569997771,1570004170; udb_passdata=3; PHPSESSID=sq698oqu7ljdar02u9s6pv2mk0; web_qrlogin_confirm_id=6d22f79f-fb6b-4614-965e-6a0456683283; udb_uid=2386489680; yyuid=2386489680; udb_passport=newqq_o1d9y3ofs; username=newqq_o1d9y3ofs; udb_version=1.0; udb_origin=0; udb_status=1; __yaoldyyuid=2386489680; _yasids=__rootsid%3DC89F3FDA039000013A32FBD6D5601CF9; udb_biztoken=AQClulFkDDPq5-hiRotNxu9my1qgypy2wF9vJbuNFfEyYh6_vYLdoaw7VfUx3ORv9KDjQecCO_qY-HE5W8AL810PicjYVlyKeDnKnbC2a2VGjfWgpJ5G-PYEDscGymyq4oBKEb3-uemhZTuAe47oLUdh1ZwyqhFX8a1iUqn6NLyfvJdI5GVFkj_wza02sXBnQs8br2f_GG40sQweIqclQw_gDd9sfO0EQr4ItjEq29ONYkmu-0BRwZ7crT0kSZDNaQ4AUQeyE_IwieGlP2NfSLEp-0MelnAT2c3Tn9aOIGEktLzyadMROPYZ5gSklkLF0MkwVPzZOc1LdygwS4qcoOdy; isInLiveRoom=true; Hm_lpvt_51700b6c722f5bb4cf39906a596ea41f=1570020743; h_unt=1570080870";
        mUserId.sHuYaUA = "webh5&" + "1.0" + "&websocket";
//        mUserId.sHuYaUA = "webh5&1909301546&websocket";
        mUserId.iTokenType = 0;
//        mUserId.sGuid="0acf6cbbd814935d6c79852e862ea338";
//        System.out.println("sCookies:" + mUserId.sCookie);
//        System.out.println("guid:" + mUserId.sGuid);
        return this.mUserId;
    }

    public void getWebdbUserInfo() {
        GetWebdbUserInfoReq var3 = new GetWebdbUserInfoReq();
        var3.lUid = getUserId().lUid;
        WupHelper.send(var3, "getWebdbUserInfo", "liveui", new GetWebdbUserInfoRsp(), false);
    }

    public void init() {
    }

    public void reportUpdateResult(int var2, int var3) {
        ReportMobileUpdateResultReq var4 = new ReportMobileUpdateResultReq();
        var4.tId = this.getUserId();
        var4.iRuleId = var2;
        var4.iType = var3;
        var4.sSystemMobileInfo = "";
        WupHelper.send(var4, "reportMobileUpdateResult", "mobileui", null, false);
    }

    public void sendMessage(long tid, long sid, long pid, String content) {
        SendMessageReq var8 = new SendMessageReq();
        var8.tUserId = this.getUserId();
        var8.lTid = tid;
        var8.lSid = sid;
        var8.sContent = content;
        var8.iShowMode = 0;
        var8.lPid = pid;
        var8.tBulletFormat = new BulletFormat();
        var8.tBulletFormat.iFontColor = -1;
        var8.tBulletFormat.iFontSize = 16;
        var8.tFormat = new ContentFormat();
        var8.tFormat.iFontColor = -1;
        var8.tFormat.iFontSize = 16;
        WupHelper.send(var8, "sendMessage", "liveui", new SendMessageRsp(), true);
    }

    public void subscribe(long var1, boolean var3) {
        SubscribeReq var5 = new SubscribeReq();
        var5.tId = this.getUserId();
        byte var4;
        if (var3) {
            var4 = 1;
        } else {
            var4 = 2;
        }

        var5.iAction = var4;
        var5.tFrom = new Subscriber();
        var5.tFrom.iType = 1;
        var5.tFrom.sKey = "";
        var5.tTo = new Activity();
        var5.tTo.iType = 2;
        var5.tTo.sKey = String.valueOf(var1);
        WupHelper.send(var5, "subscribe", "liveui", new SubscribeResp(), false);
    }

    public void muteRoomUser(String text, int mutedTime, long presenterUid, long uid, long sid, int mutedAction, int reasonType) {
        MuteRoomUserReq muteRoomUserReq = new MuteRoomUserReq();
        muteRoomUserReq.tId = getUserId();
//        muteRoomUserReq.sReason = "恶意刷屏";
        muteRoomUserReq.sText = text;
        muteRoomUserReq.lPresenterUid = presenterUid;
        muteRoomUserReq.lUid = uid;
        muteRoomUserReq.lSubcid = sid;
        muteRoomUserReq.iMutedTime = mutedTime;
        muteRoomUserReq.iMutedAction = mutedAction;
        muteRoomUserReq.iReasonType = reasonType;
        WupHelper.send("muteRoomUser", "liveui", muteRoomUserReq);
    }

    public void getRMessageList(long liveId, long pid, long tid, long sid) {
        GetRMessageListReq getRMessageListReq = new GetRMessageListReq();
        getRMessageListReq.tId = getUserId();
        RMessageScene rMessageScene = new RMessageScene();
        rMessageScene.lLiveId = liveId;
        rMessageScene.lPid = pid;
        rMessageScene.lTid = tid;
        rMessageScene.lSid = sid;
        getRMessageListReq.tScene = rMessageScene;
        WupHelper.send("getRMessageList", "mobileui", getRMessageListReq);
    }

//      vplayer.sendWup2("huyauserui", "getTreasureBoxInfo", tbreq, onGetTreasureBoxInfo)

    public void getTreasureBoxInfo(long pid) {
        GetTreasureBoxInfoReq getTreasureBoxInfoReq = new GetTreasureBoxInfoReq();
        getTreasureBoxInfoReq.tId = getUserId();
        getTreasureBoxInfoReq.lPid = pid;
        WupHelper.send("getTreasureBoxInfo", "huyauserui", getTreasureBoxInfoReq);
    }

    //  t.sendWup2("PropsUIServer", "consumeGift", l, m)
    public void consumeGift(long sid, long subsid, long pid) {
        ConsumeGiftReq consumeGiftReq = new ConsumeGiftReq();
        consumeGiftReq.tId = getUserId();
        consumeGiftReq.lSid = sid;
        consumeGiftReq.lSubSid = subsid;
        consumeGiftReq.lPresenterUid = pid;

        WupHelper.send("consumeGift", "PropsUIServer", consumeGiftReq);
    }

    public void queryTreasureCountDown(long sid, long subsid, long pid, long roomId, int fromType) {
        QueryTreasureInfoReq queryTreasureInfoReq = new QueryTreasureInfoReq();
        queryTreasureInfoReq.tId = getUserId();
        queryTreasureInfoReq.lSid = sid;
        queryTreasureInfoReq.lSubSid = subsid;
        queryTreasureInfoReq.lPid = pid;
        queryTreasureInfoReq.lRoomId = roomId;
        queryTreasureInfoReq.iFromType = fromType;
        WupHelper.send("queryTreasure", "liveui", queryTreasureInfoReq);
    }

    public void awardBox(long sid, long subsid, int taskId, long pid, String passport) {
        AwardBoxPrizeReq awardBoxPrizeReq = new AwardBoxPrizeReq();
        awardBoxPrizeReq.tId = getUserId();
        awardBoxPrizeReq.lSid = sid;
        awardBoxPrizeReq.lSubSid = subsid;
        awardBoxPrizeReq.iTaskId = taskId;
        awardBoxPrizeReq.sPassport = passport;
        awardBoxPrizeReq.iFromType = 6;
        awardBoxPrizeReq.fVersion = 4;
        awardBoxPrizeReq.sTime = String.valueOf(System.currentTimeMillis());
        awardBoxPrizeReq.lPid = pid;
        awardBoxPrizeReq.sMd5 = md5(awardBoxPrizeReq.tId.lUid + awardBoxPrizeReq.lSid + awardBoxPrizeReq.lSubSid + awardBoxPrizeReq.iTaskId + awardBoxPrizeReq.sPassport + awardBoxPrizeReq.iFromType + awardBoxPrizeReq.fVersion + awardBoxPrizeReq.sTime);
        awardBoxPrizeReq.iPrizeType = 0;
        WupHelper.send("awardBoxPrize", "huyauserui", awardBoxPrizeReq);
    }

    public static String md5(String text) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(text.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new RuntimeException("MD5加密出现错误");
        }
    }

    public void finishTaskNotice(long sid, long subsid, long pid, int taskId, String passport) {
        FinishTaskNoticeReq finishTaskNoticeReq = new FinishTaskNoticeReq();
        finishTaskNoticeReq.tId = getUserId();
        finishTaskNoticeReq.lSid = sid;
        finishTaskNoticeReq.lSubSid = subsid;
        finishTaskNoticeReq.lPid = pid;
        finishTaskNoticeReq.iTaskId = taskId;
        finishTaskNoticeReq.sPassport = passport;
        finishTaskNoticeReq.iFromType = 6;
        finishTaskNoticeReq.fVersion = 1.1f;
        finishTaskNoticeReq.sTime = String.valueOf(System.currentTimeMillis());
        String s = finishTaskNoticeReq.tId.lUid + finishTaskNoticeReq.lSid + finishTaskNoticeReq.lSubSid + finishTaskNoticeReq.iTaskId + finishTaskNoticeReq.sPassport + finishTaskNoticeReq.iFromType + finishTaskNoticeReq.fVersion + finishTaskNoticeReq.sTime;
        finishTaskNoticeReq.sMd5 = md5(s);
        System.out.println("P:" + s);
        System.out.println("md5" + finishTaskNoticeReq.sMd5);
        WupHelper.send("finishTaskNotice", "huyauserui", finishTaskNoticeReq);
    }
}
