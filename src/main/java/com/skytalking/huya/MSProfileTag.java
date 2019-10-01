//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;
import com.qq.taf.jce.*;

public final class MSProfileTag extends JceStruct implements Cloneable {
    public int iScore = 0;
    public int iTagId = 0;
    public String sTagColor = "";
    public String sTagName = "";


    public MSProfileTag() {
    }

    public MSProfileTag(int var1, String var2, String var3, int var4) {
        this.iTagId = var1;
        this.sTagName = var2;
        this.sTagColor = var3;
        this.iScore = var4;
    }

    public String className() {
        return "HUYA.MSProfileTag";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iTagId, "iTagId");
        var3.display(this.sTagName, "sTagName");
        var3.display(this.sTagColor, "sTagColor");
        var3.display(this.iScore, "iScore");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MSProfileTag var2 = (MSProfileTag)var1;
                if (JceUtil.equals(this.iTagId, var2.iTagId) && JceUtil.equals(this.sTagName, var2.sTagName) && JceUtil.equals(this.sTagColor, var2.sTagColor) && JceUtil.equals(this.iScore, var2.iScore)) {
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
        return "com.duowan.HUYA.MSProfileTag";
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
        this.sTagColor = var1.readString(2, false);
        this.iScore = var1.read(this.iScore, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iTagId, 0);
        if (this.sTagName != null) {
            var1.write(this.sTagName, 1);
        }

        if (this.sTagColor != null) {
            var1.write(this.sTagColor, 2);
        }

        var1.write(this.iScore, 3);
    }
}
