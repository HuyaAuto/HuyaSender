//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class LiveProxyValue extends JceStruct implements Cloneable {
    static int cache_eProxyType;
    static ArrayList<String> cache_sProxy;
    public int eProxyType = 0;
    public ArrayList<String> sProxy = null;


    public LiveProxyValue() {
    }

    public LiveProxyValue(int var1, ArrayList<String> var2) {
        this.eProxyType = var1;
        this.sProxy = var2;
    }

    public String className() {
        return "HUYA.LiveProxyValue";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.eProxyType, "eProxyType");
        var3.display(this.sProxy, "sProxy");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveProxyValue var2 = (LiveProxyValue) var1;
                if (JceUtil.equals(this.eProxyType, var2.eProxyType) && JceUtil.equals(this.sProxy, var2.sProxy)) {
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
        return "com.duowan.HUYA.LiveProxyValue";
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
        this.eProxyType = var1.read(this.eProxyType, 0, false);
        if (cache_sProxy == null) {
            cache_sProxy = new ArrayList<String>();
            cache_sProxy.add("");
        }

        this.sProxy = (ArrayList<String>) var1.read(cache_sProxy, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.eProxyType, 0);
        if (this.sProxy != null) {
            var1.write(this.sProxy, 1);
        }

    }
}
