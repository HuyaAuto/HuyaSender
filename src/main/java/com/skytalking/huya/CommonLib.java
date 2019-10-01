//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.skytalking.windows.HuyaMonitorWindow;
import com.sun.tools.javac.util.JCDiagnostic;
import okhttp3.OkHttpClient;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CommonLib {
    private static CommonLib ourInstance = new CommonLib();
    public static String[] TITLES = new String[]{"", "剑士", "骑士", "领主", "公爵", "君王", "帝皇", "超神·帝皇"};
    public static Map<Integer, String> itemTypes = new HashMap<>();
    static SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间

    static {
        sdf.applyPattern("HH:mm:ss");// a为am/pm的标记
        itemTypes.put(4, "虎粮");
        itemTypes.put(12, "藏宝图");
        itemTypes.put(20102, "生日蛋糕");
        itemTypes.put(20114, "大宝剑");
        itemTypes.put(20198, "绿帽子");
        itemTypes.put(20200, "两周年蛋糕");
        itemTypes.put(20206, "荧光棒");
        itemTypes.put(20218, "跑车");
        itemTypes.put(20241, "项链");
        itemTypes.put(20246, "比基尼");
        itemTypes.put(20253, "飞吻");
        itemTypes.put(20261, "上上签");
        itemTypes.put(20267, "钞票枪");
        itemTypes.put(20269, "虎牙一号");
        itemTypes.put(20271, "魔法书");
        itemTypes.put(20273, "火锅");
        itemTypes.put(20275, "奖杯");
        itemTypes.put(20277, "血瓶");
        itemTypes.put(20279, "前方高能");
        itemTypes.put(20291, "超时空战舰");
        itemTypes.put(20293, "礼盒");
        itemTypes.put(20303, "超时空战舰");
        itemTypes.put(20305, "鸡你太美");
        itemTypes.put(20309, "超时空战舰");
        itemTypes.put(20313, "粉丝卡");
        itemTypes.put(20317, "超粉卡");
        itemTypes.put(20319, "超粉卡");


    }

    private CommonLib() {
    }

    public static String bytesToHexString(byte[] var0) {
        if (var0 == null) {
            return "";
        } else {
            StringBuffer var4 = new StringBuffer();
            int var2 = var0.length;

            for (int var1 = 0; var1 < var2; ++var1) {
                int var3 = var0[var1] & 255;
                if (var3 < 16) {
                    var4.append("0");
                }

                var4.append(Integer.toHexString(var3));
            }

            return var4.toString();
        }
    }


    public static CommonLib getInstance() {
        return ourInstance;
    }


    public static OkHttpClient okHttp() {
        return OkHttpService.getInstance().get();
    }


    public static String sha1(String var0) {
        StringBuffer var1 = new StringBuffer();

        try {
            var1.append(bytesToHexString(MessageDigest.getInstance("SHA1").digest(var0.getBytes())));
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
        }

        return var1.toString();
    }

    public static String getRMessageContent(RMessage rMessage) {
        return rMessage.tBase.sSenderNick + " : " + rMessage.tBase.sContent + " (" + rMessage.tStat.iRCount + ")";
    }

    public static String getEndLiveContent(EndLiveNotice endLiveNotice) {
        return "主播[" + endLiveNotice.lPresenterUid + "]已下播";
    }


    public void init() {
        WupService.getInstance().init();
        OkHttpService.getInstance().init();
    }

    public static JceInputStream in(byte[] bytes) {
        JceInputStream jceInputStream = new JceInputStream(bytes);
        jceInputStream.setServerEncoding("UTF-8");
        return jceInputStream;
    }

    public static JceOutputStream out() {
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.setServerEncoding("UTF-8");
        return jceOutputStream;
    }

    public static String display(JceStruct jceStruct) {
        StringBuilder stringBuilder = new StringBuilder();
        jceStruct.display(stringBuilder, 0);
        String string = stringBuilder.toString();
        try {
            return new String(string.getBytes("UTF-8"), Charset.defaultCharset());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return string;
    }

    public static String getDecoration(ArrayList<DecorationInfo> decorationInfos) {
        StringBuilder stringBuilder = new StringBuilder();
        if (decorationInfos != null && !decorationInfos.isEmpty()) {
            for (DecorationInfo decorationInfo : decorationInfos) {
                JceInputStream jceInputStream = in(decorationInfo.vData);
                if (decorationInfo.iViewType == 0) {//HUYA.EDecorationViewType.kDecorationViewTypeCustomized
                    switch (decorationInfo.iAppId) {
                        case 10000: {//HUYA.EDecorationAppType.kDecorationAppTypeChannel
                            MsgCommDecoChannelRoleInfo msgCommDecoChannelRoleInfo = new MsgCommDecoChannelRoleInfo();
                            msgCommDecoChannelRoleInfo.readFrom(jceInputStream);
//                            stringBuilder.append("频道等级:").append(msgCommDecoChannelRoleInfo.iLevel);
                        }
                        break;
                        case 10090: {//HUYA.EDecorationAppType.kDecorationAppTypeGuildAdmin 工会管理员

                        }
                        break;
                        case 10100: {//HUYA.EDecorationAppType.kDecorationAppTypeAdmin //房管
                            GetUserTypeRsp getUserTypeRsp = new GetUserTypeRsp();
                            //itype==2
                            getUserTypeRsp.readFrom(jceInputStream);
                            if (getUserTypeRsp.iGHManagerType != 0) {
                                //工会管理员
                                stringBuilder.append("[<font color='blue'><strong>管</strong></font>]");
                            } else if (getUserTypeRsp.iType == 2) {
                                stringBuilder.append("[<font color='red'><strong>管</strong></font>]");
                            }
                        }
                        break;
                        case 10150: {//代言团
                            stringBuilder.append("[").append("团").append("]");
                        }
                        break;
                        case 10200: {//HUYA.EDecorationAppType.kDecorationAppTypeNoble
                            NobleBase nobleBase = new NobleBase();
                            nobleBase.readFrom(jceInputStream);
                            String title = TITLES[nobleBase.iLevel];
                            stringBuilder.append("[").append(title).append("]");
                        }
                        break;
                        case 10210: {//KDecorationAppTypeGuildVip 工会贵宾
                            stringBuilder.append("[").append("爷").append("]");
                        }
                        break;
                        case 10300: {//HUYA.EDecorationAppType.kDecorationAppTypeGuard

                        }
                        break;
                        case 10400: {//HUYA.EDecorationAppType.kDecorationAppTypeFans
                            BadgeInfo badgeInfo = new BadgeInfo();
                            badgeInfo.readFrom(jceInputStream);
                            stringBuilder.append("[")
                                    .append(badgeInfo.sBadgeName)
                                    .append(" (")
                                    .append(badgeInfo.iBadgeLevel)
                                    .append("级")
                                    .append(")]");
                            if (badgeInfo.tSuperFansInfo.iSFFlag == 1) {
                                stringBuilder.append("[").append("超粉").append("]");
                            } else if (badgeInfo.tSuperFansInfo.iSFFlag == 2) {
                                stringBuilder.append("[").append("超粉(年)").append("]");
                            }
                        }
                        break;
                        case 10500: {//HUYA.EDecorationAppType.kDecorationAppTypeVIP

                        }
                        break;
                        case 10600: {//HUYA.EDecorationAppType.kDecorationAppTyperPurpleDiamond

                        }
                        break;
                        case 10700: {//HUYA.EDecorationAppType.kDecorationAppTypeStamp

                        }
                        break;
                        case 10800: {// HUYA.EDecorationAppType.KDecorationAppTypeNobleEmoticon

                        }
                        break;

                    }
                } else if (decorationInfo.iViewType == 1) {//HUYA.EDecorationViewType.kDecorationViewTypeText

                } else if (decorationInfo.iViewType == 2) {// HUYA.EDecorationViewType.kDecorationViewTypeIcon
                    MsgCommDecoIcon msgCommDecoIcon = new MsgCommDecoIcon();
                    msgCommDecoIcon.readFrom(jceInputStream);
                    String url = msgCommDecoIcon.sUrl;
                    if (url.contains("diamond.png")) {
                        stringBuilder.append("[粉砖]");
                    }
//                    System.out.println(display(msgCommDecoIcon));
//                    stringBuilder.append("<img src='")
//                            .append(msgCommDecoIcon.sUrl.replace(".png", "_3.png"))
//                            .append("'/>");
//                    switch (decorationInfo.iAppId) {
//                        case 10150: {//代言团
//                            stringBuilder.append("[").append("团").append("]");
//                        }
//                        break;
//                        case 10210: {//KDecorationAppTypeGuildVip 工会贵宾
//                            stringBuilder.append("[").append("爷").append("]");
//                        }
//                        break;
//                        case 10400: {
////                            MsgCommDecoIcon msgCommDecoIcon = new MsgCommDecoIcon();
////                            msgCommDecoIcon.readFrom(jceInputStream);
////                            System.out.println(display(msgCommDecoIcon));
//                        }
//                        break;
//                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String getMessageContent(JceStruct jceStruct) {
        if (jceStruct instanceof MessageNotice) {
            return getMessageNoticeContent((MessageNotice) jceStruct);
        } else if (jceStruct instanceof AuditorRoleChangeNotice) {
            return getAuditorRoleChangeNoticeContent((AuditorRoleChangeNotice) jceStruct);
        } else if (jceStruct instanceof SendItemSubBroadcastPacket) {
            SendItemSubBroadcastPacket broadcastPacket = (SendItemSubBroadcastPacket) jceStruct;
            String gifName;
            if (itemTypes.containsKey((Integer) broadcastPacket.iItemType)) {
                gifName = itemTypes.get(broadcastPacket.iItemType);
            } else {
                gifName = "礼物";
            }
            return broadcastPacket.sSenderNick + " 送出 " + broadcastPacket.iItemCount + " 个" + gifName;
        } else if (jceStruct instanceof SendItemNoticeWordBroadcastPacket) {
            SendItemNoticeWordBroadcastPacket broadcastPacket = (SendItemNoticeWordBroadcastPacket) jceStruct;
            String gifName;
            if (itemTypes.containsKey((Integer) broadcastPacket.iItemType)) {
                gifName = itemTypes.get(broadcastPacket.iItemType);
            } else {
                gifName = "礼物";
            }
            return broadcastPacket.sSenderNick + "为主播 " + broadcastPacket.sPresenterNick + " 送出 " + broadcastPacket.iItemCount + " 个" + gifName;
        } else if (jceStruct instanceof HuyaMonitorWindow.MockJce) {
            return jceStruct.toString();
        }
        return null;
    }

    public static String getMessageNoticeContent(MessageNotice messageNotice) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("[").append(sdf.format(new Date(messageNotice.time))).append("]");
        String prefixDecoration = getDecoration(messageNotice.vDecorationPrefix);
        stringBuilder.append(prefixDecoration);
        stringBuilder.append(" <strong>").append(messageNotice.tUserInfo.sNickName).append("</strong>");
        String suffixDecoration = getDecoration(messageNotice.vDecorationSuffix);
        stringBuilder.append(suffixDecoration);
        stringBuilder.append(": ");
        stringBuilder.append(messageNotice.sContent);
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }

    public static String getAuditorRoleChangeNoticeContent(AuditorRoleChangeNotice auditorRoleChangeNotice) {
        return "<html><font color='red'><strong>" + auditorRoleChangeNotice.sSystemTips + "</strong></font></html>";
    }
/**
 * HUYA.EDecorationAppType = {
 *     kDecorationAppTypeCommon: 100,
 *     kDecorationAppTypeChannel: 1e4,
 *     kDecorationAppTypeGuildAdmin: 10090,
 *     kDecorationAppTypeAdmin: 10100,
 *     kDecorationAppTypeDaiyanClub: 10150,
 *     kDecorationAppTypeNoble: 10200,
 *     KDecorationAppTypeGuildVip: 10210,
 *     kDecorationAppTypeGuard: 10300,
 *     kDecorationAppTypeFans: 10400,
 *     kDecorationAppTypeVIP: 10500,
 *     kDecorationAppTypeUserProfile: 10560,
 *     kDecorationAppTyperPurpleDiamond: 10600,
 *     kDecorationAppTypeStamp: 10700,
 *     KDecorationAppTypeNobleEmoticon: 10800,
 *     KDecorationAppTypePresenter: 10900,
 *     KDecorationAppTypeFirstRecharge: 11e3,
 *     kDecorationAppTypeCheckRoom: 11100,
 *     kDecorationAppTypeTWatch: 11101
 * };
 * HUYA.EDecorationViewType = {
 *     kDecorationViewTypeCustomized: 0,
 *     kDecorationViewTypeText: 1,
 *     kDecorationViewTypeIcon: 2
 * };
 */

/**
 * Object.assign(TafMx.WupMapping, {
 *     OnUserEvent: HUYA.UserEventRsp,
 *     doLaunch: HUYA.LiveLaunchRsp,
 *     getLivingInfo: HUYA.GetLivingInfoRsp,
 *     getWebdbUserInfo: HUYA.GetWebdbUserInfoRsp,
 *     batchGetCdnTokenInfo: HUYA.BatchGetCdnTokenRsp,
 *     getPropsList: HUYA.GetPropsListRsp,
 *     getCurWeekStarPropsIds: HUYA.WeekStarPropsIds,
 *     sendCardPackageItem: HUYA.SendCardPackageItemRsp,
 *     getVerificationStatus: HUYA.GetVerificationStatusResp,
 *     getFirstRechargePkgStatus: HUYA.GetFirstRechargePkgStatusResp,
 *     getPresenterDetail: HUYA.GetPresenterDetailRsp,
 *     OnUserHeartBeat: HUYA.UserHeartBeatRsp,
 *     getCdnTokenInfoEx: HUYA.GetCdnTokenExRsp,
 *     getSequence: HUYA.GetSequenceRsp,
 *     getBatchPropsItem: HUYA.GetBatchPropsItemRsp,
 *     consumeGift: HUYA.ConsumeGiftRsp,
 *     consumeGiftSafe: HUYA.ConsumeGiftSafeRsp,
 *     getVipBarList: HUYA.VipBarListRsp,
 *     getWeekRankList: HUYA.WeekRankListRsp,
 *     muteRoomUser: HUYA.MuteRoomUserRsp,
 *     sendMessage: HUYA.SendMessageRsp,
 *     GetNobleInfo: HUYA.NobleInfoRsp,
 *     queryBadgeInfoList: HUYA.BadgeInfoListRsp,
 *     queryBadgeInfo: HUYA.BadgeInfo,
 *     useBadge: HUYA.BadgeInfo,
 *     getVipCard: HUYA.VipCardRsp,
 *     getScreenSkin: HUYA.getScreenSkinRsp,
 *     getRoomAuditConf: HUYA.GetRoomAuditConfRsp,
 *     getUserLevelInfo: HUYA.GetUserLevelInfoRsp,
 *     getViewerList: HUYA.ViewerListRsp,
 *     getFansSupportList: HUYA.FansSupportListRsp,
 *     sendReplayMessage: HUYA.SendReplayMessageRsp,
 *     getPresenterActivity: HUYA.PresenterActivityRsp,
 *     getRMessageList: HUYA.GetRMessageListRsp,
 *     getRMessageListWb: HUYA.GetRMessageListRsp,
 *     getDirectorProgramList: HUYA.GetDirectorProgramListRsp,
 *     getSuperFansCard: HUYA.GetSuperFansCardRsp,
 *     getSuperFansRankList: HUYA.SuperFansRankListRsp,
 *     reportMessage: HUYA.ReportMessageRsp,
 *     getUserBoxInfo: HUYA.GetUserBoxInfoRsp,
 *     finishTaskNotice: HUYA.FinishTaskNoticeRsp,
 *     awardBoxPrize: HUYA.AwardBoxPrizeRsp,
 *     getTreasureBoxInfo: HUYA.GetTreasureBoxInfoRsp,
 *     bet: HUYA.BetRsp,
 *     buyBet: HUYA.BuyBetRsp,
 *     getGameInfo: HUYA.GetGameInfoListRsp,
 *     getRemainBeanNum: HUYA.GetRemainBeanNumRsp,
 *     getAssistant: HUYA.GetAssistantRsp,
 *     queryCardPackage: HUYA.QueryCardPackageRsp,
 *     queryTreasure: HUYA.QueryTreasureInfoRsp,
 *     sendTreasureLotteryDraw: HUYA.TreasureLotteryDrawRsp,
 *     getLinkMicPresenterListByUid: HUYA.GetLinkMicPresenterInfoRsp,
 *     subscribe: HUYA.SubscribeResp,
 *     unsubscribe: HUYA.UnsubscribeResp,
 *     getSubscribeStatus: HUYA.SubscribeStatusResp,
 *     getRelation: HUYA.GetRelationRsp,
 *     addSubscribe: HUYA.ModRelationRsp,
 *     delSubscribe: HUYA.ModRelationRsp,
 *     getRelationBatch: HUYA.GetRelationBatchRsp,
 *     isPugcRoom: HUYA.IsPugcRoomRsp,
 *     getPugcVipList: HUYA.GetPugcVipListRsp,
 *     getGameLiveHisUpon: HUYA.GetGameLiveHisUponRsp,
 *     getVideoHisUpon: HUYA.GetGameLiveHisUponRsp,
 *     getBadgeName: HUYA.BadgeNameRsp,
 *     getBadgeNameV2: HUYA.BadgeNameRsp,
 *     getLiveAdInfo: HUYA.GetLiveAdInfoRsp,
 *     getAuditorRole: HUYA.AuditorEnterLiveNotice,
 *     getBadgeConfigInfo: HUYA.BadgeConfigInfoRsp,
 *     getCustomBadgeLogo: HUYA.CustomBadgeLogoRsp,
 *     setBadgeV: HUYA.SetBadgeVRsp,
 *     setUserProfile: HUYA.SetUserProfileRsp,
 *     getMaiXuBySid: HUYA.MaiXuSearchRsp,
 *     getOnTVPanel: HUYA.OnTVPanel,
 *     getOnTVUserInfo: HUYA.OnTVUserInfoRsp,
 *     sendOnTVBarrage: HUYA.SendOnTVBarrageRsp,
 *     getBadgeItem: HUYA.BadgeItemRsp,
 *     getCurrentGameAd: HUYA.GameAdvertisement,
 *     getSupportCampInfo: HUYA.SupportCampInfoRsp,
 *     getUserSupportCamp: HUYA.UserSupportCampRsp,
 *     getUserSetting: HUYA.SettingFetchRsp,
 *     getLotteryPanel: HUYA.LotteryPanel,
 *     getLotteryUserInfo: HUYA.LotteryUserInfoRsp,
 *     buyTicket: HUYA.BuyTicketRsp,
 *     getBoxPanelInfo: HUYA.GetBoxPanelInfoRsp,
 *     getUserPrizeRecordList: HUYA.UserPrizeRecordListRsp,
 *     getAwardPoolPanelInfo: HUYA.GiftInventGetPanelInfoRsp,
 *     getGiftInventRankList: HUYA.GetGiftInventRankListRsp,
 *     getPresenterLiveScheduleInfo: HUYA.GetPresenterLiveScheduleInfoRsp,
 *     getPresenterLevelBase: HUYA.PresenterLevelBaseRsp,
 *     getPresenterLevelProgress: HUYA.PresenterLevelProgressRsp,
 *     getActivityMsg: HUYA.ActivityMsgRsp,
 *     getPKSchedule: ActHuyaWulin.PKScheduleRsp,
 *     GetCurCheckRoomStatus: HUYA.CheckRoomStatus,
 *     CKRoomUserEnter: HUYA.CheckRoomRsp,
 *     getFansPrivilege: HUYA.FansPrivilegeRsp,
 *     queryBadgeInfoV2: HUYA.BadgeInfo,
 *     useBadgeV2: HUYA.BadgeInfo,
 *     getDragonInfo: GUESS.GetDragonRsp,
 *     getActivityTorMsg: HUYA.ActivityTorMsgRsp,
 *     getTorMemberTaskResult: ActWatchTor.MemberTaskResultRsp,
 *     startTorPublishTask: ActWatchTor.PublishTaskRsp,
 *     getTorPublishPanel: ActWatchTor.PublishPanelRsp,
 *     queryTorWeekHistory: ActWatchTor.PublishHistoryRsp,
 *     GetBattleTeamInfo: ActLiveCall.GetBattleTeamInfoRsp,
 *     getMeetingStatByPresenterUid: HUYA.GetMeetingStatByUidRsp,
 *     getMakeFriendsPKInfo: HUYA.GetMakeFriendsPKInfoRsp,
 *     getMakeFriendsAnnouncement: HUYA.GetMakeFriendsAnnouncementRsp,
 *     getPresenterMomentFeed: HUYA.GetPresenterMomentFeedRsp,
 *     getUserPanel: QAGuessWatchLive.QAGuessGetUserPanelRsp,
 *     getPresenterAd: HUYA.GetPresenterAdRsp,
 *     getDIYActivityInfo: HUYA.ActivityDIYRsp,
 *     getRctTimedMessage: HUYA.GetRctTimedMessageRsp,
 *     getWBAudienceShare: HUYA.WBAudienceShareRsp,
 *     getJWT: HUYA.GetJWTResp,
 *     getUserExtAuthorizeInfo: HUYA.GetUserExtAuthorizeResp,
 *     userExtAuthorize: HUYA.UserExtAuthorizeResp,
 *     getProfileExtList: HUYA.GetProfileExtListResp,
 *     routeEbsRequest: HUYA.RouteEBSResp,
 *     setStorage: HUYA.SetStorageResp,
 *     getStorageKey: HUYA.GetStorageKeyResp,
 *     delStorageKey: HUYA.DelStorageKeyResp,
 *     getStorageAllKeys: HUYA.GetStorageAllKeysResp,
 *     deliverRoomMsgByUnionId: HUYA.DeliverRoomMsgByUnionIdResp,
 *     textReportSDKFormExt: HUYA.TextReportSDKFormExtResp,
 *     getPicUploadPolicy: HUYA.GetPicUploadPolicyResp,
 *     routeEbsRequestV2: HUYA.RouteEBSV2Resp,
 *     showEntrance: HUYA.ShowEntranceResp,
 *     closeEntrance: HUYA.CloseEntranceResp,
 *     enterPayLiveRoom: HUYA.EnterPayLiveRoomRsp,
 *     subscribePayLiveRoom: HUYA.SubscribePayLiveRoomRsp,
 *     getPayLiveRoomInfo: HUYA.GetPayLiveRoomInfoRsp,
 *     getExpressionEmoticonPackage: HUYA.GetExpressionEmoticonPackageRsp,
 *     sendExpressionEmoticon: HUYA.SendExpressionEmoticonRsp
 * });
 */
}
