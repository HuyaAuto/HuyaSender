//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetAssociateKeyWordRsp extends JceStruct implements Cloneable {
    static ArrayList<String> cache_vAssociateWords;
    public ArrayList<String> vAssociateWords = null;


    public GetAssociateKeyWordRsp() {
    }

    public GetAssociateKeyWordRsp(ArrayList<String> var1) {
        this.vAssociateWords = var1;
    }

    public String className() {
        return "HUYA.GetAssociateKeyWordRsp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.vAssociateWords, "vAssociateWords");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            GetAssociateKeyWordRsp var2 = (GetAssociateKeyWordRsp)var1;
            return JceUtil.equals(this.vAssociateWords, var2.vAssociateWords);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetAssociateKeyWordRsp";
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
        if (cache_vAssociateWords == null) {
            cache_vAssociateWords = new ArrayList();
            cache_vAssociateWords.add("");
        }

        this.vAssociateWords = (ArrayList)var1.read(cache_vAssociateWords, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vAssociateWords != null) {
            var1.write(this.vAssociateWords, 0);
        }

    }
}
