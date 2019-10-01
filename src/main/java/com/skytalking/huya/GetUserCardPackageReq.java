//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetUserCardPackageReq extends JceStruct implements Cloneable {
    static int cache_eSource;
    static int cache_eTempleteType;
    static UserId cache_tId;
    public int eSource = 0;
    public int eTempleteType = 0;
    public UserId tId = null;

    public GetUserCardPackageReq() {
    }

    public GetUserCardPackageReq(UserId var1, int var2, int var3) {
        this.tId = var1;
        this.eTempleteType = var2;
        this.eSource = var3;
    }

    public String className() {
        return "HUYA.GetUserCardPackageReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.eTempleteType, "eTempleteType");
        var3.display(this.eSource, "eSource");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetUserCardPackageReq var2 = (GetUserCardPackageReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.eTempleteType, var2.eTempleteType) && JceUtil.equals(this.eSource, var2.eSource)) {
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
        return "com.duowan.HUYA.GetUserCardPackageReq";
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
        this.eTempleteType = var1.read(this.eTempleteType, 1, false);
        this.eSource = var1.read(this.eSource, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        var1.write(this.eTempleteType, 1);
        var1.write(this.eSource, 2);
    }
}
