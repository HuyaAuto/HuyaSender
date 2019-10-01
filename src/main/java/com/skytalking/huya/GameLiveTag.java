//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GameLiveTag extends JceStruct implements Cloneable {
    public boolean bIsShow = true;
    public int iTagId = 0;
    public String sTagName = "";



    public GameLiveTag() {
    }

    public GameLiveTag(int var1, String var2, boolean var3) {
        this.iTagId = var1;
        this.sTagName = var2;
        this.bIsShow = var3;
    }

    public String className() {
        return "HUYA.GameLiveTag";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iTagId, "iTagId");
        var3.display(this.sTagName, "sTagName");
        var3.display(this.bIsShow, "bIsShow");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GameLiveTag var2 = (GameLiveTag)var1;
                if (JceUtil.equals(this.iTagId, var2.iTagId) && JceUtil.equals(this.sTagName, var2.sTagName) && JceUtil.equals(this.bIsShow, var2.bIsShow)) {
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
        return "com.duowan.HUYA.GameLiveTag";
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
        this.iTagId = var1.read(this.iTagId, 0, false);
        this.sTagName = var1.readString(1, false);
        this.bIsShow = var1.read(this.bIsShow, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iTagId, 0);
        if (this.sTagName != null) {
            var1.write(this.sTagName, 1);
        }

        var1.write(this.bIsShow, 2);
    }
}
