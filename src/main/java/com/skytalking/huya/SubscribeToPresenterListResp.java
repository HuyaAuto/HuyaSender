//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class SubscribeToPresenterListResp extends JceStruct implements Cloneable {
    static Subscriber cache_tFrom;
    static ArrayList<PresenterActivity> cache_vKeys;
    public Subscriber tFrom = null;
    public ArrayList<PresenterActivity> vKeys = null;

    public SubscribeToPresenterListResp() {
    }

    public SubscribeToPresenterListResp(Subscriber var1, ArrayList<PresenterActivity> var2) {
        this.tFrom = var1;
        this.vKeys = var2;
    }

    public String className() {
        return "HUYA.SubscribeToPresenterListResp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tFrom, "tFrom");
        var3.display(this.vKeys, "vKeys");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SubscribeToPresenterListResp var2 = (SubscribeToPresenterListResp)var1;
                if (JceUtil.equals(this.tFrom, var2.tFrom) && JceUtil.equals(this.vKeys, var2.vKeys)) {
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
        return "com.duowan.HUYA.SubscribeToPresenterListResp";
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
        if (cache_tFrom == null) {
            cache_tFrom = new Subscriber();
        }

        this.tFrom = (Subscriber)var1.read(cache_tFrom, 0, false);
        if (cache_vKeys == null) {
            cache_vKeys = new ArrayList();
            PresenterActivity var2 = new PresenterActivity();
            cache_vKeys.add(var2);
        }

        this.vKeys = (ArrayList)var1.read(cache_vKeys, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tFrom != null) {
            var1.write(this.tFrom, 0);
        }

        if (this.vKeys != null) {
            var1.write(this.vKeys, 1);
        }

    }
}
