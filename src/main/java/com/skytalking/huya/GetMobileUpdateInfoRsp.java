//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetMobileUpdateInfoRsp extends JceStruct implements Cloneable {
    public int iIsSilenceDown = 0;
    public int iIsUpdate = 0;
    public int iIsUpdateType = 0;
    public int iRuleId = 0;
    public int iTipType = 0;
    public int iVersionCode = 0;
    public String sAppUrl = "";
    public String sFileMd5 = "";
    public String sInfo = "";
    public String sMd5 = "";
    public String sNewVersion = "";


    public GetMobileUpdateInfoRsp() {
    }

    public GetMobileUpdateInfoRsp(int var1, int var2, String var3, String var4, String var5, int var6, String var7, int var8, int var9, String var10, int var11) {
        this.iIsUpdate = var1;
        this.iIsUpdateType = var2;
        this.sInfo = var3;
        this.sNewVersion = var4;
        this.sAppUrl = var5;
        this.iTipType = var6;
        this.sMd5 = var7;
        this.iRuleId = var8;
        this.iVersionCode = var9;
        this.sFileMd5 = var10;
        this.iIsSilenceDown = var11;
    }

    public String className() {
        return "HUYA.GetMobileUpdateInfoRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iIsUpdate, "iIsUpdate");
        var3.display(this.iIsUpdateType, "iIsUpdateType");
        var3.display(this.sInfo, "sInfo");
        var3.display(this.sNewVersion, "sNewVersion");
        var3.display(this.sAppUrl, "sAppUrl");
        var3.display(this.iTipType, "iTipType");
        var3.display(this.sMd5, "sMd5");
        var3.display(this.iRuleId, "iRuleId");
        var3.display(this.iVersionCode, "iVersionCode");
        var3.display(this.sFileMd5, "sFileMd5");
        var3.display(this.iIsSilenceDown, "iIsSilenceDown");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 == null || this.getClass() != var1.getClass()) {
                return false;
            }

            GetMobileUpdateInfoRsp var2 = (GetMobileUpdateInfoRsp)var1;
            if (!JceUtil.equals(this.iIsUpdate, var2.iIsUpdate) || !JceUtil.equals(this.iIsUpdateType, var2.iIsUpdateType) || !JceUtil.equals(this.sInfo, var2.sInfo) || !JceUtil.equals(this.sNewVersion, var2.sNewVersion) || !JceUtil.equals(this.sAppUrl, var2.sAppUrl) || !JceUtil.equals(this.iTipType, var2.iTipType) || !JceUtil.equals(this.sMd5, var2.sMd5) || !JceUtil.equals(this.iRuleId, var2.iRuleId) || !JceUtil.equals(this.iVersionCode, var2.iVersionCode) || !JceUtil.equals(this.sFileMd5, var2.sFileMd5) || !JceUtil.equals(this.iIsSilenceDown, var2.iIsSilenceDown)) {
                return false;
            }
        }

        return true;
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetMobileUpdateInfoRsp";
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
        this.iIsUpdate = var1.read(this.iIsUpdate, 0, false);
        this.iIsUpdateType = var1.read(this.iIsUpdateType, 1, false);
        this.sInfo = var1.readString(2, false);
        this.sNewVersion = var1.readString(3, false);
        this.sAppUrl = var1.readString(4, false);
        this.iTipType = var1.read(this.iTipType, 5, false);
        this.sMd5 = var1.readString(6, false);
        this.iRuleId = var1.read(this.iRuleId, 7, false);
        this.iVersionCode = var1.read(this.iVersionCode, 8, false);
        this.sFileMd5 = var1.readString(9, false);
        this.iIsSilenceDown = var1.read(this.iIsSilenceDown, 10, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iIsUpdate, 0);
        var1.write(this.iIsUpdateType, 1);
        if (this.sInfo != null) {
            var1.write(this.sInfo, 2);
        }

        if (this.sNewVersion != null) {
            var1.write(this.sNewVersion, 3);
        }

        if (this.sAppUrl != null) {
            var1.write(this.sAppUrl, 4);
        }

        var1.write(this.iTipType, 5);
        if (this.sMd5 != null) {
            var1.write(this.sMd5, 6);
        }

        var1.write(this.iRuleId, 7);
        var1.write(this.iVersionCode, 8);
        if (this.sFileMd5 != null) {
            var1.write(this.sFileMd5, 9);
        }

        var1.write(this.iIsSilenceDown, 10);
    }
}
