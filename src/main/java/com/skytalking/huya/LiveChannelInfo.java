//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class LiveChannelInfo extends JceStruct implements Cloneable {
    public int iAid = 0;
    public int iGameId = 0;
    public int iRecType = 0;
    public int iScreenType = 0;
    public int iSortIdx = 0;
    public int iSourceType = 0;
    public long lAttendeeCount = 0L;
    public long lHuyaRankScore = 0L;
    public long lLiveCompatibleFlag = 0L;
    public int lPimid = 0;
    public long lPopularity = 0L;
    public int lPuid = 0;
    public long lSTid = 0L;
    public long lSid = 0L;
    public long lTid = 0L;
    public String sAvatarUrl = "";
    public String sGameName = "";
    public String sLiveIntro = "";
    public String sName = "";
    public String sNick = "";
    public String sPrivateHost = "";
    public String sScreenshot = "";
    public String sSimpleNick = "";

    public LiveChannelInfo() {
    }

    public LiveChannelInfo(String var1, String var2, long var3, String var5, String var6, long var7, long var9, long var11, String var13, String var14, long var15, int var17, int var18, int var19, int var20, int var21, String var22, int var23, String var24, int var25, long var26, long var28, int var30) {
        this.sName = var1;
        this.sScreenshot = var2;
        this.lPopularity = var3;
        this.sAvatarUrl = var5;
        this.sGameName = var6;
        this.lTid = var7;
        this.lSTid = var9;
        this.lSid = var11;
        this.sLiveIntro = var13;
        this.sNick = var14;
        this.lAttendeeCount = var15;
        this.iGameId = var17;
        this.iSourceType = var18;
        this.lPuid = var19;
        this.lPimid = var20;
        this.iRecType = var21;
        this.sSimpleNick = var22;
        this.iScreenType = var23;
        this.sPrivateHost = var24;
        this.iSortIdx = var25;
        this.lLiveCompatibleFlag = var26;
        this.lHuyaRankScore = var28;
        this.iAid = var30;
    }

    public String className() {
        return "HUYA.LiveChannelInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sName, "sName");
        var3.display(this.sScreenshot, "sScreenshot");
        var3.display(this.lPopularity, "lPopularity");
        var3.display(this.sAvatarUrl, "sAvatarUrl");
        var3.display(this.sGameName, "sGameName");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSTid, "lSTid");
        var3.display(this.lSid, "lSid");
        var3.display(this.sLiveIntro, "sLiveIntro");
        var3.display(this.sNick, "sNick");
        var3.display(this.lAttendeeCount, "lAttendeeCount");
        var3.display(this.iGameId, "iGameId");
        var3.display(this.iSourceType, "iSourceType");
        var3.display(this.lPuid, "lPuid");
        var3.display(this.lPimid, "lPimid");
        var3.display(this.iRecType, "iRecType");
        var3.display(this.sSimpleNick, "sSimpleNick");
        var3.display(this.iScreenType, "iScreenType");
        var3.display(this.sPrivateHost, "sPrivateHost");
        var3.display(this.iSortIdx, "iSortIdx");
        var3.display(this.lLiveCompatibleFlag, "lLiveCompatibleFlag");
        var3.display(this.lHuyaRankScore, "lHuyaRankScore");
        var3.display(this.iAid, "iAid");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveChannelInfo var2 = (LiveChannelInfo)var1;
                if (JceUtil.equals(this.sName, var2.sName) && JceUtil.equals(this.sScreenshot, var2.sScreenshot) && JceUtil.equals(this.lPopularity, var2.lPopularity) && JceUtil.equals(this.sAvatarUrl, var2.sAvatarUrl) && JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.lTid, var2.lTid) && JceUtil.equals(this.lSTid, var2.lSTid) && JceUtil.equals(this.lSid, var2.lSid) && JceUtil.equals(this.sLiveIntro, var2.sLiveIntro) && JceUtil.equals(this.sNick, var2.sNick) && JceUtil.equals(this.lAttendeeCount, var2.lAttendeeCount) && JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.iSourceType, var2.iSourceType) && JceUtil.equals(this.lPuid, var2.lPuid) && JceUtil.equals(this.lPimid, var2.lPimid) && JceUtil.equals(this.iRecType, var2.iRecType) && JceUtil.equals(this.sSimpleNick, var2.sSimpleNick) && JceUtil.equals(this.iScreenType, var2.iScreenType) && JceUtil.equals(this.sPrivateHost, var2.sPrivateHost) && JceUtil.equals(this.iSortIdx, var2.iSortIdx) && JceUtil.equals(this.lLiveCompatibleFlag, var2.lLiveCompatibleFlag) && JceUtil.equals(this.lHuyaRankScore, var2.lHuyaRankScore) && JceUtil.equals(this.iAid, var2.iAid)) {
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
        return "com.duowan.HUYA.LiveChannelInfo";
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
        this.sName = var1.readString(0, false);
        this.sScreenshot = var1.readString(1, false);
        this.lPopularity = var1.read(this.lPopularity, 3, false);
        this.sAvatarUrl = var1.readString(4, false);
        this.sGameName = var1.readString(5, false);
        this.lTid = var1.read(this.lTid, 6, false);
        this.lSTid = var1.read(this.lSTid, 7, false);
        this.lSid = var1.read(this.lSid, 8, false);
        this.sLiveIntro = var1.readString(9, false);
        this.sNick = var1.readString(10, false);
        this.lAttendeeCount = var1.read(this.lAttendeeCount, 11, false);
        this.iGameId = var1.read(this.iGameId, 12, false);
        this.iSourceType = var1.read(this.iSourceType, 13, false);
        this.lPuid = var1.read(this.lPuid, 14, false);
        this.lPimid = var1.read(this.lPimid, 15, false);
        this.iRecType = var1.read(this.iRecType, 16, false);
        this.sSimpleNick = var1.readString(17, false);
        this.iScreenType = var1.read(this.iScreenType, 18, false);
        this.sPrivateHost = var1.readString(19, false);
        this.iSortIdx = var1.read(this.iSortIdx, 20, false);
        this.lLiveCompatibleFlag = var1.read(this.lLiveCompatibleFlag, 21, false);
        this.lHuyaRankScore = var1.read(this.lHuyaRankScore, 22, false);
        this.iAid = var1.read(this.iAid, 23, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sName != null) {
            var1.write(this.sName, 0);
        }

        if (this.sScreenshot != null) {
            var1.write(this.sScreenshot, 1);
        }

        var1.write(this.lPopularity, 3);
        if (this.sAvatarUrl != null) {
            var1.write(this.sAvatarUrl, 4);
        }

        if (this.sGameName != null) {
            var1.write(this.sGameName, 5);
        }

        var1.write(this.lTid, 6);
        var1.write(this.lSTid, 7);
        var1.write(this.lSid, 8);
        if (this.sLiveIntro != null) {
            var1.write(this.sLiveIntro, 9);
        }

        if (this.sNick != null) {
            var1.write(this.sNick, 10);
        }

        var1.write(this.lAttendeeCount, 11);
        var1.write(this.iGameId, 12);
        var1.write(this.iSourceType, 13);
        var1.write(this.lPuid, 14);
        var1.write(this.lPimid, 15);
        var1.write(this.iRecType, 16);
        if (this.sSimpleNick != null) {
            var1.write(this.sSimpleNick, 17);
        }

        var1.write(this.iScreenType, 18);
        if (this.sPrivateHost != null) {
            var1.write(this.sPrivateHost, 19);
        }

        var1.write(this.iSortIdx, 20);
        var1.write(this.lLiveCompatibleFlag, 21);
        var1.write(this.lHuyaRankScore, 22);
        var1.write(this.iAid, 23);
    }
}
