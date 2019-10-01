//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class UserId extends JceStruct implements Cloneable {
    public int iTokenType = 0;
    public long lUid = 0L;
    public String sCookie = "";
    public String sGuid = "";
    public String sHuYaUA = "";
    public String sToken = "";

    public UserId() {
    }

    public UserId(long var1, String var3, String var4, String var5, String var6, int var7) {
        this.lUid = var1;
        this.sGuid = var3;
        this.sToken = var4;
        this.sHuYaUA = var5;
        this.sCookie = var6;
        this.iTokenType = var7;
    }

    public String className() {
        return "HUYA.UserId";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.sGuid, "sGuid");
        var3.display(this.sToken, "sToken");
        var3.display(this.sHuYaUA, "sHuYaUA");
        var3.display(this.sCookie, "sCookie");
        var3.display(this.iTokenType, "iTokenType");
    }

    public String fullClassName() {
        return "com.duowan.HUYA.UserId";
    }

    public void readFrom(JceInputStream var1) {
        this.lUid = var1.read(this.lUid, 0, false);
        this.sGuid = var1.readString(1, false);
        this.sToken = var1.readString(2, false);
        this.sHuYaUA = var1.readString(3, false);
        this.sCookie = var1.readString(4, false);
        this.iTokenType = var1.read(this.iTokenType, 5, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        if (this.sGuid != null) {
            var1.write(this.sGuid, 1);
        }

        if (this.sToken != null) {
            var1.write(this.sToken, 2);
        }

        if (this.sHuYaUA != null) {
            var1.write(this.sHuYaUA, 3);
        }

        if (this.sCookie != null) {
            var1.write(this.sCookie, 4);
        }

        var1.write(this.iTokenType, 5);
    }
}
