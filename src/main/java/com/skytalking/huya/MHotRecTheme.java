//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class MHotRecTheme extends JceStruct implements Cloneable {
    static ArrayList<LiveHotItemInfo> cache_vLiveHots;
    static ArrayList<GameLiveInfo> cache_vLives;
    public int iId = 0;
    public int iPageSize = 0;
    public int iViewType = 0;
    public String sAction = "";
    public String sActionText = "";
    public String sIcon = "";
    public String sName = "";
    public ArrayList<LiveHotItemInfo> vLiveHots = null;
    public ArrayList<GameLiveInfo> vLives = null;


    public MHotRecTheme() {
    }

    public MHotRecTheme(int var1, String var2, String var3, String var4, ArrayList<GameLiveInfo> var5, int var6, int var7, String var8, ArrayList<LiveHotItemInfo> var9) {
        this.iId = var1;
        this.sName = var2;
        this.sIcon = var3;
        this.sAction = var4;
        this.vLives = var5;
        this.iPageSize = var6;
        this.iViewType = var7;
        this.sActionText = var8;
        this.vLiveHots = var9;
    }

    public String className() {
        return "HUYA.MHotRecTheme";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iId, "iId");
        var3.display(this.sName, "sName");
        var3.display(this.sIcon, "sIcon");
        var3.display(this.sAction, "sAction");
        var3.display(this.vLives, "vLives");
        var3.display(this.iPageSize, "iPageSize");
        var3.display(this.iViewType, "iViewType");
        var3.display(this.sActionText, "sActionText");
        var3.display(this.vLiveHots, "vLiveHots");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MHotRecTheme var2 = (MHotRecTheme)var1;
                if (JceUtil.equals(this.iId, var2.iId) && JceUtil.equals(this.sName, var2.sName) && JceUtil.equals(this.sIcon, var2.sIcon) && JceUtil.equals(this.sAction, var2.sAction) && JceUtil.equals(this.vLives, var2.vLives) && JceUtil.equals(this.iPageSize, var2.iPageSize) && JceUtil.equals(this.iViewType, var2.iViewType) && JceUtil.equals(this.sActionText, var2.sActionText) && JceUtil.equals(this.vLiveHots, var2.vLiveHots)) {
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
        return "com.duowan.HUYA.MHotRecTheme";
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
        this.iId = var1.read(this.iId, 0, false);
        this.sName = var1.readString(1, false);
        this.sIcon = var1.readString(2, false);
        this.sAction = var1.readString(3, false);
        if (cache_vLives == null) {
            cache_vLives = new ArrayList();
            GameLiveInfo var2 = new GameLiveInfo();
            cache_vLives.add(var2);
        }

        this.vLives = (ArrayList)var1.read(cache_vLives, 4, false);
        this.iPageSize = var1.read(this.iPageSize, 5, false);
        this.iViewType = var1.read(this.iViewType, 6, false);
        this.sActionText = var1.readString(7, false);
        if (cache_vLiveHots == null) {
            cache_vLiveHots = new ArrayList();
            LiveHotItemInfo var3 = new LiveHotItemInfo();
            cache_vLiveHots.add(var3);
        }

        this.vLiveHots = (ArrayList)var1.read(cache_vLiveHots, 8, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iId, 0);
        if (this.sName != null) {
            var1.write(this.sName, 1);
        }

        if (this.sIcon != null) {
            var1.write(this.sIcon, 2);
        }

        if (this.sAction != null) {
            var1.write(this.sAction, 3);
        }

        if (this.vLives != null) {
            var1.write(this.vLives, 4);
        }

        var1.write(this.iPageSize, 5);
        var1.write(this.iViewType, 6);
        if (this.sActionText != null) {
            var1.write(this.sActionText, 7);
        }

        if (this.vLiveHots != null) {
            var1.write(this.vLiveHots, 8);
        }

    }
}
