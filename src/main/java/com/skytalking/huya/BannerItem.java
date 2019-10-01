//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class BannerItem extends JceStruct implements Cloneable {
    public String sContent = "";
    public String sExtval1 = "";
    public String sImage = "";
    public String sMarketing = "";
    public String sSubject = "";
    public String sUrl = "";



    public BannerItem() {
    }

    public BannerItem(String var1, String var2, String var3, String var4, String var5, String var6) {
        this.sExtval1 = var1;
        this.sImage = var2;
        this.sMarketing = var3;
        this.sSubject = var4;
        this.sUrl = var5;
        this.sContent = var6;
    }

    public String className() {
        return "HUYA.BannerItem";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sExtval1, "sExtval1");
        var3.display(this.sImage, "sImage");
        var3.display(this.sMarketing, "sMarketing");
        var3.display(this.sSubject, "sSubject");
        var3.display(this.sUrl, "sUrl");
        var3.display(this.sContent, "sContent");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                BannerItem var2 = (BannerItem)var1;
                if (JceUtil.equals(this.sExtval1, var2.sExtval1) && JceUtil.equals(this.sImage, var2.sImage) && JceUtil.equals(this.sMarketing, var2.sMarketing) && JceUtil.equals(this.sSubject, var2.sSubject) && JceUtil.equals(this.sUrl, var2.sUrl) && JceUtil.equals(this.sContent, var2.sContent)) {
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
        return "com.duowan.HUYA.BannerItem";
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
        this.sExtval1 = var1.readString(0, false);
        this.sImage = var1.readString(1, false);
        this.sMarketing = var1.readString(2, false);
        this.sSubject = var1.readString(3, false);
        this.sUrl = var1.readString(4, false);
        this.sContent = var1.readString(5, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sExtval1 != null) {
            var1.write(this.sExtval1, 0);
        }

        if (this.sImage != null) {
            var1.write(this.sImage, 1);
        }

        if (this.sMarketing != null) {
            var1.write(this.sMarketing, 2);
        }

        if (this.sSubject != null) {
            var1.write(this.sSubject, 3);
        }

        if (this.sUrl != null) {
            var1.write(this.sUrl, 4);
        }

        if (this.sContent != null) {
            var1.write(this.sContent, 5);
        }

    }
}
