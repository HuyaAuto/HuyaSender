//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class WSDeRegisterReq extends JceStruct implements Cloneable {
    public int iDeRegisterType = 0;

    public WSDeRegisterReq() {
    }

    public WSDeRegisterReq(int var1) {
        this.iDeRegisterType = var1;
    }

    public String className() {
        return "HUYA.WSDeRegisterReq";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.iDeRegisterType, "iDeRegisterType");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            WSDeRegisterReq var2 = (WSDeRegisterReq)var1;
            return JceUtil.equals(this.iDeRegisterType, var2.iDeRegisterType);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.WSDeRegisterReq";
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
        this.iDeRegisterType = var1.read(this.iDeRegisterType, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iDeRegisterType, 0);
    }
}
