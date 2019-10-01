//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class WSUserInfo extends JceStruct implements Cloneable {
    public boolean bAnonymous = true;
    public long lGroupId = 0L;
    public long lGroupType = 0L;
    public long lSid = 0L;
    public long lTid = 0L;
    public long lUid = 0L;
    public String sGuid = "";
    public String sToken = "";

    public WSUserInfo() {
    }

    public WSUserInfo(long var1, boolean var3, String var4, String var5, long var6, long var8, long var10, long var12) {
        this.lUid = var1;
        this.bAnonymous = var3;
        this.sGuid = var4;
        this.sToken = var5;
        this.lTid = var6;
        this.lSid = var8;
        this.lGroupId = var10;
        this.lGroupType = var12;
    }

    public String className() {
        return "HUYA.WSUserInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.bAnonymous, "bAnonymous");
        var3.display(this.sGuid, "sGuid");
        var3.display(this.sToken, "sToken");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSid, "lSid");
        var3.display(this.lGroupId, "lGroupId");
        var3.display(this.lGroupType, "lGroupType");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                WSUserInfo var2 = (WSUserInfo)var1;
                if (JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.bAnonymous, var2.bAnonymous) && JceUtil.equals(this.sGuid, var2.sGuid) && JceUtil.equals(this.sToken, var2.sToken) && JceUtil.equals(this.lTid, var2.lTid) && JceUtil.equals(this.lSid, var2.lSid) && JceUtil.equals(this.lGroupId, var2.lGroupId) && JceUtil.equals(this.lGroupType, var2.lGroupType)) {
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
        return "com.duowan.HUYA.WSUserInfo";
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
        this.lUid = var1.read(this.lUid, 0, false);
        this.bAnonymous = var1.read(this.bAnonymous, 1, false);
        this.sGuid = var1.readString(2, false);
        this.sToken = var1.readString(3, false);
        this.lTid = var1.read(this.lTid, 4, false);
        this.lSid = var1.read(this.lSid, 5, false);
        this.lGroupId = var1.read(this.lGroupId, 6, false);
        this.lGroupType = var1.read(this.lGroupType, 7, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        var1.write(this.bAnonymous, 1);
        if (this.sGuid != null) {
            var1.write(this.sGuid, 2);
        }

        if (this.sToken != null) {
            var1.write(this.sToken, 3);
        }

        var1.write(this.lTid, 4);
        var1.write(this.lSid, 5);
        var1.write(this.lGroupId, 6);
        var1.write(this.lGroupType, 7);
    }
}
