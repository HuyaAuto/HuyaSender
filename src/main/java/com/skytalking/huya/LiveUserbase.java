//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class LiveUserbase extends JceStruct implements Cloneable {
    static int cache_eSource;
    static int cache_eType;
    static LiveAppUAEx cache_tUAEx;
    public int eSource = 0;
    public int eType = 0;
    public LiveAppUAEx tUAEx = null;

    public LiveUserbase() {
    }

    public LiveUserbase(int var1, int var2, LiveAppUAEx var3) {
        this.eSource = var1;
        this.eType = var2;
        this.tUAEx = var3;
    }

    public String className() {
        return "HUYA.LiveUserbase";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.eSource, "eSource");
        var3.display(this.eType, "eType");
        var3.display(this.tUAEx, "tUAEx");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveUserbase var2 = (LiveUserbase)var1;
                if (JceUtil.equals(this.eSource, var2.eSource) && JceUtil.equals(this.eType, var2.eType) && JceUtil.equals(this.tUAEx, var2.tUAEx)) {
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
        return "com.duowan.HUYA.LiveUserbase";
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
        this.eSource = var1.read(this.eSource, 0, false);
        this.eType = var1.read(this.eType, 1, false);
        if (cache_tUAEx == null) {
            cache_tUAEx = new LiveAppUAEx();
        }

        this.tUAEx = (LiveAppUAEx)var1.read(cache_tUAEx, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.eSource, 0);
        var1.write(this.eType, 1);
        if (this.tUAEx != null) {
            var1.write(this.tUAEx, 2);
        }

    }
}
