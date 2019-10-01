//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class LiveHotItemInfo extends JceStruct implements Cloneable {
    public String sTitle = "";
    public String sUrl = "";

    public LiveHotItemInfo() {
    }

    public LiveHotItemInfo(String var1, String var2) {
        this.sTitle = var1;
        this.sUrl = var2;
    }

    public String className() {
        return "HUYA.LiveHotItemInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sTitle, "sTitle");
        var3.display(this.sUrl, "sUrl");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveHotItemInfo var2 = (LiveHotItemInfo)var1;
                if (JceUtil.equals(this.sTitle, var2.sTitle) && JceUtil.equals(this.sUrl, var2.sUrl)) {
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
        return "com.duowan.HUYA.LiveHotItemInfo";
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
        this.sTitle = var1.readString(0, false);
        this.sUrl = var1.readString(1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sTitle != null) {
            var1.write(this.sTitle, 0);
        }

        if (this.sUrl != null) {
            var1.write(this.sUrl, 1);
        }

    }
}
