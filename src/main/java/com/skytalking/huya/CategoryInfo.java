//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class CategoryInfo extends JceStruct implements Cloneable {
    static ArrayList<GameChangeInfo> cache_vCategoryGameList;
    public int iCategoryId = 0;
    public String sCategoryName = "";
    public String sImageUrl = "";
    public ArrayList<GameChangeInfo> vCategoryGameList = null;


    public CategoryInfo() {
    }

    public CategoryInfo(int var1, String var2, ArrayList<GameChangeInfo> var3, String var4) {
        this.iCategoryId = var1;
        this.sCategoryName = var2;
        this.vCategoryGameList = var3;
        this.sImageUrl = var4;
    }

    public String className() {
        return "HUYA.CategoryInfo";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iCategoryId, "iCategoryId");
        var3.display(this.sCategoryName, "sCategoryName");
        var3.display(this.vCategoryGameList, "vCategoryGameList");
        var3.display(this.sImageUrl, "sImageUrl");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                CategoryInfo var2 = (CategoryInfo)var1;
                if (JceUtil.equals(this.iCategoryId, var2.iCategoryId) && JceUtil.equals(this.sCategoryName, var2.sCategoryName) && JceUtil.equals(this.vCategoryGameList, var2.vCategoryGameList) && JceUtil.equals(this.sImageUrl, var2.sImageUrl)) {
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
        return "com.duowan.HUYA.CategoryInfo";
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
        this.iCategoryId = var1.read(this.iCategoryId, 0, false);
        this.sCategoryName = var1.readString(1, false);
        if (cache_vCategoryGameList == null) {
            cache_vCategoryGameList = new ArrayList();
            GameChangeInfo var2 = new GameChangeInfo();
            cache_vCategoryGameList.add(var2);
        }

        this.vCategoryGameList = (ArrayList)var1.read(cache_vCategoryGameList, 2, false);
        this.sImageUrl = var1.readString(3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iCategoryId, 0);
        if (this.sCategoryName != null) {
            var1.write(this.sCategoryName, 1);
        }

        if (this.vCategoryGameList != null) {
            var1.write(this.vCategoryGameList, 2);
        }

        if (this.sImageUrl != null) {
            var1.write(this.sImageUrl, 3);
        }

    }
}
