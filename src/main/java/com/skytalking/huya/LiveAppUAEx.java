//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class LiveAppUAEx extends JceStruct implements Cloneable {
    public String sAPN = "";
    public String sIMEI = "";
    public String sNetType = "";

    public LiveAppUAEx() {
    }

    public LiveAppUAEx(String var1, String var2, String var3) {
        this.sIMEI = var1;
        this.sAPN = var2;
        this.sNetType = var3;
    }

    public String className() {
        return "HUYA.LiveAppUAEx";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sIMEI, "sIMEI");
        var3.display(this.sAPN, "sAPN");
        var3.display(this.sNetType, "sNetType");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveAppUAEx var2 = (LiveAppUAEx)var1;
                if (JceUtil.equals(this.sIMEI, var2.sIMEI) && JceUtil.equals(this.sAPN, var2.sAPN) && JceUtil.equals(this.sNetType, var2.sNetType)) {
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
        return "com.duowan.HUYA.LiveAppUAEx";
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
        this.sIMEI = var1.readString(1, false);
        this.sAPN = var1.readString(2, false);
        this.sNetType = var1.readString(3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sIMEI != null) {
            var1.write(this.sIMEI, 1);
        }

        if (this.sAPN != null) {
            var1.write(this.sAPN, 2);
        }

        if (this.sNetType != null) {
            var1.write(this.sNetType, 3);
        }

    }
}
