//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class EndLiveNotice extends JceStruct implements Cloneable {
    public int iReason = 0;
    public long lLiveId = 0L;
    public long lPresenterUid = 0L;

    public EndLiveNotice() {
    }

    public EndLiveNotice(long var1, int var3, long var4) {
        this.lPresenterUid = var1;
        this.iReason = var3;
        this.lLiveId = var4;
    }

    public String className() {
        return "HUYA.EndLiveNotice";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.lPresenterUid, "lPresenterUid");
        var3.display(this.iReason, "iReason");
        var3.display(this.lLiveId, "lLiveId");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                EndLiveNotice var2 = (EndLiveNotice)var1;
                if (JceUtil.equals(this.lPresenterUid, var2.lPresenterUid) && JceUtil.equals(this.iReason, var2.iReason) && JceUtil.equals(this.lLiveId, var2.lLiveId)) {
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
        return "com.duowan.HUYA.EndLiveNotice";
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
        this.lPresenterUid = var1.read(this.lPresenterUid, 0, false);
        this.iReason = var1.read(this.iReason, 1, false);
        this.lLiveId = var1.read(this.lLiveId, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.lPresenterUid, 0);
        var1.write(this.iReason, 1);
        var1.write(this.lLiveId, 2);
    }
}
