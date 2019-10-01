//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetResultByKeyWordReq extends JceStruct implements Cloneable {
    static UserId cache_tId;
    public int iArtFirstPageNum = 0;
    public int iArtPageSize = 15;
    public int iForLoLBox = 0;
    public int iLiveFirstPageNum = 0;
    public int iLivePageSize = 15;
    public int iLiveState = 0;
    public int iPresentFirstPageNum = 0;
    public int iPresentPageSize = 15;
    public int iTerminalType = 0;
    public String sKeyWord = "";
    public UserId tId = null;


    public GetResultByKeyWordReq() {
    }

    public GetResultByKeyWordReq(String var1, int var2, int var3, int var4, int var5, int var6, UserId var7, int var8, int var9, int var10, int var11) {
        this.sKeyWord = var1;
        this.iPresentPageSize = var2;
        this.iPresentFirstPageNum = var3;
        this.iLivePageSize = var4;
        this.iLiveFirstPageNum = var5;
        this.iTerminalType = var6;
        this.tId = var7;
        this.iForLoLBox = var8;
        this.iArtPageSize = var9;
        this.iArtFirstPageNum = var10;
        this.iLiveState = var11;
    }

    public String className() {
        return "HUYA.GetResultByKeyWordReq";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sKeyWord, "sKeyWord");
        var3.display(this.iPresentPageSize, "iPresentPageSize");
        var3.display(this.iPresentFirstPageNum, "iPresentFirstPageNum");
        var3.display(this.iLivePageSize, "iLivePageSize");
        var3.display(this.iLiveFirstPageNum, "iLiveFirstPageNum");
        var3.display(this.iTerminalType, "iTerminalType");
        var3.display(this.tId, "tId");
        var3.display(this.iForLoLBox, "iForLoLBox");
        var3.display(this.iArtPageSize, "iArtPageSize");
        var3.display(this.iArtFirstPageNum, "iArtFirstPageNum");
        var3.display(this.iLiveState, "iLiveState");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 == null || this.getClass() != var1.getClass()) {
                return false;
            }

            GetResultByKeyWordReq var2 = (GetResultByKeyWordReq)var1;
            if (!JceUtil.equals(this.sKeyWord, var2.sKeyWord) || !JceUtil.equals(this.iPresentPageSize, var2.iPresentPageSize) || !JceUtil.equals(this.iPresentFirstPageNum, var2.iPresentFirstPageNum) || !JceUtil.equals(this.iLivePageSize, var2.iLivePageSize) || !JceUtil.equals(this.iLiveFirstPageNum, var2.iLiveFirstPageNum) || !JceUtil.equals(this.iTerminalType, var2.iTerminalType) || !JceUtil.equals(this.tId, var2.tId) || !JceUtil.equals(this.iForLoLBox, var2.iForLoLBox) || !JceUtil.equals(this.iArtPageSize, var2.iArtPageSize) || !JceUtil.equals(this.iArtFirstPageNum, var2.iArtFirstPageNum) || !JceUtil.equals(this.iLiveState, var2.iLiveState)) {
                return false;
            }
        }

        return true;
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetResultByKeyWordReq";
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
        this.sKeyWord = var1.readString(0, false);
        this.iPresentPageSize = var1.read(this.iPresentPageSize, 1, false);
        this.iPresentFirstPageNum = var1.read(this.iPresentFirstPageNum, 2, false);
        this.iLivePageSize = var1.read(this.iLivePageSize, 3, false);
        this.iLiveFirstPageNum = var1.read(this.iLiveFirstPageNum, 4, false);
        this.iTerminalType = var1.read(this.iTerminalType, 5, false);
        if (cache_tId == null) {
            cache_tId = new UserId();
        }

        this.tId = (UserId)var1.read(cache_tId, 6, false);
        this.iForLoLBox = var1.read(this.iForLoLBox, 7, false);
        this.iArtPageSize = var1.read(this.iArtPageSize, 8, false);
        this.iArtFirstPageNum = var1.read(this.iArtFirstPageNum, 9, false);
        this.iLiveState = var1.read(this.iLiveState, 10, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sKeyWord != null) {
            var1.write(this.sKeyWord, 0);
        }

        var1.write(this.iPresentPageSize, 1);
        var1.write(this.iPresentFirstPageNum, 2);
        var1.write(this.iLivePageSize, 3);
        var1.write(this.iLiveFirstPageNum, 4);
        var1.write(this.iTerminalType, 5);
        if (this.tId != null) {
            var1.write(this.tId, 6);
        }

        var1.write(this.iForLoLBox, 7);
        var1.write(this.iArtPageSize, 8);
        var1.write(this.iArtFirstPageNum, 9);
        var1.write(this.iLiveState, 10);
    }
}
