//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SenderInfo extends JceStruct implements Cloneable {
    public int iGender = 0;
    public long lImid = 0L;
    public long lUid = 0L;
    public String sNickName = "";

    public SenderInfo() {
    }

    public SenderInfo(long var1, long var3, String var5, int var6) {
        this.lUid = var1;
        this.lImid = var3;
        this.sNickName = var5;
        this.iGender = var6;
    }

    public String className() {
        return "HUYA.SenderInfo";
    }
    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.lImid, "lImid");
        var3.display(this.sNickName, "sNickName");
        var3.display(this.iGender, "iGender");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SenderInfo var2 = (SenderInfo)var1;
                if (JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.lImid, var2.lImid) && JceUtil.equals(this.sNickName, var2.sNickName) && JceUtil.equals(this.iGender, var2.iGender)) {
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
        return "com.duowan.HUYA.SenderInfo";
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
        this.lUid = var1.read(this.lUid, 0, false);
        this.lImid = var1.read(this.lImid, 1, false);
        this.sNickName = var1.readString(2, false);
        this.iGender = var1.read(this.iGender, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        var1.write(this.lImid, 1);
        if (this.sNickName != null) {
            var1.write(this.sNickName, 2);
        }

        var1.write(this.iGender, 3);
    }
}
