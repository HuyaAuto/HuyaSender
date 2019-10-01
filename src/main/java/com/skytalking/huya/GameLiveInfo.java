//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GameLiveInfo extends JceStruct implements Cloneable {
    static int cache_eGender;
    static ArrayList<GameLiveTag> cache_vGameTags;
    static ArrayList<GameLiveTag> cache_vPresenterTags;
    public boolean bCertified;
    public boolean bIsCameraOpen;
    public boolean bIsRoomSecret;
    public int eGender;
    public int iActivityCount;
    public int iAid;
    public int iAttendeeCount = 0;
    public int iBitRate;
    public int iCdnAttendee;
    public int iChannelType;
    public int iCodecType;
    public int iEndTime;
    public int iExeGameId;
    public int iFrameRate;
    public int iGameId = 0;
    public int iGameType;
    public int iIsMultiStream;
    public int iLevel;
    public int iRecType;
    public int iResolution;
    public int iScreenType;
    public int iShortChannel = 0;
    public int iSourceType;
    public int iStartTime;
    public int iStreamType;
    public long lChannelId = 0L;
    public long lExp;
    public long lLiveCompatibleFlag;
    public long lLiveId = 0L;
    public long lMultiStreamFlag;
    public long lSignChannel;
    public long lSubchannel = 0L;
    public long lUid = 0L;
    public long lYYId;
    public String sAvatarUrl;
    public String sGameName = "";
    public String sGameShortName;
    public String sLiveDesc;
    public String sLocation;
    public String sNick;
    public String sPrivateHost;
    public String sReplayHls;
    public String sSubchannelName = "";
    public String sTraceId;
    public String sVideoCaptureUrl;
    public ArrayList<GameLiveTag> vGameTags;
    public ArrayList<GameLiveTag> vPresenterTags;

    public GameLiveInfo() {
        this.eGender = EGender.MALE.value();
        this.iAid = 0;
        this.sNick = "";
        this.sAvatarUrl = "";
        this.iStartTime = 0;
        this.iEndTime = 0;
        this.iSourceType = 0;
        this.bIsCameraOpen = false;
        this.bIsRoomSecret = false;
        this.sVideoCaptureUrl = "";
        this.iCdnAttendee = 0;
        this.lYYId = 0L;
        this.bCertified = false;
        this.iRecType = 0;
        this.lSignChannel = 0L;
        this.sLiveDesc = "";
        this.iLevel = 0;
        this.sGameShortName = "";
        this.iGameType = 0;
        this.sPrivateHost = "";
        this.iActivityCount = 0;
        this.iStreamType = 0;
        this.iBitRate = 0;
        this.iResolution = 0;
        this.iFrameRate = 0;
        this.iIsMultiStream = 0;
        this.iExeGameId = 0;
        this.lExp = 0L;
        this.sReplayHls = "";
        this.lMultiStreamFlag = 0L;
        this.iScreenType = 0;
        this.iChannelType = 0;
        this.sLocation = "";
        this.iCodecType = 0;
        this.vPresenterTags = null;
        this.vGameTags = null;
        this.lLiveCompatibleFlag = 0L;
        this.sTraceId = "";
    }

    public GameLiveInfo(long var1, long var3, long var5, int var7, long var8, String var10, int var11, String var12, int var13, int var14, int var15, String var16, String var17, int var18, int var19, int var20, boolean var21, boolean var22, String var23, int var24, long var25, boolean var27, int var28, long var29, String var31, int var32, String var33, int var34, String var35, int var36, int var37, int var38, int var39, int var40, int var41, int var42, long var43, String var45, long var46, int var48, int var49, String var50, int var51, ArrayList<GameLiveTag> var52, ArrayList<GameLiveTag> var53, long var54, String var56) {
        this.eGender = EGender.MALE.value();
        this.iAid = 0;
        this.sNick = "";
        this.sAvatarUrl = "";
        this.iStartTime = 0;
        this.iEndTime = 0;
        this.iSourceType = 0;
        this.bIsCameraOpen = false;
        this.bIsRoomSecret = false;
        this.sVideoCaptureUrl = "";
        this.iCdnAttendee = 0;
        this.lYYId = 0L;
        this.bCertified = false;
        this.iRecType = 0;
        this.lSignChannel = 0L;
        this.sLiveDesc = "";
        this.iLevel = 0;
        this.sGameShortName = "";
        this.iGameType = 0;
        this.sPrivateHost = "";
        this.iActivityCount = 0;
        this.iStreamType = 0;
        this.iBitRate = 0;
        this.iResolution = 0;
        this.iFrameRate = 0;
        this.iIsMultiStream = 0;
        this.iExeGameId = 0;
        this.lExp = 0L;
        this.sReplayHls = "";
        this.lMultiStreamFlag = 0L;
        this.iScreenType = 0;
        this.iChannelType = 0;
        this.sLocation = "";
        this.iCodecType = 0;
        this.vPresenterTags = null;
        this.vGameTags = null;
        this.lLiveCompatibleFlag = 0L;
        this.sTraceId = "";
        this.lLiveId = var1;
        this.lUid = var3;
        this.lChannelId = var5;
        this.iShortChannel = var7;
        this.lSubchannel = var8;
        this.sSubchannelName = var10;
        this.iGameId = var11;
        this.sGameName = var12;
        this.iAttendeeCount = var13;
        this.eGender = var14;
        this.iAid = var15;
        this.sNick = var16;
        this.sAvatarUrl = var17;
        this.iStartTime = var18;
        this.iEndTime = var19;
        this.iSourceType = var20;
        this.bIsCameraOpen = var21;
        this.bIsRoomSecret = var22;
        this.sVideoCaptureUrl = var23;
        this.iCdnAttendee = var24;
        this.lYYId = var25;
        this.bCertified = var27;
        this.iRecType = var28;
        this.lSignChannel = var29;
        this.sLiveDesc = var31;
        this.iLevel = var32;
        this.sGameShortName = var33;
        this.iGameType = var34;
        this.sPrivateHost = var35;
        this.iActivityCount = var36;
        this.iStreamType = var37;
        this.iBitRate = var38;
        this.iResolution = var39;
        this.iFrameRate = var40;
        this.iIsMultiStream = var41;
        this.iExeGameId = var42;
        this.lExp = var43;
        this.sReplayHls = var45;
        this.lMultiStreamFlag = var46;
        this.iScreenType = var48;
        this.iChannelType = var49;
        this.sLocation = var50;
        this.iCodecType = var51;
        this.vPresenterTags = var52;
        this.vGameTags = var53;
        this.lLiveCompatibleFlag = var54;
        this.sTraceId = var56;
    }

    public String className() {
        return "HUYA.GameLiveInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lLiveId, "lLiveId");
        var3.display(this.lUid, "lUid");
        var3.display(this.lChannelId, "lChannelId");
        var3.display(this.iShortChannel, "iShortChannel");
        var3.display(this.lSubchannel, "lSubchannel");
        var3.display(this.sSubchannelName, "sSubchannelName");
        var3.display(this.iGameId, "iGameId");
        var3.display(this.sGameName, "sGameName");
        var3.display(this.iAttendeeCount, "iAttendeeCount");
        var3.display(this.eGender, "eGender");
        var3.display(this.iAid, "iAid");
        var3.display(this.sNick, "sNick");
        var3.display(this.sAvatarUrl, "sAvatarUrl");
        var3.display(this.iStartTime, "iStartTime");
        var3.display(this.iEndTime, "iEndTime");
        var3.display(this.iSourceType, "iSourceType");
        var3.display(this.bIsCameraOpen, "bIsCameraOpen");
        var3.display(this.bIsRoomSecret, "bIsRoomSecret");
        var3.display(this.sVideoCaptureUrl, "sVideoCaptureUrl");
        var3.display(this.iCdnAttendee, "iCdnAttendee");
        var3.display(this.lYYId, "lYYId");
        var3.display(this.bCertified, "bCertified");
        var3.display(this.iRecType, "iRecType");
        var3.display(this.lSignChannel, "lSignChannel");
        var3.display(this.sLiveDesc, "sLiveDesc");
        var3.display(this.iLevel, "iLevel");
        var3.display(this.sGameShortName, "sGameShortName");
        var3.display(this.iGameType, "iGameType");
        var3.display(this.sPrivateHost, "sPrivateHost");
        var3.display(this.iActivityCount, "iActivityCount");
        var3.display(this.iStreamType, "iStreamType");
        var3.display(this.iBitRate, "iBitRate");
        var3.display(this.iResolution, "iResolution");
        var3.display(this.iFrameRate, "iFrameRate");
        var3.display(this.iIsMultiStream, "iIsMultiStream");
        var3.display(this.iExeGameId, "iExeGameId");
        var3.display(this.lExp, "lExp");
        var3.display(this.sReplayHls, "sReplayHls");
        var3.display(this.lMultiStreamFlag, "lMultiStreamFlag");
        var3.display(this.iScreenType, "iScreenType");
        var3.display(this.iChannelType, "iChannelType");
        var3.display(this.sLocation, "sLocation");
        var3.display(this.iCodecType, "iCodecType");
        var3.display(this.vPresenterTags, "vPresenterTags");
        var3.display(this.vGameTags, "vGameTags");
        var3.display(this.lLiveCompatibleFlag, "lLiveCompatibleFlag");
        var3.display(this.sTraceId, "sTraceId");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GameLiveInfo var2 = (GameLiveInfo)var1;
                if (JceUtil.equals(this.lLiveId, var2.lLiveId) && JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.lChannelId, var2.lChannelId) && JceUtil.equals(this.iShortChannel, var2.iShortChannel) && JceUtil.equals(this.lSubchannel, var2.lSubchannel) && JceUtil.equals(this.sSubchannelName, var2.sSubchannelName) && JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.iAttendeeCount, var2.iAttendeeCount) && JceUtil.equals(this.eGender, var2.eGender) && JceUtil.equals(this.iAid, var2.iAid) && JceUtil.equals(this.sNick, var2.sNick) && JceUtil.equals(this.sAvatarUrl, var2.sAvatarUrl) && JceUtil.equals(this.iStartTime, var2.iStartTime) && JceUtil.equals(this.iEndTime, var2.iEndTime) && JceUtil.equals(this.iSourceType, var2.iSourceType) && JceUtil.equals(this.bIsCameraOpen, var2.bIsCameraOpen) && JceUtil.equals(this.bIsRoomSecret, var2.bIsRoomSecret) && JceUtil.equals(this.sVideoCaptureUrl, var2.sVideoCaptureUrl) && JceUtil.equals(this.iCdnAttendee, var2.iCdnAttendee) && JceUtil.equals(this.lYYId, var2.lYYId) && JceUtil.equals(this.bCertified, var2.bCertified) && JceUtil.equals(this.iRecType, var2.iRecType) && JceUtil.equals(this.lSignChannel, var2.lSignChannel) && JceUtil.equals(this.sLiveDesc, var2.sLiveDesc) && JceUtil.equals(this.iLevel, var2.iLevel) && JceUtil.equals(this.sGameShortName, var2.sGameShortName) && JceUtil.equals(this.iGameType, var2.iGameType) && JceUtil.equals(this.sPrivateHost, var2.sPrivateHost) && JceUtil.equals(this.iActivityCount, var2.iActivityCount) && JceUtil.equals(this.iStreamType, var2.iStreamType) && JceUtil.equals(this.iBitRate, var2.iBitRate) && JceUtil.equals(this.iResolution, var2.iResolution) && JceUtil.equals(this.iFrameRate, var2.iFrameRate) && JceUtil.equals(this.iIsMultiStream, var2.iIsMultiStream) && JceUtil.equals(this.iExeGameId, var2.iExeGameId) && JceUtil.equals(this.lExp, var2.lExp) && JceUtil.equals(this.sReplayHls, var2.sReplayHls) && JceUtil.equals(this.lMultiStreamFlag, var2.lMultiStreamFlag) && JceUtil.equals(this.iScreenType, var2.iScreenType) && JceUtil.equals(this.iChannelType, var2.iChannelType) && JceUtil.equals(this.sLocation, var2.sLocation) && JceUtil.equals(this.iCodecType, var2.iCodecType) && JceUtil.equals(this.vPresenterTags, var2.vPresenterTags) && JceUtil.equals(this.vGameTags, var2.vGameTags) && JceUtil.equals(this.lLiveCompatibleFlag, var2.lLiveCompatibleFlag) && JceUtil.equals(this.sTraceId, var2.sTraceId)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GameLiveInfo";
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception var2) {
            var2.printStackTrace();
            return 0;
        }
    }

    public void readFrom(JceInputStream var1) {
        this.lLiveId = var1.read(this.lLiveId, 0, false);
        this.lUid = var1.read(this.lUid, 1, false);
        this.lChannelId = var1.read(this.lChannelId, 2, false);
        this.iShortChannel = var1.read(this.iShortChannel, 3, false);
        this.lSubchannel = var1.read(this.lSubchannel, 4, false);
        this.sSubchannelName = var1.readString(5, false);
        this.iGameId = var1.read(this.iGameId, 6, false);
        this.sGameName = var1.readString(7, false);
        this.iAttendeeCount = var1.read(this.iAttendeeCount, 8, false);
        this.eGender = var1.read(this.eGender, 9, false);
        this.iAid = var1.read(this.iAid, 10, false);
        this.sNick = var1.readString(11, false);
        this.sAvatarUrl = var1.readString(12, false);
        this.iStartTime = var1.read(this.iStartTime, 13, false);
        this.iEndTime = var1.read(this.iEndTime, 14, false);
        this.iSourceType = var1.read(this.iSourceType, 15, false);
        this.bIsCameraOpen = var1.read(this.bIsCameraOpen, 16, false);
        this.bIsRoomSecret = var1.read(this.bIsRoomSecret, 17, false);
        this.sVideoCaptureUrl = var1.readString(18, false);
        this.iCdnAttendee = var1.read(this.iCdnAttendee, 19, false);
        this.lYYId = var1.read(this.lYYId, 20, false);
        this.bCertified = var1.read(this.bCertified, 21, false);
        this.iRecType = var1.read(this.iRecType, 22, false);
        this.lSignChannel = var1.read(this.lSignChannel, 23, false);
        this.sLiveDesc = var1.readString(24, false);
        this.iLevel = var1.read(this.iLevel, 25, false);
        this.sGameShortName = var1.readString(26, false);
        this.iGameType = var1.read(this.iGameType, 27, false);
        this.sPrivateHost = var1.readString(28, false);
        this.iActivityCount = var1.read(this.iActivityCount, 29, false);
        this.iStreamType = var1.read(this.iStreamType, 30, false);
        this.iBitRate = var1.read(this.iBitRate, 31, false);
        this.iResolution = var1.read(this.iResolution, 32, false);
        this.iFrameRate = var1.read(this.iFrameRate, 33, false);
        this.iIsMultiStream = var1.read(this.iIsMultiStream, 34, false);
        this.iExeGameId = var1.read(this.iExeGameId, 35, false);
        this.lExp = var1.read(this.lExp, 36, false);
        this.sReplayHls = var1.readString(37, false);
        this.lMultiStreamFlag = var1.read(this.lMultiStreamFlag, 38, false);
        this.iScreenType = var1.read(this.iScreenType, 39, false);
        this.iChannelType = var1.read(this.iChannelType, 40, false);
        this.sLocation = var1.readString(41, false);
        this.iCodecType = var1.read(this.iCodecType, 42, false);
        GameLiveTag var2;
        if (cache_vPresenterTags == null) {
            cache_vPresenterTags = new ArrayList();
            var2 = new GameLiveTag();
            cache_vPresenterTags.add(var2);
        }

        this.vPresenterTags = (ArrayList)var1.read(cache_vPresenterTags, 43, false);
        if (cache_vGameTags == null) {
            cache_vGameTags = new ArrayList();
            var2 = new GameLiveTag();
            cache_vGameTags.add(var2);
        }

        this.vGameTags = (ArrayList)var1.read(cache_vGameTags, 44, false);
        this.lLiveCompatibleFlag = var1.read(this.lLiveCompatibleFlag, 45, false);
        this.sTraceId = var1.readString(46, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lLiveId, 0);
        var1.write(this.lUid, 1);
        var1.write(this.lChannelId, 2);
        var1.write(this.iShortChannel, 3);
        var1.write(this.lSubchannel, 4);
        if (this.sSubchannelName != null) {
            var1.write(this.sSubchannelName, 5);
        }

        var1.write(this.iGameId, 6);
        if (this.sGameName != null) {
            var1.write(this.sGameName, 7);
        }

        var1.write(this.iAttendeeCount, 8);
        var1.write(this.eGender, 9);
        var1.write(this.iAid, 10);
        if (this.sNick != null) {
            var1.write(this.sNick, 11);
        }

        if (this.sAvatarUrl != null) {
            var1.write(this.sAvatarUrl, 12);
        }

        var1.write(this.iStartTime, 13);
        var1.write(this.iEndTime, 14);
        var1.write(this.iSourceType, 15);
        var1.write(this.bIsCameraOpen, 16);
        var1.write(this.bIsRoomSecret, 17);
        if (this.sVideoCaptureUrl != null) {
            var1.write(this.sVideoCaptureUrl, 18);
        }

        var1.write(this.iCdnAttendee, 19);
        var1.write(this.lYYId, 20);
        var1.write(this.bCertified, 21);
        var1.write(this.iRecType, 22);
        var1.write(this.lSignChannel, 23);
        if (this.sLiveDesc != null) {
            var1.write(this.sLiveDesc, 24);
        }

        var1.write(this.iLevel, 25);
        if (this.sGameShortName != null) {
            var1.write(this.sGameShortName, 26);
        }

        var1.write(this.iGameType, 27);
        if (this.sPrivateHost != null) {
            var1.write(this.sPrivateHost, 28);
        }

        var1.write(this.iActivityCount, 29);
        var1.write(this.iStreamType, 30);
        var1.write(this.iBitRate, 31);
        var1.write(this.iResolution, 32);
        var1.write(this.iFrameRate, 33);
        var1.write(this.iIsMultiStream, 34);
        var1.write(this.iExeGameId, 35);
        var1.write(this.lExp, 36);
        if (this.sReplayHls != null) {
            var1.write(this.sReplayHls, 37);
        }

        var1.write(this.lMultiStreamFlag, 38);
        var1.write(this.iScreenType, 39);
        var1.write(this.iChannelType, 40);
        if (this.sLocation != null) {
            var1.write(this.sLocation, 41);
        }

        var1.write(this.iCodecType, 42);
        if (this.vPresenterTags != null) {
            var1.write(this.vPresenterTags, 43);
        }

        if (this.vGameTags != null) {
            var1.write(this.vGameTags, 44);
        }

        var1.write(this.lLiveCompatibleFlag, 45);
        if (this.sTraceId != null) {
            var1.write(this.sTraceId, 46);
        }

    }
}
