//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class MGetLiveListReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public double dLatitude = 0.0D;
    public double dLongitude = 0.0D;
    public int iPage = 0;
    public int iPageSize = 0;
    public int iSectionId = 0;
    public int iTag = 0;
    public int iUseLocation = 0;
    public UserId tId = null;

    public MGetLiveListReq() {
    }

    public MGetLiveListReq(UserId var1, int var2, int var3, int var4, int var5, int var6, double var7, double var9) {
        this.tId = var1;
        this.iSectionId = var2;
        this.iTag = var3;
        this.iPage = var4;
        this.iPageSize = var5;
        this.iUseLocation = var6;
        this.dLatitude = var7;
        this.dLongitude = var9;
    }

    public String className() {
        return "HUYA.MGetLiveListReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.iSectionId, "iSectionId");
        var3.display(this.iTag, "iTag");
        var3.display(this.iPage, "iPage");
        var3.display(this.iPageSize, "iPageSize");
        var3.display(this.iUseLocation, "iUseLocation");
        var3.display(this.dLatitude, "dLatitude");
        var3.display(this.dLongitude, "dLongitude");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MGetLiveListReq var2 = (MGetLiveListReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.iSectionId, var2.iSectionId) && JceUtil.equals(this.iTag, var2.iTag) && JceUtil.equals(this.iPage, var2.iPage) && JceUtil.equals(this.iPageSize, var2.iPageSize) && JceUtil.equals(this.iUseLocation, var2.iUseLocation) && JceUtil.equals(this.dLatitude, var2.dLatitude) && JceUtil.equals(this.dLongitude, var2.dLongitude)) {
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
        return "com.duowan.HUYA.MGetLiveListReq";
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
        if (cache_tId == null) {
            cache_tId = new UserId();
        }

        this.tId = (UserId)var1.read(cache_tId, 0, false);
        this.iSectionId = var1.read(this.iSectionId, 1, false);
        this.iTag = var1.read(this.iTag, 2, false);
        this.iPage = var1.read(this.iPage, 3, false);
        this.iPageSize = var1.read(this.iPageSize, 4, false);
        this.iUseLocation = var1.read(this.iUseLocation, 6, false);
        this.dLatitude = var1.read(this.dLatitude, 7, false);
        this.dLongitude = var1.read(this.dLongitude, 8, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        var1.write(this.iSectionId, 1);
        var1.write(this.iTag, 2);
        var1.write(this.iPage, 3);
        var1.write(this.iPageSize, 4);
        var1.write(this.iUseLocation, 6);
        var1.write(this.dLatitude, 7);
        var1.write(this.dLongitude, 8);
    }
}
