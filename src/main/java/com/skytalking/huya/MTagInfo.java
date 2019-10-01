//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class MTagInfo extends JceStruct implements Cloneable {
    public int iId = 0;
    public int iType = 0;
    public String sColor = "";
    public String sName = "";



    public MTagInfo() {
    }

    public MTagInfo(int var1, String var2, String var3, int var4) {
        this.iId = var1;
        this.sName = var2;
        this.sColor = var3;
        this.iType = var4;
    }

    public String className() {
        return "HUYA.MTagInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iId, "iId");
        var3.display(this.sName, "sName");
        var3.display(this.sColor, "sColor");
        var3.display(this.iType, "iType");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MTagInfo var2 = (MTagInfo)var1;
                if (JceUtil.equals(this.iId, var2.iId) && JceUtil.equals(this.sName, var2.sName) && JceUtil.equals(this.sColor, var2.sColor) && JceUtil.equals(this.iType, var2.iType)) {
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
        return "com.duowan.HUYA.MTagInfo";
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
        this.iId = var1.read(this.iId, 0, false);
        this.sName = var1.readString(1, false);
        this.sColor = var1.readString(2, false);
        this.iType = var1.read(this.iType, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iId, 0);
        if (this.sName != null) {
            var1.write(this.sName, 1);
        }

        if (this.sColor != null) {
            var1.write(this.sColor, 2);
        }

        var1.write(this.iType, 3);
    }
}
