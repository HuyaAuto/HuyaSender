//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class MAnnouncement extends JceStruct implements Cloneable {
    public boolean bEnableClose = true;
    public int iId = 0;
    public int iValidTime = 0;
    public String sAction = "";
    public String sContent = "";


    public MAnnouncement() {
    }

    public MAnnouncement(int var1, String var2, String var3, boolean var4, int var5) {
        this.iId = var1;
        this.sContent = var2;
        this.sAction = var3;
        this.bEnableClose = var4;
        this.iValidTime = var5;
    }

    public String className() {
        return "HUYA.MAnnouncement";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iId, "iId");
        var3.display(this.sContent, "sContent");
        var3.display(this.sAction, "sAction");
        var3.display(this.bEnableClose, "bEnableClose");
        var3.display(this.iValidTime, "iValidTime");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MAnnouncement var2 = (MAnnouncement)var1;
                if (JceUtil.equals(this.iId, var2.iId) && JceUtil.equals(this.sContent, var2.sContent) && JceUtil.equals(this.sAction, var2.sAction) && JceUtil.equals(this.bEnableClose, var2.bEnableClose) && JceUtil.equals(this.iValidTime, var2.iValidTime)) {
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
        return "com.duowan.HUYA.MAnnouncement";
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
        this.sContent = var1.readString(1, false);
        this.sAction = var1.readString(2, false);
        this.bEnableClose = var1.read(this.bEnableClose, 3, false);
        this.iValidTime = var1.read(this.iValidTime, 4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iId, 0);
        if (this.sContent != null) {
            var1.write(this.sContent, 1);
        }

        if (this.sAction != null) {
            var1.write(this.sAction, 2);
        }

        var1.write(this.bEnableClose, 3);
        var1.write(this.iValidTime, 4);
    }
}
