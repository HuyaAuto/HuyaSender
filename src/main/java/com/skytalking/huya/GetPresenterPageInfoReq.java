//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetPresenterPageInfoReq extends JceStruct implements Cloneable {
    public int iLiveState = 0;
    public int iPageNum = 0;
    public int iPageSize = 0;
    public int iTerminalType = 0;
    public String sCacheId = "";


    public GetPresenterPageInfoReq() {
    }

    public GetPresenterPageInfoReq(int var1, int var2, String var3, int var4, int var5) {
        this.iPageNum = var1;
        this.iLiveState = var2;
        this.sCacheId = var3;
        this.iTerminalType = var4;
        this.iPageSize = var5;
    }

    public String className() {
        return "HUYA.GetPresenterPageInfoReq";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iPageNum, "iPageNum");
        var3.display(this.iLiveState, "iLiveState");
        var3.display(this.sCacheId, "sCacheId");
        var3.display(this.iTerminalType, "iTerminalType");
        var3.display(this.iPageSize, "iPageSize");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetPresenterPageInfoReq var2 = (GetPresenterPageInfoReq)var1;
                if (JceUtil.equals(this.iPageNum, var2.iPageNum) && JceUtil.equals(this.iLiveState, var2.iLiveState) && JceUtil.equals(this.sCacheId, var2.sCacheId) && JceUtil.equals(this.iTerminalType, var2.iTerminalType) && JceUtil.equals(this.iPageSize, var2.iPageSize)) {
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
        return "com.duowan.HUYA.GetPresenterPageInfoReq";
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
        this.iPageNum = var1.read(this.iPageNum, 0, false);
        this.iLiveState = var1.read(this.iLiveState, 1, false);
        this.sCacheId = var1.readString(2, false);
        this.iTerminalType = var1.read(this.iTerminalType, 3, false);
        this.iPageSize = var1.read(this.iPageSize, 4, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iPageNum, 0);
        var1.write(this.iLiveState, 1);
        if (this.sCacheId != null) {
            var1.write(this.sCacheId, 2);
        }

        var1.write(this.iTerminalType, 3);
        var1.write(this.iPageSize, 4);
    }
}
