//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SubscribeReq extends JceStruct implements Cloneable {
    static Subscriber cache_tFrom;
    static UserId cache_tId;
    static Activity cache_tTo;
    public int iAction = 0;
    public Subscriber tFrom = null;
    public UserId tId = null;
    public Activity tTo = null;


    public SubscribeReq() {
    }

    public SubscribeReq(UserId var1, Subscriber var2, Activity var3, int var4) {
        this.tId = var1;
        this.tFrom = var2;
        this.tTo = var3;
        this.iAction = var4;
    }

    public String className() {
        return "HUYA.SubscribeReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.tFrom, "tFrom");
        var3.display(this.tTo, "tTo");
        var3.display(this.iAction, "iAction");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SubscribeReq var2 = (SubscribeReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.tFrom, var2.tFrom) && JceUtil.equals(this.tTo, var2.tTo) && JceUtil.equals(this.iAction, var2.iAction)) {
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
        return "com.duowan.HUYA.SubscribeReq";
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
        if (cache_tFrom == null) {
            cache_tFrom = new Subscriber();
        }

        this.tFrom = (Subscriber)var1.read(cache_tFrom, 1, false);
        if (cache_tTo == null) {
            cache_tTo = new Activity();
        }

        this.tTo = (Activity)var1.read(cache_tTo, 2, false);
        this.iAction = var1.read(this.iAction, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        if (this.tFrom != null) {
            var1.write(this.tFrom, 1);
        }

        if (this.tTo != null) {
            var1.write(this.tTo, 2);
        }

        var1.write(this.iAction, 3);
    }
}
