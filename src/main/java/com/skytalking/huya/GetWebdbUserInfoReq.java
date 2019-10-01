//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetWebdbUserInfoReq extends JceStruct implements Cloneable {
    public boolean bCacheFirst = true;
    public long lImid = 0L;
    public long lUid = 0L;
    public String sAccount = "";
    public String sPassport = "";

    public GetWebdbUserInfoReq() {
    }

    public GetWebdbUserInfoReq(long var1, long var3, String var5, String var6, boolean var7) {
        this.lUid = var1;
        this.lImid = var3;
        this.sPassport = var5;
        this.sAccount = var6;
        this.bCacheFirst = var7;
    }

    public String className() {
        return "HUYA.GetWebdbUserInfoReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.lImid, "lImid");
        var3.display(this.sPassport, "sPassport");
        var3.display(this.sAccount, "sAccount");
        var3.display(this.bCacheFirst, "bCacheFirst");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetWebdbUserInfoReq var2 = (GetWebdbUserInfoReq)var1;
                if (JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.lImid, var2.lImid) && JceUtil.equals(this.sPassport, var2.sPassport) && JceUtil.equals(this.sAccount, var2.sAccount) && JceUtil.equals(this.bCacheFirst, var2.bCacheFirst)) {
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
        return "com.duowan.HUYA.GetWebdbUserInfoReq";
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
        this.lImid = var1.read(this.lImid, 1, false);
        this.sPassport = var1.readString(2, false);
        this.sAccount = var1.readString(3, false);
        this.bCacheFirst = var1.read(this.bCacheFirst, 4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        var1.write(this.lImid, 1);
        if (this.sPassport != null) {
            var1.write(this.sPassport, 2);
        }

        if (this.sAccount != null) {
            var1.write(this.sAccount, 3);
        }

        var1.write(this.bCacheFirst, 4);
    }
}
