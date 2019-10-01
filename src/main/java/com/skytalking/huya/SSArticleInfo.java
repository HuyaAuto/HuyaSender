//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SSArticleInfo extends JceStruct implements Cloneable {
    public int id = 0;
    public long lCreateTime = 0L;
    public String sTag = "";
    public String sTitle = "";
    public String sUrl = "";


    public SSArticleInfo() {
    }

    public SSArticleInfo(int var1, String var2, String var3, String var4, long var5) {
        this.id = var1;
        this.sTitle = var2;
        this.sUrl = var3;
        this.sTag = var4;
        this.lCreateTime = var5;
    }

    public String className() {
        return "HUYA.SSArticleInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.id, "id");
        var3.display(this.sTitle, "sTitle");
        var3.display(this.sUrl, "sUrl");
        var3.display(this.sTag, "sTag");
        var3.display(this.lCreateTime, "lCreateTime");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SSArticleInfo var2 = (SSArticleInfo)var1;
                if (JceUtil.equals(this.id, var2.id) && JceUtil.equals(this.sTitle, var2.sTitle) && JceUtil.equals(this.sUrl, var2.sUrl) && JceUtil.equals(this.sTag, var2.sTag) && JceUtil.equals(this.lCreateTime, var2.lCreateTime)) {
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
        return "com.duowan.HUYA.SSArticleInfo";
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
        this.id = var1.read(this.id, 0, false);
        this.sTitle = var1.readString(1, false);
        this.sUrl = var1.readString(2, false);
        this.sTag = var1.readString(3, false);
        this.lCreateTime = var1.read(this.lCreateTime, 4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.id, 0);
        if (this.sTitle != null) {
            var1.write(this.sTitle, 1);
        }

        if (this.sUrl != null) {
            var1.write(this.sUrl, 2);
        }

        if (this.sTag != null) {
            var1.write(this.sTag, 3);
        }

        var1.write(this.lCreateTime, 4);
    }
}
