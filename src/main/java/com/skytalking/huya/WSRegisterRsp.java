//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class WSRegisterRsp extends JceStruct implements Cloneable {
    public int iResCode = 0;
    public long lRequestId = 0L;
    public String sBCConnHost = "";
    public String sMessage = "";

    public WSRegisterRsp() {
    }

    public WSRegisterRsp(int var1, long var2, String var4, String var5) {
        this.iResCode = var1;
        this.lRequestId = var2;
        this.sMessage = var4;
        this.sBCConnHost = var5;
    }

    public String className() {
        return "HUYA.WSRegisterRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iResCode, "iResCode");
        var3.display(this.lRequestId, "lRequestId");
        var3.display(this.sMessage, "sMessage");
        var3.display(this.sBCConnHost, "sBCConnHost");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                WSRegisterRsp var2 = (WSRegisterRsp)var1;
                if (JceUtil.equals(this.iResCode, var2.iResCode) && JceUtil.equals(this.lRequestId, var2.lRequestId) && JceUtil.equals(this.sMessage, var2.sMessage) && JceUtil.equals(this.sBCConnHost, var2.sBCConnHost)) {
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
        return "com.duowan.HUYA.WSRegisterRsp";
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
        this.iResCode = var1.read(this.iResCode, 0, false);
        this.lRequestId = var1.read(this.lRequestId, 1, false);
        this.sMessage = var1.readString(2, false);
        this.sBCConnHost = var1.readString(3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iResCode, 0);
        var1.write(this.lRequestId, 1);
        if (this.sMessage != null) {
            var1.write(this.sMessage, 2);
        }

        if (this.sBCConnHost != null) {
            var1.write(this.sBCConnHost, 3);
        }

    }
}
