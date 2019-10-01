//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class CardItemCountInfo extends JceStruct implements Cloneable {
    public long iItemCount = 0L;
    public int iItemType = 0;

    public CardItemCountInfo() {
    }

    public CardItemCountInfo(int var1, long var2) {
        this.iItemType = var1;
        this.iItemCount = var2;
    }

    public String className() {
        return "HUYA.CardItemCountInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iItemType, "iItemType");
        var3.display(this.iItemCount, "iItemCount");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                CardItemCountInfo var2 = (CardItemCountInfo)var1;
                if (JceUtil.equals(this.iItemType, var2.iItemType) && JceUtil.equals(this.iItemCount, var2.iItemCount)) {
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
        return "com.duowan.HUYA.CardItemCountInfo";
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
        this.iItemType = var1.read(this.iItemType, 0, false);
        this.iItemCount = var1.read(this.iItemCount, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iItemType, 0);
        var1.write(this.iItemCount, 1);
    }
}
