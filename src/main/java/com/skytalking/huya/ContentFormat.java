//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class ContentFormat extends JceStruct implements Cloneable {
    public int iFontColor = -1;
    public int iFontSize = 4;
    public int iPopupStyle = 0;

    public ContentFormat() {
    }

    public ContentFormat(int var1, int var2, int var3) {
        this.iFontColor = var1;
        this.iFontSize = var2;
        this.iPopupStyle = var3;
    }

    public String className() {
        return "HUYA.ContentFormat";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iFontColor, "iFontColor");
        var3.display(this.iFontSize, "iFontSize");
        var3.display(this.iPopupStyle, "iPopupStyle");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                ContentFormat var2 = (ContentFormat)var1;
                if (JceUtil.equals(this.iFontColor, var2.iFontColor) && JceUtil.equals(this.iFontSize, var2.iFontSize) && JceUtil.equals(this.iPopupStyle, var2.iPopupStyle)) {
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
        return "com.duowan.HUYA.ContentFormat";
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
        this.iPopupStyle = var1.read(this.iPopupStyle, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iFontColor, 0);
        var1.write(this.iFontSize, 1);
        var1.write(this.iPopupStyle, 2);
    }
}
