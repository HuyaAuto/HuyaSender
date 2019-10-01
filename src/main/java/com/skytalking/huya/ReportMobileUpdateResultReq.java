//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class ReportMobileUpdateResultReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public int iRuleId = 0;
    public int iType = 0;
    public String sSystemMobileInfo = "";
    public UserId tId = null;



    public ReportMobileUpdateResultReq() {
    }

    public ReportMobileUpdateResultReq(UserId var1, int var2, int var3, String var4) {
        this.tId = var1;
        this.iRuleId = var2;
        this.iType = var3;
        this.sSystemMobileInfo = var4;
    }

    public String className() {
        return "HUYA.ReportMobileUpdateResultReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.iRuleId, "iRuleId");
        var3.display(this.iType, "iType");
        var3.display(this.sSystemMobileInfo, "sSystemMobileInfo");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                ReportMobileUpdateResultReq var2 = (ReportMobileUpdateResultReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.iRuleId, var2.iRuleId) && JceUtil.equals(this.iType, var2.iType) && JceUtil.equals(this.sSystemMobileInfo, var2.sSystemMobileInfo)) {
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
        return "com.duowan.HUYA.ReportMobileUpdateResultReq";
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
        if (cache_tId == null) {
            cache_tId = new UserId();
        }

        this.tId = (UserId)var1.read(cache_tId, 0, false);
        this.iRuleId = var1.read(this.iRuleId, 1, false);
        this.iType = var1.read(this.iType, 2, false);
        this.sSystemMobileInfo = var1.readString(3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        var1.write(this.iRuleId, 1);
        var1.write(this.iType, 2);
        if (this.sSystemMobileInfo != null) {
            var1.write(this.sSystemMobileInfo, 3);
        }

    }
}
