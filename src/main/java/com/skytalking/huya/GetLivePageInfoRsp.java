//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetLivePageInfoRsp extends JceStruct implements Cloneable {
    static ArrayList<LiveChannelInfo> cache_vLiveInfo;
    public int iTotalNum = 0;
    public String sCacheId = "";
    public ArrayList<LiveChannelInfo> vLiveInfo = null;

    public GetLivePageInfoRsp() {
    }

    public GetLivePageInfoRsp(ArrayList<LiveChannelInfo> var1, String var2, int var3) {
        this.vLiveInfo = var1;
        this.sCacheId = var2;
        this.iTotalNum = var3;
    }

    public String className() {
        return "HUYA.GetLivePageInfoRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.vLiveInfo, "vLiveInfo");
        var3.display(this.sCacheId, "sCacheId");
        var3.display(this.iTotalNum, "iTotalNum");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetLivePageInfoRsp var2 = (GetLivePageInfoRsp)var1;
                if (JceUtil.equals(this.vLiveInfo, var2.vLiveInfo) && JceUtil.equals(this.sCacheId, var2.sCacheId) && JceUtil.equals(this.iTotalNum, var2.iTotalNum)) {
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
        return "com.duowan.HUYA.GetLivePageInfoRsp";
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
        if (cache_vLiveInfo == null) {
            cache_vLiveInfo = new ArrayList();
            LiveChannelInfo var2 = new LiveChannelInfo();
            cache_vLiveInfo.add(var2);
        }

        this.vLiveInfo = (ArrayList)var1.read(cache_vLiveInfo, 0, false);
        this.sCacheId = var1.readString(1, false);
        this.iTotalNum = var1.read(this.iTotalNum, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vLiveInfo != null) {
            var1.write(this.vLiveInfo, 0);
        }

        if (this.sCacheId != null) {
            var1.write(this.sCacheId, 1);
        }

        var1.write(this.iTotalNum, 2);
    }
}
