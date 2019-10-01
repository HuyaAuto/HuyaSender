//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class PresenterActivity extends JceStruct implements Cloneable {
    static Activity cache_tAct;
    public boolean bLive = true;
    public int iAttendee = 0;
    public int iBeginTime = 0;
    public int iScreenType = 0;
    public int iSourceType = 0;
    public long lAid = 0L;
    public long lChannelId = 0L;
    public long lGameId = 0L;
    public int lLiveCompatibleFlag = 0;
    public long lLiveId = 0L;
    public long lSubChannelId = 0L;
    public long lUid = 0L;
    public long lYYId = 0L;
    public String sAvatar = "";
    public String sGameName = "";
    public String sLiveIntro = "";
    public String sLiveName = "";
    public String sLiveThumb = "";
    public String sNick = "";
    public Activity tAct = null;

    public PresenterActivity() {
    }

    public PresenterActivity(Activity var1, long var2, long var4, long var6, String var8, String var9, boolean var10, long var11, long var13, String var15, String var16, String var17, String var18, long var19, int var21, int var22, int var23, int var24, int var25, long var26) {
        this.tAct = var1;
        this.lAid = var2;
        this.lUid = var4;
        this.lYYId = var6;
        this.sNick = var8;
        this.sAvatar = var9;
        this.bLive = var10;
        this.lChannelId = var11;
        this.lSubChannelId = var13;
        this.sLiveName = var15;
        this.sLiveIntro = var16;
        this.sLiveThumb = var17;
        this.sGameName = var18;
        this.lGameId = var19;
        this.iAttendee = var21;
        this.iBeginTime = var22;
        this.iSourceType = var23;
        this.iScreenType = var24;
        this.lLiveCompatibleFlag = var25;
        this.lLiveId = var26;
    }

    public String className() {
        return "HUYA.PresenterActivity";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tAct, "tAct");
        var3.display(this.lAid, "lAid");
        var3.display(this.lUid, "lUid");
        var3.display(this.lYYId, "lYYId");
        var3.display(this.sNick, "sNick");
        var3.display(this.sAvatar, "sAvatar");
        var3.display(this.bLive, "bLive");
        var3.display(this.lChannelId, "lChannelId");
        var3.display(this.lSubChannelId, "lSubChannelId");
        var3.display(this.sLiveName, "sLiveName");
        var3.display(this.sLiveIntro, "sLiveIntro");
        var3.display(this.sLiveThumb, "sLiveThumb");
        var3.display(this.sGameName, "sGameName");
        var3.display(this.lGameId, "lGameId");
        var3.display(this.iAttendee, "iAttendee");
        var3.display(this.iBeginTime, "iBeginTime");
        var3.display(this.iSourceType, "iSourceType");
        var3.display(this.iScreenType, "iScreenType");
        var3.display(this.lLiveCompatibleFlag, "lLiveCompatibleFlag");
        var3.display(this.lLiveId, "lLiveId");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                PresenterActivity var2 = (PresenterActivity)var1;
                if (JceUtil.equals(this.tAct, var2.tAct) && JceUtil.equals(this.lAid, var2.lAid) && JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.lYYId, var2.lYYId) && JceUtil.equals(this.sNick, var2.sNick) && JceUtil.equals(this.sAvatar, var2.sAvatar) && JceUtil.equals(this.bLive, var2.bLive) && JceUtil.equals(this.lChannelId, var2.lChannelId) && JceUtil.equals(this.lSubChannelId, var2.lSubChannelId) && JceUtil.equals(this.sLiveName, var2.sLiveName) && JceUtil.equals(this.sLiveIntro, var2.sLiveIntro) && JceUtil.equals(this.sLiveThumb, var2.sLiveThumb) && JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.lGameId, var2.lGameId) && JceUtil.equals(this.iAttendee, var2.iAttendee) && JceUtil.equals(this.iBeginTime, var2.iBeginTime) && JceUtil.equals(this.iSourceType, var2.iSourceType) && JceUtil.equals(this.iScreenType, var2.iScreenType) && JceUtil.equals(this.lLiveCompatibleFlag, var2.lLiveCompatibleFlag) && JceUtil.equals(this.lLiveId, var2.lLiveId)) {
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
        return "com.duowan.HUYA.PresenterActivity";
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
        if (cache_tAct == null) {
            cache_tAct = new Activity();
        }

        this.tAct = (Activity)var1.read(cache_tAct, 0, false);
        this.lAid = var1.read(this.lAid, 1, false);
        this.lUid = var1.read(this.lUid, 2, false);
        this.lYYId = var1.read(this.lYYId, 3, false);
        this.sNick = var1.readString(4, false);
        this.sAvatar = var1.readString(5, false);
        this.bLive = var1.read(this.bLive, 6, false);
        this.lChannelId = var1.read(this.lChannelId, 7, false);
        this.lSubChannelId = var1.read(this.lSubChannelId, 8, false);
        this.sLiveName = var1.readString(9, false);
        this.sLiveIntro = var1.readString(10, false);
        this.sLiveThumb = var1.readString(11, false);
        this.sGameName = var1.readString(12, false);
        this.lGameId = var1.read(this.lGameId, 13, false);
        this.iAttendee = var1.read(this.iAttendee, 14, false);
        this.iBeginTime = var1.read(this.iBeginTime, 15, false);
        this.iSourceType = var1.read(this.iSourceType, 16, false);
        this.iScreenType = var1.read(this.iScreenType, 17, false);
        this.lLiveCompatibleFlag = var1.read(this.lLiveCompatibleFlag, 18, false);
        this.lLiveId = var1.read(this.lLiveId, 19, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tAct != null) {
            var1.write(this.tAct, 0);
        }

        var1.write(this.lAid, 1);
        var1.write(this.lUid, 2);
        var1.write(this.lYYId, 3);
        if (this.sNick != null) {
            var1.write(this.sNick, 4);
        }

        if (this.sAvatar != null) {
            var1.write(this.sAvatar, 5);
        }

        var1.write(this.bLive, 6);
        var1.write(this.lChannelId, 7);
        var1.write(this.lSubChannelId, 8);
        if (this.sLiveName != null) {
            var1.write(this.sLiveName, 9);
        }

        if (this.sLiveIntro != null) {
            var1.write(this.sLiveIntro, 10);
        }

        if (this.sLiveThumb != null) {
            var1.write(this.sLiveThumb, 11);
        }

        if (this.sGameName != null) {
            var1.write(this.sGameName, 12);
        }

        var1.write(this.lGameId, 13);
        var1.write(this.iAttendee, 14);
        var1.write(this.iBeginTime, 15);
        var1.write(this.iSourceType, 16);
        var1.write(this.iScreenType, 17);
        var1.write(this.lLiveCompatibleFlag, 18);
        var1.write(this.lLiveId, 19);
    }
}
