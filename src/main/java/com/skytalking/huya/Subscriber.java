//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class Subscriber extends JceStruct implements Cloneable {
    public int iType = 0;
    public String sKey = "";

    public Subscriber() {
    }

    public Subscriber(int var1, String var2) {
        this.iType = var1;
        this.sKey = var2;
    }

    public String className() {
        return "HUYA.Subscriber";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iType, "iType");
        var3.display(this.sKey, "sKey");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                Subscriber var2 = (Subscriber)var1;
                if (JceUtil.equals(this.iType, var2.iType) && JceUtil.equals(this.sKey, var2.sKey)) {
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
        return "com.duowan.HUYA.Subscriber";
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
        this.iType = var1.read(this.iType, 0, false);
        this.sKey = var1.readString(1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iType, 0);
        if (this.sKey != null) {
            var1.write(this.sKey, 1);
        }

    }
}
