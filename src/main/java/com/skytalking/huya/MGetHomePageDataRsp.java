//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class MGetHomePageDataRsp extends JceStruct implements Cloneable {
    static ArrayList<MAdvertising> cache_vAdvertisings;
    static ArrayList<MAnnouncement> cache_vAnnouncements;
    static ArrayList<BannerItem> cache_vBanner;
    static ArrayList<MHotRecTheme> cache_vHotRecThemes;
    static ArrayList<UpcommingEventInfo> cache_vUpcommingEventInfo;
    public ArrayList<MAdvertising> vAdvertisings = null;
    public ArrayList<MAnnouncement> vAnnouncements = null;
    public ArrayList<BannerItem> vBanner = null;
    public ArrayList<MHotRecTheme> vHotRecThemes = null;
    public ArrayList<UpcommingEventInfo> vUpcommingEventInfo = null;



    public MGetHomePageDataRsp() {
    }

    public MGetHomePageDataRsp(ArrayList<MAdvertising> var1, ArrayList<MHotRecTheme> var2, ArrayList<MAnnouncement> var3, ArrayList<BannerItem> var4, ArrayList<UpcommingEventInfo> var5) {
        this.vAdvertisings = var1;
        this.vHotRecThemes = var2;
        this.vAnnouncements = var3;
        this.vBanner = var4;
        this.vUpcommingEventInfo = var5;
    }

    public String className() {
        return "HUYA.MGetHomePageDataRsp";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.vAdvertisings, "vAdvertisings");
        var3.display(this.vHotRecThemes, "vHotRecThemes");
        var3.display(this.vAnnouncements, "vAnnouncements");
        var3.display(this.vBanner, "vBanner");
        var3.display(this.vUpcommingEventInfo, "vUpcommingEventInfo");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MGetHomePageDataRsp var2 = (MGetHomePageDataRsp)var1;
                if (JceUtil.equals(this.vAdvertisings, var2.vAdvertisings) && JceUtil.equals(this.vHotRecThemes, var2.vHotRecThemes) && JceUtil.equals(this.vAnnouncements, var2.vAnnouncements) && JceUtil.equals(this.vBanner, var2.vBanner) && JceUtil.equals(this.vUpcommingEventInfo, var2.vUpcommingEventInfo)) {
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
        return "com.duowan.HUYA.MGetHomePageDataRsp";
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
        if (cache_vAdvertisings == null) {
            cache_vAdvertisings = new ArrayList();
            MAdvertising var2 = new MAdvertising();
            cache_vAdvertisings.add(var2);
        }

        this.vAdvertisings = (ArrayList)var1.read(cache_vAdvertisings, 1, false);
        if (cache_vHotRecThemes == null) {
            cache_vHotRecThemes = new ArrayList();
            MHotRecTheme var3 = new MHotRecTheme();
            cache_vHotRecThemes.add(var3);
        }

        this.vHotRecThemes = (ArrayList)var1.read(cache_vHotRecThemes, 2, false);
        if (cache_vAnnouncements == null) {
            cache_vAnnouncements = new ArrayList();
            MAnnouncement var4 = new MAnnouncement();
            cache_vAnnouncements.add(var4);
        }

        this.vAnnouncements = (ArrayList)var1.read(cache_vAnnouncements, 3, false);
        if (cache_vBanner == null) {
            cache_vBanner = new ArrayList();
            BannerItem var5 = new BannerItem();
            cache_vBanner.add(var5);
        }

        this.vBanner = (ArrayList)var1.read(cache_vBanner, 4, false);
        if (cache_vUpcommingEventInfo == null) {
            cache_vUpcommingEventInfo = new ArrayList();
            UpcommingEventInfo var6 = new UpcommingEventInfo();
            cache_vUpcommingEventInfo.add(var6);
        }

        this.vUpcommingEventInfo = (ArrayList)var1.read(cache_vUpcommingEventInfo, 5, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.vAdvertisings != null) {
            var1.write(this.vAdvertisings, 1);
        }

        if (this.vHotRecThemes != null) {
            var1.write(this.vHotRecThemes, 2);
        }

        if (this.vAnnouncements != null) {
            var1.write(this.vAnnouncements, 3);
        }

        if (this.vBanner != null) {
            var1.write(this.vBanner, 4);
        }

        if (this.vUpcommingEventInfo != null) {
            var1.write(this.vUpcommingEventInfo, 5);
        }

    }
}
