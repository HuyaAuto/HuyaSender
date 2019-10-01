//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class GetUserCardPackageResp extends JceStruct implements Cloneable {
    static ArrayList<CardItemCountInfo> cache_vUserCardItemCountLists;
    public ArrayList<CardItemCountInfo> vUserCardItemCountLists = null;

    public GetUserCardPackageResp() {
    }

    public GetUserCardPackageResp(ArrayList<CardItemCountInfo> var1) {
        this.vUserCardItemCountLists = var1;
    }

    public String className() {
        return "HUYA.GetUserCardPackageResp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.vUserCardItemCountLists, "vUserCardItemCountLists");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            GetUserCardPackageResp var2 = (GetUserCardPackageResp)var1;
            return JceUtil.equals(this.vUserCardItemCountLists, var2.vUserCardItemCountLists);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetUserCardPackageResp";
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
        if (cache_vUserCardItemCountLists == null) {
            cache_vUserCardItemCountLists = new ArrayList();
            CardItemCountInfo var2 = new CardItemCountInfo();
            cache_vUserCardItemCountLists.add(var2);
        }

        this.vUserCardItemCountLists = (ArrayList)var1.read(cache_vUserCardItemCountLists, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vUserCardItemCountLists != null) {
            var1.write(this.vUserCardItemCountLists, 0);
        }

    }
}
