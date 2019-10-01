//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class LiveListRecGameItem extends JceStruct implements Cloneable {
    public int iGameId = 0;
    public String sAction = "";
    public String sGameName = "";
    public String sImageUrl = "";

    public LiveListRecGameItem() {
    }

    public LiveListRecGameItem(int var1, String var2, String var3, String var4) {
        this.iGameId = var1;
        this.sAction = var2;
        this.sImageUrl = var3;
        this.sGameName = var4;
    }

    public String className() {
        return "HUYA.LiveListRecGameItem";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iGameId, "iGameId");
        var3.display(this.sAction, "sAction");
        var3.display(this.sImageUrl, "sImageUrl");
        var3.display(this.sGameName, "sGameName");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveListRecGameItem var2 = (LiveListRecGameItem)var1;
                if (JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.sAction, var2.sAction) && JceUtil.equals(this.sImageUrl, var2.sImageUrl) && JceUtil.equals(this.sGameName, var2.sGameName)) {
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
        return "com.duowan.HUYA.LiveListRecGameItem";
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
        this.sAction = var1.readString(1, false);
        this.sImageUrl = var1.readString(2, false);
        this.sGameName = var1.readString(3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iGameId, 0);
        if (this.sAction != null) {
            var1.write(this.sAction, 1);
        }

        if (this.sImageUrl != null) {
            var1.write(this.sImageUrl, 2);
        }

        if (this.sGameName != null) {
            var1.write(this.sGameName, 3);
        }

    }
}
