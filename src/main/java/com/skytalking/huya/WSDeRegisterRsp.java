//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class WSDeRegisterRsp extends JceStruct implements Cloneable {
    public int iResCode = 0;

    public WSDeRegisterRsp() {
    }

    public WSDeRegisterRsp(int var1) {
        this.iResCode = var1;
    }

    public String className() {
        return "HUYA.WSDeRegisterRsp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.iResCode, "iResCode");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            WSDeRegisterRsp var2 = (WSDeRegisterRsp)var1;
            return JceUtil.equals(this.iResCode, var2.iResCode);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.WSDeRegisterRsp";
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
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iResCode, 0);
    }
}
