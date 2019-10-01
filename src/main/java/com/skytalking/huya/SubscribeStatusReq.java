//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;
import com.skytalking.huya.Subscriber;
import com.skytalking.huya.UserId;

public final class SubscribeStatusReq extends JceStruct implements Cloneable {
    static Subscriber cache_tFrom;
    static UserId cache_tId;
    static Activity cache_tTo;
    public Subscriber tFrom = null;
    public UserId tId = null;
    public Activity tTo = null;


    public SubscribeStatusReq() {
    }

    public SubscribeStatusReq(UserId var1, Subscriber var2, Activity var3) {
        this.tId = var1;
        this.tFrom = var2;
        this.tTo = var3;
    }

    public String className() {
        return "HUYA.SubscribeStatusReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.tFrom, "tFrom");
        var3.display(this.tTo, "tTo");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SubscribeStatusReq var2 = (SubscribeStatusReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.tFrom, var2.tFrom) && JceUtil.equals(this.tTo, var2.tTo)) {
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
        return "com.duowan.HUYA.SubscribeStatusReq";
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

    }
}
