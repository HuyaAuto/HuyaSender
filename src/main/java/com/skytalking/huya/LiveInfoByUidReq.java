//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class LiveInfoByUidReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    static ArrayList<Long> cache_vUids;
    public UserId tId = null;
    public ArrayList<Long> vUids = null;


    public LiveInfoByUidReq() {
    }

    public LiveInfoByUidReq(UserId var1, ArrayList<Long> var2) {
        this.tId = var1;
        this.vUids = var2;
    }

    public String className() {
        return "HUYA.LiveInfoByUidReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.vUids, "vUids");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveInfoByUidReq var2 = (LiveInfoByUidReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.vUids, var2.vUids)) {
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
        return "com.duowan.HUYA.LiveInfoByUidReq";
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
        if (cache_vUids == null) {
            cache_vUids = new ArrayList();
            cache_vUids.add(0L);
        }

        this.vUids = (ArrayList)var1.read(cache_vUids, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        if (this.vUids != null) {
            var1.write(this.vUids, 1);
        }

    }
}
