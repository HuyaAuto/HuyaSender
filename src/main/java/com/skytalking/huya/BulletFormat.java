//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class BulletFormat extends JceStruct implements Cloneable {
    public int iFontColor = -1;
    public int iFontSize = 4;
    public int iPopupStyle = 0;
    public int iTextSpeed = 0;
    public int iTransitionType = 1;

    public BulletFormat() {
    }

    public BulletFormat(int var1, int var2, int var3, int var4, int var5) {
        this.iFontColor = var1;
        this.iFontSize = var2;
        this.iTextSpeed = var3;
        this.iTransitionType = var4;
        this.iPopupStyle = var5;
    }

    public String className() {
        return "HUYA.BulletFormat";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iFontColor, "iFontColor");
        var3.display(this.iFontSize, "iFontSize");
        var3.display(this.iTextSpeed, "iTextSpeed");
        var3.display(this.iTransitionType, "iTransitionType");
        var3.display(this.iPopupStyle, "iPopupStyle");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                BulletFormat var2 = (BulletFormat)var1;
                if (JceUtil.equals(this.iFontColor, var2.iFontColor) && JceUtil.equals(this.iFontSize, var2.iFontSize) && JceUtil.equals(this.iTextSpeed, var2.iTextSpeed) && JceUtil.equals(this.iTransitionType, var2.iTransitionType) && JceUtil.equals(this.iPopupStyle, var2.iPopupStyle)) {
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
        return "com.duowan.HUYA.BulletFormat";
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
        this.iFontColor = var1.read(this.iFontColor, 0, false);
        this.iFontSize = var1.read(this.iFontSize, 1, false);
        this.iTextSpeed = var1.read(this.iTextSpeed, 2, false);
        this.iTransitionType = var1.read(this.iTransitionType, 3, false);
        this.iPopupStyle = var1.read(this.iPopupStyle, 4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iFontColor, 0);
        var1.write(this.iFontSize, 1);
        var1.write(this.iTextSpeed, 2);
        var1.write(this.iTransitionType, 3);
        var1.write(this.iPopupStyle, 4);
    }
}
