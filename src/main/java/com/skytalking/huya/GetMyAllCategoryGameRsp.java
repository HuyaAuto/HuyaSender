package com.skytalking.huya;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetMyAllCategoryGameRsp extends JceStruct implements Cloneable {
    static AllGameMd5Info cache_tAllGameMd5Info;
    static ArrayList<CategoryInfo> cache_vCategoryInfo;
    static ArrayList<Integer> cache_vHideGame;
    public AllGameMd5Info tAllGameMd5Info = null;
    public ArrayList<CategoryInfo> vCategoryInfo = null;
    public ArrayList<Integer> vHideGame = null;

    public GetMyAllCategoryGameRsp() {
    }

    public GetMyAllCategoryGameRsp(ArrayList<CategoryInfo> var1, AllGameMd5Info var2, ArrayList<Integer> var3) {
        this.vCategoryInfo = var1;
        this.tAllGameMd5Info = var2;
        this.vHideGame = var3;
    }

    public String className() {
        return "HUYA.GetMyAllCategoryGameRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.vCategoryInfo, "vCategoryInfo");
        var3.display(this.tAllGameMd5Info, "tAllGameMd5Info");
        var3.display(this.vHideGame, "vHideGame");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetMyAllCategoryGameRsp var2 = (GetMyAllCategoryGameRsp)var1;
                if (JceUtil.equals(this.vCategoryInfo, var2.vCategoryInfo) && JceUtil.equals(this.tAllGameMd5Info, var2.tAllGameMd5Info) && JceUtil.equals(this.vHideGame, var2.vHideGame)) {
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
        return "com.duowan.HUYA.GetMyAllCategoryGameRsp";
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
        if (cache_vCategoryInfo == null) {
            cache_vCategoryInfo = new ArrayList();
            CategoryInfo var2 = new CategoryInfo();
            cache_vCategoryInfo.add(var2);
        }

        this.vCategoryInfo = (ArrayList)var1.read(cache_vCategoryInfo, 0, false);
        if (cache_tAllGameMd5Info == null) {
            cache_tAllGameMd5Info = new AllGameMd5Info();
        }

        this.tAllGameMd5Info = (AllGameMd5Info)var1.read(cache_tAllGameMd5Info, 1, false);
        if (cache_vHideGame == null) {
            cache_vHideGame = new ArrayList();
            cache_vHideGame.add(0);
        }

        this.vHideGame = (ArrayList)var1.read(cache_vHideGame, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vCategoryInfo != null) {
            var1.write(this.vCategoryInfo, 0);
        }

        if (this.tAllGameMd5Info != null) {
            var1.write(this.tAllGameMd5Info, 1);
        }

        if (this.vHideGame != null) {
            var1.write(this.vHideGame, 2);
        }

    }
}
