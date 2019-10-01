//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class GameFixInfo extends JceStruct implements Cloneable {
    public int iGameId = 0;
    public String sGameFullName = "";
    public String sGameShortName = "";
    public String sImageUrl = "";
    public String sSkipUrl = "";


    public GameFixInfo() {
    }

    public GameFixInfo(int var1, String var2, String var3, String var4, String var5) {
        this.iGameId = var1;
        this.sGameFullName = var2;
        this.sImageUrl = var3;
        this.sSkipUrl = var4;
        this.sGameShortName = var5;
    }

    public String className() {
        return "HUYA.GameFixInfo";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iGameId, "iGameId");
        var3.display(this.sGameFullName, "sGameFullName");
        var3.display(this.sImageUrl, "sImageUrl");
        var3.display(this.sSkipUrl, "sSkipUrl");
        var3.display(this.sGameShortName, "sGameShortName");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GameFixInfo var2 = (GameFixInfo)var1;
                if (JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.sGameFullName, var2.sGameFullName) && JceUtil.equals(this.sImageUrl, var2.sImageUrl) && JceUtil.equals(this.sSkipUrl, var2.sSkipUrl) && JceUtil.equals(this.sGameShortName, var2.sGameShortName)) {
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
        return "com.duowan.HUYA.GameFixInfo";
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
        this.iGameId = var1.read(this.iGameId, 0, false);
        this.sGameFullName = var1.readString(1, false);
        this.sImageUrl = var1.readString(2, false);
        this.sSkipUrl = var1.readString(3, false);
        this.sGameShortName = var1.readString(4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iGameId, 0);
        if (this.sGameFullName != null) {
            var1.write(this.sGameFullName, 1);
        }

        if (this.sImageUrl != null) {
            var1.write(this.sImageUrl, 2);
        }

        if (this.sSkipUrl != null) {
            var1.write(this.sSkipUrl, 3);
        }

        if (this.sGameShortName != null) {
            var1.write(this.sGameShortName, 4);
        }

    }
}
