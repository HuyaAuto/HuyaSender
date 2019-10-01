//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetMyAllCategoryGameReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public String sMd5 = "";
    public UserId tId = null;



    public GetMyAllCategoryGameReq() {
    }

    public GetMyAllCategoryGameReq(UserId var1, String var2) {
        this.tId = var1;
        this.sMd5 = var2;
    }

    public String className() {
        return "HUYA.GetMyAllCategoryGameReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.sMd5, "sMd5");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetMyAllCategoryGameReq var2 = (GetMyAllCategoryGameReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.sMd5, var2.sMd5)) {
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
        return "com.duowan.HUYA.GetMyAllCategoryGameReq";
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
        this.sMd5 = var1.readString(1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        if (this.sMd5 != null) {
            var1.write(this.sMd5, 1);
        }

    }
}
