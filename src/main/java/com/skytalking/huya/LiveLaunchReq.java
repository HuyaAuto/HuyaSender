//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

public final class LiveLaunchReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    static LiveUserbase cache_tLiveUB;
    public UserId tId = null;
    public LiveUserbase tLiveUB = null;

    public LiveLaunchReq() {
    }

    public LiveLaunchReq(UserId var1, LiveUserbase var2) {
        this.tId = var1;
        this.tLiveUB = var2;
    }

    public String className() {
        return "HUYA.LiveLaunchReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tId, "tId");
        var3.display(this.tLiveUB, "tLiveUB");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveLaunchReq var2 = (LiveLaunchReq)var1;
                if (JceUtil.equals(this.tId, var2.tId) && JceUtil.equals(this.tLiveUB, var2.tLiveUB)) {
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
        return "com.duowan.HUYA.LiveLaunchReq";
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
        if (cache_tLiveUB == null) {
            cache_tLiveUB = new LiveUserbase();
        }

        this.tLiveUB = (LiveUserbase)var1.read(cache_tLiveUB, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tId != null) {
            var1.write(this.tId, 0);
        }

        if (this.tLiveUB != null) {
            var1.write(this.tLiveUB, 1);
        }

    }
}
