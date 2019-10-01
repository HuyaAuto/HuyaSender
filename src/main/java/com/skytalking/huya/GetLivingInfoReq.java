//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetLivingInfoReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public long lPresenterUid = 0L;
    public long lSubSid = 0L;
    public long lTopSid = 0L;
    public UserId tId = null;


    public GetLivingInfoReq() {
    }

    public GetLivingInfoReq(UserId var1, long var2, long var4, long var6) {
        this.tId = var1;
        this.lTopSid = var2;
        this.lSubSid = var4;
        this.lPresenterUid = var6;
    }

    public String className() {
        return "HUYA.GetLivingInfoReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.lTopSid, "lTopSid");
        var3.display(this.lSubSid, "lSubSid");
        var3.display(this.lPresenterUid, "lPresenterUid");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetLivingInfoReq var2 = (GetLivingInfoReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.lTopSid, var2.lTopSid) && JceUtil.equals(this.lSubSid, var2.lSubSid) && JceUtil.equals(this.lPresenterUid, var2.lPresenterUid)) {
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
        return "com.duowan.HUYA.GetLivingInfoReq";
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
        this.lTopSid = var1.read(this.lTopSid, 1, false);
        this.lSubSid = var1.read(this.lSubSid, 2, false);
        this.lPresenterUid = var1.read(this.lPresenterUid, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        var1.write(this.lTopSid, 1);
        var1.write(this.lSubSid, 2);
        var1.write(this.lPresenterUid, 3);
    }
}
