//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetAssociateKeyWordReq extends JceStruct implements Cloneable {
    public String sKeyWord = "";

    public GetAssociateKeyWordReq() {
    }

    public GetAssociateKeyWordReq(String var1) {
        this.sKeyWord = var1;
    }

    public String className() {
        return "HUYA.GetAssociateKeyWordReq";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.sKeyWord, "sKeyWord");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            GetAssociateKeyWordReq var2 = (GetAssociateKeyWordReq)var1;
            return JceUtil.equals(this.sKeyWord, var2.sKeyWord);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetAssociateKeyWordReq";
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
        this.sKeyWord = var1.readString(0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sKeyWord != null) {
            var1.write(this.sKeyWord, 0);
        }

    }
}
