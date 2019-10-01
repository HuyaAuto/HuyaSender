//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class MGetHomePageDataReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public int iType = 1;
    public UserId tId = null;


    public MGetHomePageDataReq() {
    }

    public MGetHomePageDataReq(UserId var1, int var2) {
        this.tId = var1;
        this.iType = var2;
    }

    public String className() {
        return "HUYA.MGetHomePageDataReq";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.iType, "iType");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MGetHomePageDataReq var2 = (MGetHomePageDataReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.iType, var2.iType)) {
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
        return "com.duowan.HUYA.MGetHomePageDataReq";
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
        this.iType = var1.read(this.iType, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        var1.write(this.iType, 1);
    }
}
