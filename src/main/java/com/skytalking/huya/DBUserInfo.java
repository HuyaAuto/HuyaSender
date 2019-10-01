//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class DBUserInfo extends JceStruct implements Cloneable {
    public int iBirthday = 0;
    public int iJifen = 0;
    public int iLogoIndex = 0;
    public int iSex = 0;
    public long lImid = 0L;
    public long lUid = 0L;
    public String sAccount = "";
    public String sArea = "";
    public String sCity = "";
    public String sHdlogo = "";
    public String sIntro = "";
    public String sNick = "";
    public String sPassport = "";
    public String sProvince = "";
    public String sRegisterTime = "";
    public String sSessionCard = "";
    public String sSign = "";


    public DBUserInfo() {
    }

    public DBUserInfo(long var1, String var3, String var4, String var5, int var6, int var7, String var8, String var9, String var10, String var11, String var12, int var13, String var14, String var15, String var16, long var17, int var19) {
        this.lUid = var1;
        this.sPassport = var3;
        this.sAccount = var4;
        this.sNick = var5;
        this.iSex = var6;
        this.iBirthday = var7;
        this.sArea = var8;
        this.sProvince = var9;
        this.sCity = var10;
        this.sSign = var11;
        this.sIntro = var12;
        this.iJifen = var13;
        this.sRegisterTime = var14;
        this.sHdlogo = var15;
        this.sSessionCard = var16;
        this.lImid = var17;
        this.iLogoIndex = var19;
    }

    public String className() {
        return "HUYA.DBUserInfo";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lUid, "lUid");
        var3.display(this.sPassport, "sPassport");
        var3.display(this.sAccount, "sAccount");
        var3.display(this.sNick, "sNick");
        var3.display(this.iSex, "iSex");
        var3.display(this.iBirthday, "iBirthday");
        var3.display(this.sArea, "sArea");
        var3.display(this.sProvince, "sProvince");
        var3.display(this.sCity, "sCity");
        var3.display(this.sSign, "sSign");
        var3.display(this.sIntro, "sIntro");
        var3.display(this.iJifen, "iJifen");
        var3.display(this.sRegisterTime, "sRegisterTime");
        var3.display(this.sHdlogo, "sHdlogo");
        var3.display(this.sSessionCard, "sSessionCard");
        var3.display(this.lImid, "lImid");
        var3.display(this.iLogoIndex, "iLogoIndex");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                DBUserInfo var2 = (DBUserInfo)var1;
                if (JceUtil.equals(this.lUid, var2.lUid) && JceUtil.equals(this.sPassport, var2.sPassport) && JceUtil.equals(this.sAccount, var2.sAccount) && JceUtil.equals(this.sNick, var2.sNick) && JceUtil.equals(this.iSex, var2.iSex) && JceUtil.equals(this.iBirthday, var2.iBirthday) && JceUtil.equals(this.sArea, var2.sArea) && JceUtil.equals(this.sProvince, var2.sProvince) && JceUtil.equals(this.sCity, var2.sCity) && JceUtil.equals(this.sSign, var2.sSign) && JceUtil.equals(this.sIntro, var2.sIntro) && JceUtil.equals(this.iJifen, var2.iJifen) && JceUtil.equals(this.sRegisterTime, var2.sRegisterTime) && JceUtil.equals(this.sHdlogo, var2.sHdlogo) && JceUtil.equals(this.sSessionCard, var2.sSessionCard) && JceUtil.equals(this.lImid, var2.lImid) && JceUtil.equals(this.iLogoIndex, var2.iLogoIndex)) {
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
        return "com.duowan.HUYA.DBUserInfo";
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
        this.sPassport = var1.readString(1, false);
        this.sAccount = var1.readString(2, false);
        this.sNick = var1.readString(3, false);
        this.iSex = var1.read(this.iSex, 4, false);
        this.iBirthday = var1.read(this.iBirthday, 5, false);
        this.sArea = var1.readString(6, false);
        this.sProvince = var1.readString(7, false);
        this.sCity = var1.readString(8, false);
        this.sSign = var1.readString(9, false);
        this.sIntro = var1.readString(10, false);
        this.iJifen = var1.read(this.iJifen, 11, false);
        this.sRegisterTime = var1.readString(12, false);
        this.sHdlogo = var1.readString(13, false);
        this.sSessionCard = var1.readString(14, false);
        this.lImid = var1.read(this.lImid, 16, false);
        this.iLogoIndex = var1.read(this.iLogoIndex, 17, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lUid, 0);
        if (this.sPassport != null) {
            var1.write(this.sPassport, 1);
        }

        if (this.sAccount != null) {
            var1.write(this.sAccount, 2);
        }

        if (this.sNick != null) {
            var1.write(this.sNick, 3);
        }

        var1.write(this.iSex, 4);
        var1.write(this.iBirthday, 5);
        if (this.sArea != null) {
            var1.write(this.sArea, 6);
        }

        if (this.sProvince != null) {
            var1.write(this.sProvince, 7);
        }

        if (this.sCity != null) {
            var1.write(this.sCity, 8);
        }

        if (this.sSign != null) {
            var1.write(this.sSign, 9);
        }

        if (this.sIntro != null) {
            var1.write(this.sIntro, 10);
        }

        var1.write(this.iJifen, 11);
        if (this.sRegisterTime != null) {
            var1.write(this.sRegisterTime, 12);
        }

        if (this.sHdlogo != null) {
            var1.write(this.sHdlogo, 13);
        }

        if (this.sSessionCard != null) {
            var1.write(this.sSessionCard, 14);
        }

        var1.write(this.lImid, 16);
        var1.write(this.iLogoIndex, 17);
    }
}
