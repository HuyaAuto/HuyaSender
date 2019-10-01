//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class MAdvertising extends JceStruct implements Cloneable {
    public int iId = 0;
    public String sAction = "";
    public String sIcon = "";
    public String sSubTitle = "";
    public String sTitle = "";

    public MAdvertising() {
    }

    public MAdvertising(int var1, String var2, String var3, String var4, String var5) {
        this.iId = var1;
        this.sTitle = var2;
        this.sSubTitle = var3;
        this.sIcon = var4;
        this.sAction = var5;
    }

    public String className() {
        return "HUYA.MAdvertising";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iId, "iId");
        var3.display(this.sTitle, "sTitle");
        var3.display(this.sSubTitle, "sSubTitle");
        var3.display(this.sIcon, "sIcon");
        var3.display(this.sAction, "sAction");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MAdvertising var2 = (MAdvertising)var1;
                if (JceUtil.equals(this.iId, var2.iId) && JceUtil.equals(this.sTitle, var2.sTitle) && JceUtil.equals(this.sSubTitle, var2.sSubTitle) && JceUtil.equals(this.sIcon, var2.sIcon) && JceUtil.equals(this.sAction, var2.sAction)) {
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
        return "com.duowan.HUYA.MAdvertising";
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
        this.sTitle = var1.readString(1, false);
        this.sSubTitle = var1.readString(2, false);
        this.sIcon = var1.readString(3, false);
        this.sAction = var1.readString(4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iId, 0);
        if (this.sTitle != null) {
            var1.write(this.sTitle, 1);
        }

        if (this.sSubTitle != null) {
            var1.write(this.sSubTitle, 2);
        }

        if (this.sIcon != null) {
            var1.write(this.sIcon, 3);
        }

        if (this.sAction != null) {
            var1.write(this.sAction, 4);
        }

    }
}
