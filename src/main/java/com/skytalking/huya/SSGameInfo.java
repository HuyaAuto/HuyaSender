//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SSGameInfo extends JceStruct implements Cloneable {
    public int iAudiences = 0;
    public int iGameId = 0;
    public int iLiveCount = 0;
    public String sGameName = "";
    public String sImgUrl = "";

    public SSGameInfo() {
    }

    public SSGameInfo(String var1, int var2, int var3, int var4, String var5) {
        this.sGameName = var1;
        this.iGameId = var2;
        this.iLiveCount = var3;
        this.iAudiences = var4;
        this.sImgUrl = var5;
    }

    public String className() {
        return "HUYA.SSGameInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sGameName, "sGameName");
        var3.display(this.iGameId, "iGameId");
        var3.display(this.iLiveCount, "iLiveCount");
        var3.display(this.iAudiences, "iAudiences");
        var3.display(this.sImgUrl, "sImgUrl");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SSGameInfo var2 = (SSGameInfo)var1;
                if (JceUtil.equals(this.sGameName, var2.sGameName) && JceUtil.equals(this.iGameId, var2.iGameId) && JceUtil.equals(this.iLiveCount, var2.iLiveCount) && JceUtil.equals(this.iAudiences, var2.iAudiences) && JceUtil.equals(this.sImgUrl, var2.sImgUrl)) {
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
        return "com.duowan.HUYA.SSGameInfo";
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
        this.sGameName = var1.readString(0, false);
        this.iGameId = var1.read(this.iGameId, 1, false);
        this.iLiveCount = var1.read(this.iLiveCount, 2, false);
        this.iAudiences = var1.read(this.iAudiences, 3, false);
        this.sImgUrl = var1.readString(4, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sGameName != null) {
            var1.write(this.sGameName, 0);
        }

        var1.write(this.iGameId, 1);
        var1.write(this.iLiveCount, 2);
        var1.write(this.iAudiences, 3);
        if (this.sImgUrl != null) {
            var1.write(this.sImgUrl, 4);
        }

    }
}
