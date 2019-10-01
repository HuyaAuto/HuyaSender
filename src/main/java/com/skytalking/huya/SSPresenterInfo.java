//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SSPresenterInfo extends JceStruct implements Cloneable {
    static MSProfileTag cache_tTag;
    public boolean bLive = false;
    public int iAid = 0;
    public int iGameId = 0;
    public int iRecLiveTime = 0;
    public int iScreenType = 0;
    public int iSortIdx = 0;
    public int iSourceType = 0;
    public long lAttendeeCount = 0L;
    public long lImid = 0L;
    public long lLiveCompatibleFlag = 0L;
    public long lPresenterId = 0L;
    public long lSTid = 0L;
    public long lSid = 0L;
    public long lSubscribe = 0L;
    public long lTid = 0L;
    public String sAvatarUrl = "";
    public String sGameName = "";
    public String sLiveIntro = "";
    public String sNickName = "";
    public String sPrivateHost = "";
    public String sRecGameName = "";
    public String sSidName = "";
    public String sSimpleNick = "";
    public MSProfileTag tTag = null;



    public SSPresenterInfo() {
    }

    public SSPresenterInfo(long var1, String var3, long var4, boolean var6, long var7, long var9, long var11, String var13, MSProfileTag var14, String var15, String var16, int var17, String var18, long var19, String var21, int var22, int var23, long var24, String var26, int var27, long var28, int var30, int var31, String var32) {
        this.lPresenterId = var1;
        this.sNickName = var3;
        this.lSubscribe = var4;
        this.bLive = var6;
        this.lTid = var7;
        this.lSTid = var9;
        this.lSid = var11;
        this.sSidName = var13;
        this.tTag = var14;
        this.sAvatarUrl = var15;
        this.sLiveIntro = var16;
        this.iGameId = var17;
        this.sGameName = var18;
        this.lAttendeeCount = var19;
        this.sSimpleNick = var21;
        this.iSourceType = var22;
        this.iScreenType = var23;
        this.lImid = var24;
        this.sPrivateHost = var26;
        this.iSortIdx = var27;
        this.lLiveCompatibleFlag = var28;
        this.iAid = var30;
        this.iRecLiveTime = var31;
        this.sRecGameName = var32;
    }

    public String className() {
        return "HUYA.SSPresenterInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lPresenterId, "lPresenterId");
        var3.display(this.sNickName, "sNickName");
        var3.display(this.lSubscribe, "lSubscribe");
        var3.display(this.bLive, "bLive");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSTid, "lSTid");
        var3.display(this.lSid, "lSid");
        var3.display(this.sSidName, "sSidName");
        var3.display(this.tTag, "tTag");
        var3.display(this.sAvatarUrl, "sAvatarUrl");
        var3.display(this.sLiveIntro, "sLiveIntro");
        var3.display(this.iGameId, "iGameId");
        var3.display(this.sGameName, "sGameName");
        var3.display(this.lAttendeeCount, "lAttendeeCount");
        var3.display(this.sSimpleNick, "sSimpleNick");
        var3.display(this.iSourceType, "iSourceType");
        var3.display(this.iScreenType, "iScreenType");
        var3.display(this.lImid, "lImid");
        var3.display(this.sPrivateHost, "sPrivateHost");
        var3.display(this.iSortIdx, "iSortIdx");
        var3.display(this.lLiveCompatibleFlag, "lLiveCompatibleFlag");
        var3.display(this.iAid, "iAid");
        var3.display(this.iRecLiveTime, "iRecLiveTime");
        var3.display(this.sRecGameName, "sRecGameName");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SSPresenterInfo var2 = (SSPresenterInfo)var1;
                if (JceUtil.equals(this.lPresenterId, var2.lPresenterId) && JceUtil.equals(this.sNickName, var2.sNickName) && JceUtil.equals(this.lSubscribe, var2.lSubscribe) && JceUtil.equals(this.bLive, var2.bLive) && JceUtil.equals(this.lTid, var2.lTid) && JceUtil.equals(this.lSTid, var2.lSTid) && JceUtil.equals(this.lSid, var2.lSid) && JceUtil.equals(this.sSidName, var2.sSidName) && JceUtil.equals(this.tTag, var2.tTag) && JceUtil.equals(this.sAvatarUrl, var2.sAvatarUrl) && JceUtil.equals(this.sLiveIntro, var2.sLiveIntro) && JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.lAttendeeCount, var2.lAttendeeCount) && JceUtil.equals(this.sSimpleNick, var2.sSimpleNick) && JceUtil.equals(this.iSourceType, var2.iSourceType) && JceUtil.equals(this.iScreenType, var2.iScreenType) && JceUtil.equals(this.lImid, var2.lImid) && JceUtil.equals(this.sPrivateHost, var2.sPrivateHost) && JceUtil.equals(this.iSortIdx, var2.iSortIdx) && JceUtil.equals(this.lLiveCompatibleFlag, var2.lLiveCompatibleFlag) && JceUtil.equals(this.iAid, var2.iAid) && JceUtil.equals(this.iRecLiveTime, var2.iRecLiveTime) && JceUtil.equals(this.sRecGameName, var2.sRecGameName)) {
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
        return "com.duowan.HUYA.SSPresenterInfo";
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
        this.lPresenterId = var1.read(this.lPresenterId, 0, false);
        this.sNickName = var1.readString(1, false);
        this.lSubscribe = var1.read(this.lSubscribe, 2, false);
        this.bLive = var1.read(this.bLive, 3, false);
        this.lTid = var1.read(this.lTid, 4, false);
        this.lSTid = var1.read(this.lSTid, 5, false);
        this.lSid = var1.read(this.lSid, 6, false);
        this.sSidName = var1.readString(7, false);
        if (cache_tTag == null) {
            cache_tTag = new MSProfileTag();
        }

        this.tTag = (MSProfileTag)var1.read(cache_tTag, 8, false);
        this.sAvatarUrl = var1.readString(9, false);
        this.sLiveIntro = var1.readString(10, false);
        this.iGameId = var1.read(this.iGameId, 11, false);
        this.sGameName = var1.readString(12, false);
        this.lAttendeeCount = var1.read(this.lAttendeeCount, 13, false);
        this.sSimpleNick = var1.readString(14, false);
        this.iSourceType = var1.read(this.iSourceType, 15, false);
        this.iScreenType = var1.read(this.iScreenType, 16, false);
        this.lImid = var1.read(this.lImid, 17, false);
        this.sPrivateHost = var1.readString(18, false);
        this.iSortIdx = var1.read(this.iSortIdx, 19, false);
        this.lLiveCompatibleFlag = var1.read(this.lLiveCompatibleFlag, 20, false);
        this.iAid = var1.read(this.iAid, 21, false);
        this.iRecLiveTime = var1.read(this.iRecLiveTime, 22, false);
        this.sRecGameName = var1.readString(23, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lPresenterId, 0);
        if (this.sNickName != null) {
            var1.write(this.sNickName, 1);
        }

        var1.write(this.lSubscribe, 2);
        var1.write(this.bLive, 3);
        var1.write(this.lTid, 4);
        var1.write(this.lSTid, 5);
        var1.write(this.lSid, 6);
        if (this.sSidName != null) {
            var1.write(this.sSidName, 7);
        }

        if (this.tTag != null) {
            var1.write(this.tTag, 8);
        }

        if (this.sAvatarUrl != null) {
            var1.write(this.sAvatarUrl, 9);
        }

        if (this.sLiveIntro != null) {
            var1.write(this.sLiveIntro, 10);
        }

        var1.write(this.iGameId, 11);
        if (this.sGameName != null) {
            var1.write(this.sGameName, 12);
        }

        var1.write(this.lAttendeeCount, 13);
        if (this.sSimpleNick != null) {
            var1.write(this.sSimpleNick, 14);
        }

        var1.write(this.iSourceType, 15);
        var1.write(this.iScreenType, 16);
        var1.write(this.lImid, 17);
        if (this.sPrivateHost != null) {
            var1.write(this.sPrivateHost, 18);
        }

        var1.write(this.iSortIdx, 19);
        var1.write(this.lLiveCompatibleFlag, 20);
        var1.write(this.iAid, 21);
        var1.write(this.iRecLiveTime, 22);
        if (this.sRecGameName != null) {
            var1.write(this.sRecGameName, 23);
        }

    }
}
