//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class SMGetFinalHotKeywordsRsp extends JceStruct implements Cloneable {
    static ArrayList<String> cache_vHotKeys;
    public ArrayList<String> vHotKeys = null;


    public SMGetFinalHotKeywordsRsp() {
    }

    public SMGetFinalHotKeywordsRsp(ArrayList<String> var1) {
        this.vHotKeys = var1;
    }

    public String className() {
        return "HUYA.SMGetFinalHotKeywordsRsp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.vHotKeys, "vHotKeys");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            SMGetFinalHotKeywordsRsp var2 = (SMGetFinalHotKeywordsRsp)var1;
            return JceUtil.equals(this.vHotKeys, var2.vHotKeys);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.SMGetFinalHotKeywordsRsp";
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
        if (cache_vHotKeys == null) {
            cache_vHotKeys = new ArrayList();
            cache_vHotKeys.add("");
        }

        this.vHotKeys = (ArrayList)var1.read(cache_vHotKeys, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vHotKeys != null) {
            var1.write(this.vHotKeys, 0);
        }

    }
}
