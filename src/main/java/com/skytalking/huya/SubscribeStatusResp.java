//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;
import com.skytalking.huya.Activity;
import com.skytalking.huya.Subscriber;

public final class SubscribeStatusResp extends JceStruct implements Cloneable {
    static Subscriber cache_tFrom;
    static Activity cache_tTo;
    public int iStatus = 0;
    public int iSubscribedCount = 0;
    public Subscriber tFrom = null;
    public Activity tTo = null;



    public SubscribeStatusResp() {
    }

    public SubscribeStatusResp(Subscriber var1, Activity var2, int var3, int var4) {
        this.tFrom = var1;
        this.tTo = var2;
        this.iSubscribedCount = var3;
        this.iStatus = var4;
    }

    public String className() {
        return "HUYA.SubscribeStatusResp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tFrom, "tFrom");
        var3.display(this.tTo, "tTo");
        var3.display(this.iSubscribedCount, "iSubscribedCount");
        var3.display(this.iStatus, "iStatus");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SubscribeStatusResp var2 = (SubscribeStatusResp)var1;
                if (JceUtil.equals(this.tFrom, var2.tFrom) && JceUtil.equals(this.tTo, var2.tTo) && JceUtil.equals(this.iSubscribedCount, var2.iSubscribedCount) && JceUtil.equals(this.iStatus, var2.iStatus)) {
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
        return "com.duowan.HUYA.SubscribeStatusResp";
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
        if (cache_tTo == null) {
            cache_tTo = new Activity();
        }

        this.tTo = (Activity)var1.read(cache_tTo, 1, false);
        this.iSubscribedCount = var1.read(this.iSubscribedCount, 2, false);
        this.iStatus = var1.read(this.iStatus, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tFrom != null) {
            var1.write(this.tFrom, 0);
        }

        if (this.tTo != null) {
            var1.write(this.tTo, 1);
        }

        var1.write(this.iSubscribedCount, 2);
        var1.write(this.iStatus, 3);
    }
}
