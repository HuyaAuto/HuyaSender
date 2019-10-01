//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;
import com.qq.taf.jce.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class MapGameFixInfo extends JceStruct implements Cloneable {
    static Map<Integer, GameFixInfo> cache_mGameFixInfo;
    static ArrayList<MTagInfo> cache_vTags;
    public Map<Integer, GameFixInfo> mGameFixInfo = null;
    public ArrayList<MTagInfo> vTags = null;

    public MapGameFixInfo() {
    }

    public MapGameFixInfo(Map<Integer, GameFixInfo> var1, ArrayList<MTagInfo> var2) {
        this.mGameFixInfo = var1;
        this.vTags = var2;
    }

    public String className() {
        return "HUYA.MapGameFixInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.mGameFixInfo, "mGameFixInfo");
        var3.display(this.vTags, "vTags");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MapGameFixInfo var2 = (MapGameFixInfo)var1;
                if (JceUtil.equals(this.mGameFixInfo, var2.mGameFixInfo) && JceUtil.equals(this.vTags, var2.vTags)) {
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
        return "com.duowan.HUYA.MapGameFixInfo";
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
        if (cache_mGameFixInfo == null) {
            cache_mGameFixInfo = new HashMap();
            GameFixInfo var2 = new GameFixInfo();
            cache_mGameFixInfo.put(0, var2);
        }

        this.mGameFixInfo = (Map)var1.read(cache_mGameFixInfo, 0, false);
        if (cache_vTags == null) {
            cache_vTags = new ArrayList();
            MTagInfo var3 = new MTagInfo();
            cache_vTags.add(var3);
        }

        this.vTags = (ArrayList)var1.read(cache_vTags, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.mGameFixInfo != null) {
            var1.write(this.mGameFixInfo, 0);
        }

        if (this.vTags != null) {
            var1.write(this.vTags, 1);
        }

    }
}
