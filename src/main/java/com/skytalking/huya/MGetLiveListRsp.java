//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class MGetLiveListRsp extends JceStruct implements Cloneable {
    static ArrayList<BannerItem> cache_vBanners;
    static ArrayList<LiveListRecGameItem> cache_vLiveListRecGameItem;
    static ArrayList<GameLiveInfo> cache_vLives;
    static ArrayList<MTagInfo> cache_vTags;
    static ArrayList<UpcommingEventInfo> cache_vUpcommingEvent;
    public int iHasMore = 0;
    public int iTotalCount = 0;
    public int iViewType = 0;
    public ArrayList<BannerItem> vBanners = null;
    public ArrayList<LiveListRecGameItem> vLiveListRecGameItem = null;
    public ArrayList<GameLiveInfo> vLives = null;
    public ArrayList<MTagInfo> vTags = null;
    public ArrayList<UpcommingEventInfo> vUpcommingEvent = null;

    public MGetLiveListRsp() {
    }

    public MGetLiveListRsp(int var1, ArrayList<GameLiveInfo> var2, ArrayList<MTagInfo> var3, ArrayList<BannerItem> var4, int var5, int var6, ArrayList<UpcommingEventInfo> var7, ArrayList<LiveListRecGameItem> var8) {
        this.iTotalCount = var1;
        this.vLives = var2;
        this.vTags = var3;
        this.vBanners = var4;
        this.iViewType = var5;
        this.iHasMore = var6;
        this.vUpcommingEvent = var7;
        this.vLiveListRecGameItem = var8;
    }

    public String className() {
        return "HUYA.MGetLiveListRsp";
    }
    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iTotalCount, "iTotalCount");
        var3.display(this.vLives, "vLives");
        var3.display(this.vTags, "vTags");
        var3.display(this.vBanners, "vBanners");
        var3.display(this.iViewType, "iViewType");
        var3.display(this.iHasMore, "iHasMore");
        var3.display(this.vUpcommingEvent, "vUpcommingEvent");
        var3.display(this.vLiveListRecGameItem, "vLiveListRecGameItem");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MGetLiveListRsp var2 = (MGetLiveListRsp)var1;
                if (JceUtil.equals(this.iTotalCount, var2.iTotalCount) && JceUtil.equals(this.vLives, var2.vLives) && JceUtil.equals(this.vTags, var2.vTags) && JceUtil.equals(this.vBanners, var2.vBanners) && JceUtil.equals(this.iViewType, var2.iViewType) && JceUtil.equals(this.iHasMore, var2.iHasMore) && JceUtil.equals(this.vUpcommingEvent, var2.vUpcommingEvent) && JceUtil.equals(this.vLiveListRecGameItem, var2.vLiveListRecGameItem)) {
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
        return "com.duowan.HUYA.MGetLiveListRsp";
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
        this.iTotalCount = var1.read(this.iTotalCount, 1, false);
        if (cache_vLives == null) {
            cache_vLives = new ArrayList();
            GameLiveInfo var2 = new GameLiveInfo();
            cache_vLives.add(var2);
        }

        this.vLives = (ArrayList)var1.read(cache_vLives, 2, false);
        if (cache_vTags == null) {
            cache_vTags = new ArrayList();
            MTagInfo var3 = new MTagInfo();
            cache_vTags.add(var3);
        }

        this.vTags = (ArrayList)var1.read(cache_vTags, 3, false);
        if (cache_vBanners == null) {
            cache_vBanners = new ArrayList();
            BannerItem var4 = new BannerItem();
            cache_vBanners.add(var4);
        }

        this.vBanners = (ArrayList)var1.read(cache_vBanners, 4, false);
        this.iViewType = var1.read(this.iViewType, 5, false);
        this.iHasMore = var1.read(this.iHasMore, 6, false);
        if (cache_vUpcommingEvent == null) {
            cache_vUpcommingEvent = new ArrayList();
            UpcommingEventInfo var5 = new UpcommingEventInfo();
            cache_vUpcommingEvent.add(var5);
        }

        this.vUpcommingEvent = (ArrayList)var1.read(cache_vUpcommingEvent, 7, false);
        if (cache_vLiveListRecGameItem == null) {
            cache_vLiveListRecGameItem = new ArrayList();
            LiveListRecGameItem var6 = new LiveListRecGameItem();
            cache_vLiveListRecGameItem.add(var6);
        }

        this.vLiveListRecGameItem = (ArrayList)var1.read(cache_vLiveListRecGameItem, 8, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iTotalCount, 1);
        if (this.vLives != null) {
            var1.write(this.vLives, 2);
        }

        if (this.vTags != null) {
            var1.write(this.vTags, 3);
        }

        if (this.vBanners != null) {
            var1.write(this.vBanners, 4);
        }

        var1.write(this.iViewType, 5);
        var1.write(this.iHasMore, 6);
        if (this.vUpcommingEvent != null) {
            var1.write(this.vUpcommingEvent, 7);
        }

        if (this.vLiveListRecGameItem != null) {
            var1.write(this.vLiveListRecGameItem, 8);
        }

    }
}
