//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class AllGameMd5Info extends JceStruct implements Cloneable {
    static MapGameFixInfo cache_tMapGameFixInfo;
    public String sMd5 = "";
    public MapGameFixInfo tMapGameFixInfo = null;

    public AllGameMd5Info() {
    }

    public AllGameMd5Info(String var1, MapGameFixInfo var2) {
        this.sMd5 = var1;
        this.tMapGameFixInfo = var2;
    }

    public String className() {
        return "HUYA.AllGameMd5Info";
    }
    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sMd5, "sMd5");
        var3.display(this.tMapGameFixInfo, "tMapGameFixInfo");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                AllGameMd5Info var2 = (AllGameMd5Info)var1;
                if (JceUtil.equals(this.sMd5, var2.sMd5) && JceUtil.equals(this.tMapGameFixInfo, var2.tMapGameFixInfo)) {
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
        return "com.duowan.HUYA.AllGameMd5Info";
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
        this.sMd5 = var1.readString(0, false);
        if (cache_tMapGameFixInfo == null) {
            cache_tMapGameFixInfo = new MapGameFixInfo();
        }

        this.tMapGameFixInfo = (MapGameFixInfo)var1.read(cache_tMapGameFixInfo, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sMd5 != null) {
            var1.write(this.sMd5, 0);
        }

        if (this.tMapGameFixInfo != null) {
            var1.write(this.tMapGameFixInfo, 1);
        }

    }
}
