//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class UpcommingEventInfo extends JceStruct implements Cloneable {
    public boolean bSubscribe = false;
    public int iDownTime = 0;
    public int iEventID = 0;
    public int iGameID = 0;
    public int iLiveState = 0;
    public int iSourceType = 0;
    public long iSubCnt = 0L;
    public int iUpTime = 0;
    public long lPUid = 0L;
    public long lSubid = 0L;
    public long lTid = 0L;
    public String sAvatarUrl = "";
    public String sClickUrl = "";
    public String sDigest = "";
    public String sGameName = "";
    public String sLiveDesc = "";
    public String sNickName = "";
    public String sPicUrl = "";
    public String sShareImage = "";
    public String sShareUrl = "";
    public String sTitle = "";

    public UpcommingEventInfo() {
    }

    public UpcommingEventInfo(int var1, long var2, String var4, String var5, String var6, String var7, int var8, long var9, long var11, boolean var13, int var14, int var15, long var16, int var18, String var19, String var20, String var21, String var22, String var23, String var24, int var25) {
        this.iEventID = var1;
        this.iSubCnt = var2;
        this.sTitle = var4;
        this.sDigest = var5;
        this.sPicUrl = var6;
        this.sClickUrl = var7;
        this.iLiveState = var8;
        this.lTid = var9;
        this.lSubid = var11;
        this.bSubscribe = var13;
        this.iUpTime = var14;
        this.iDownTime = var15;
        this.lPUid = var16;
        this.iSourceType = var18;
        this.sShareUrl = var19;
        this.sShareImage = var20;
        this.sNickName = var21;
        this.sAvatarUrl = var22;
        this.sLiveDesc = var23;
        this.sGameName = var24;
        this.iGameID = var25;
    }

    public String className() {
        return "HUYA.UpcommingEventInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iEventID, "iEventID");
        var3.display(this.iSubCnt, "iSubCnt");
        var3.display(this.sTitle, "sTitle");
        var3.display(this.sDigest, "sDigest");
        var3.display(this.sPicUrl, "sPicUrl");
        var3.display(this.sClickUrl, "sClickUrl");
        var3.display(this.iLiveState, "iLiveState");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSubid, "lSubid");
        var3.display(this.bSubscribe, "bSubscribe");
        var3.display(this.iUpTime, "iUpTime");
        var3.display(this.iDownTime, "iDownTime");
        var3.display(this.lPUid, "lPUid");
        var3.display(this.iSourceType, "iSourceType");
        var3.display(this.sShareUrl, "sShareUrl");
        var3.display(this.sShareImage, "sShareImage");
        var3.display(this.sNickName, "sNickName");
        var3.display(this.sAvatarUrl, "sAvatarUrl");
        var3.display(this.sLiveDesc, "sLiveDesc");
        var3.display(this.sGameName, "sGameName");
        var3.display(this.iGameID, "iGameID");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                UpcommingEventInfo var2 = (UpcommingEventInfo)var1;
                if (JceUtil.equals(this.iEventID, var2.iEventID) && JceUtil.equals(this.iSubCnt, var2.iSubCnt) && JceUtil.equals(this.sTitle, var2.sTitle) && JceUtil.equals(this.sDigest, var2.sDigest) && JceUtil.equals(this.sPicUrl, var2.sPicUrl) && JceUtil.equals(this.sClickUrl, var2.sClickUrl) && JceUtil.equals(this.iLiveState, var2.iLiveState) && JceUtil.equals(this.lTid, var2.lTid) && JceUtil.equals(this.lSubid, var2.lSubid) && JceUtil.equals(this.bSubscribe, var2.bSubscribe) && JceUtil.equals(this.iUpTime, var2.iUpTime) && JceUtil.equals(this.iDownTime, var2.iDownTime) && JceUtil.equals(this.lPUid, var2.lPUid) && JceUtil.equals(this.iSourceType, var2.iSourceType) && JceUtil.equals(this.sShareUrl, var2.sShareUrl) && JceUtil.equals(this.sShareImage, var2.sShareImage) && JceUtil.equals(this.sNickName, var2.sNickName) && JceUtil.equals(this.sAvatarUrl, var2.sAvatarUrl) && JceUtil.equals(this.sLiveDesc, var2.sLiveDesc) && JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.iGameID, var2.iGameID)) {
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
        return "com.duowan.HUYA.UpcommingEventInfo";
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
        this.iEventID = var1.read(this.iEventID, 0, false);
        this.iSubCnt = var1.read(this.iSubCnt, 1, false);
        this.sTitle = var1.readString(2, false);
        this.sDigest = var1.readString(3, false);
        this.sPicUrl = var1.readString(4, false);
        this.sClickUrl = var1.readString(5, false);
        this.iLiveState = var1.read(this.iLiveState, 6, false);
        this.lTid = var1.read(this.lTid, 7, false);
        this.lSubid = var1.read(this.lSubid, 8, false);
        this.bSubscribe = var1.read(this.bSubscribe, 9, false);
        this.iUpTime = var1.read(this.iUpTime, 10, false);
        this.iDownTime = var1.read(this.iDownTime, 11, false);
        this.lPUid = var1.read(this.lPUid, 12, false);
        this.iSourceType = var1.read(this.iSourceType, 13, false);
        this.sShareUrl = var1.readString(14, false);
        this.sShareImage = var1.readString(15, false);
        this.sNickName = var1.readString(16, false);
        this.sAvatarUrl = var1.readString(17, false);
        this.sLiveDesc = var1.readString(18, false);
        this.sGameName = var1.readString(19, false);
        this.iGameID = var1.read(this.iGameID, 20, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iEventID, 0);
        var1.write(this.iSubCnt, 1);
        if (this.sTitle != null) {
            var1.write(this.sTitle, 2);
        }

        if (this.sDigest != null) {
            var1.write(this.sDigest, 3);
        }

        if (this.sPicUrl != null) {
            var1.write(this.sPicUrl, 4);
        }

        if (this.sClickUrl != null) {
            var1.write(this.sClickUrl, 5);
        }

        var1.write(this.iLiveState, 6);
        var1.write(this.lTid, 7);
        var1.write(this.lSubid, 8);
        var1.write(this.bSubscribe, 9);
        var1.write(this.iUpTime, 10);
        var1.write(this.iDownTime, 11);
        var1.write(this.lPUid, 12);
        var1.write(this.iSourceType, 13);
        if (this.sShareUrl != null) {
            var1.write(this.sShareUrl, 14);
        }

        if (this.sShareImage != null) {
            var1.write(this.sShareImage, 15);
        }

        if (this.sNickName != null) {
            var1.write(this.sNickName, 16);
        }

        if (this.sAvatarUrl != null) {
            var1.write(this.sAvatarUrl, 17);
        }

        if (this.sLiveDesc != null) {
            var1.write(this.sLiveDesc, 18);
        }

        if (this.sGameName != null) {
            var1.write(this.sGameName, 19);
        }

        var1.write(this.iGameID, 20);
    }
}
