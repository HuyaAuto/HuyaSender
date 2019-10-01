//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class GameChangeInfo extends JceStruct implements Cloneable {
    public int iCustom = 0;
    public int iGameId = 0;

    public GameChangeInfo() {
    }

    public GameChangeInfo(int var1, int var2) {
        this.iGameId = var1;
        this.iCustom = var2;
    }

    public String className() {
        return "HUYA.GameChangeInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iGameId, "iGameId");
        var3.display(this.iCustom, "iCustom");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GameChangeInfo var2 = (GameChangeInfo)var1;
                if (JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.iCustom, var2.iCustom)) {
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
        return "com.duowan.HUYA.GameChangeInfo";
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
        this.iCustom = var1.read(this.iCustom, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iGameId, 0);
        var1.write(this.iCustom, 1);
    }
}
