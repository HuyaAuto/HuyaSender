//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class UidNickName extends JceStruct implements Cloneable {
    public long lUid = 0L;
    public String sNickName = "";

    public UidNickName() {
    }

    public UidNickName(long var1, String var3) {
        this.lUid = var1;
        this.sNickName = var3;
    }

    public String className() {
        return "HUYA.UidNickName";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.sNickName, "sNickName");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                UidNickName var2 = (UidNickName)var1;
                if (JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.sNickName, var2.sNickName)) {
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
        return "com.duowan.HUYA.UidNickName";
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
        this.sNickName = var1.readString(1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        if (this.sNickName != null) {
            var1.write(this.sNickName, 1);
        }

    }
}
