//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class LiveInfoByUidRsp extends JceStruct implements Cloneable {
    static ArrayList<GameLiveInfo> cache_vGameLiveInfos;
    public ArrayList<GameLiveInfo> vGameLiveInfos = null;


    public LiveInfoByUidRsp() {
    }

    public LiveInfoByUidRsp(ArrayList<GameLiveInfo> var1) {
        this.vGameLiveInfos = var1;
    }

    public String className() {
        return "HUYA.LiveInfoByUidRsp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.vGameLiveInfos, "vGameLiveInfos");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            LiveInfoByUidRsp var2 = (LiveInfoByUidRsp)var1;
            return JceUtil.equals(this.vGameLiveInfos, var2.vGameLiveInfos);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.LiveInfoByUidRsp";
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
        if (cache_vGameLiveInfos == null) {
            cache_vGameLiveInfos = new ArrayList();
            GameLiveInfo var2 = new GameLiveInfo();
            cache_vGameLiveInfos.add(var2);
        }

        this.vGameLiveInfos = (ArrayList)var1.read(cache_vGameLiveInfos, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vGameLiveInfos != null) {
            var1.write(this.vGameLiveInfos, 0);
        }

    }
}
