//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetPresenterPageInfoRsp extends JceStruct implements Cloneable {
    static ArrayList<SSPresenterInfo> cache_vPresenterInfo;
    public int iTotalNum = 0;
    public String sCacheId = "";
    public ArrayList<SSPresenterInfo> vPresenterInfo = null;

    public GetPresenterPageInfoRsp() {
    }

    public GetPresenterPageInfoRsp(ArrayList<SSPresenterInfo> var1, String var2, int var3) {
        this.vPresenterInfo = var1;
        this.sCacheId = var2;
        this.iTotalNum = var3;
    }

    public String className() {
        return "HUYA.GetPresenterPageInfoRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.vPresenterInfo, "vPresenterInfo");
        var3.display(this.sCacheId, "sCacheId");
        var3.display(this.iTotalNum, "iTotalNum");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetPresenterPageInfoRsp var2 = (GetPresenterPageInfoRsp)var1;
                if (JceUtil.equals(this.vPresenterInfo, var2.vPresenterInfo) && JceUtil.equals(this.sCacheId, var2.sCacheId) && JceUtil.equals(this.iTotalNum, var2.iTotalNum)) {
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
        return "com.duowan.HUYA.GetPresenterPageInfoRsp";
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
        if (cache_vPresenterInfo == null) {
            cache_vPresenterInfo = new ArrayList();
            SSPresenterInfo var2 = new SSPresenterInfo();
            cache_vPresenterInfo.add(var2);
        }

        this.vPresenterInfo = (ArrayList)var1.read(cache_vPresenterInfo, 0, false);
        this.sCacheId = var1.readString(1, false);
        this.iTotalNum = var1.read(this.iTotalNum, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vPresenterInfo != null) {
            var1.write(this.vPresenterInfo, 0);
        }

        if (this.sCacheId != null) {
            var1.write(this.sCacheId, 1);
        }

        var1.write(this.iTotalNum, 2);
    }
}
