//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class SubscribeResp extends JceStruct implements Cloneable {
    static Subscriber cache_tFrom;
    static Activity cache_tTo;
    public int iAction = 0;
    public int iFlag = 0;
    public Subscriber tFrom = null;
    public Activity tTo = null;

    public SubscribeResp() {
    }

    public SubscribeResp(Subscriber var1, Activity var2, int var3, int var4) {
        this.tFrom = var1;
        this.tTo = var2;
        this.iAction = var3;
        this.iFlag = var4;
    }

    public String className() {
        return "HUYA.SubscribeResp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tFrom, "tFrom");
        var3.display(this.tTo, "tTo");
        var3.display(this.iAction, "iAction");
        var3.display(this.iFlag, "iFlag");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                SubscribeResp var2 = (SubscribeResp)var1;
                if (JceUtil.equals(this.tFrom, var2.tFrom) && JceUtil.equals(this.tTo, var2.tTo) && JceUtil.equals(this.iAction, var2.iAction) && JceUtil.equals(this.iFlag, var2.iFlag)) {
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
        return "com.duowan.HUYA.SubscribeResp";
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
        this.iAction = var1.read(this.iAction, 2, false);
        this.iFlag = var1.read(this.iFlag, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tFrom != null) {
            var1.write(this.tFrom, 0);
        }

        if (this.tTo != null) {
            var1.write(this.tTo, 1);
        }

        var1.write(this.iAction, 2);
        var1.write(this.iFlag, 3);
    }
}
