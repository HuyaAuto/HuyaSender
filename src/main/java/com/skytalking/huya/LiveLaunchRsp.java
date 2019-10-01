//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class LiveLaunchRsp extends JceStruct implements Cloneable {
    static int cache_eAccess;
    static ArrayList<LiveProxyValue> cache_vProxyList;
    public int eAccess = 0;
    public int iTime = 0;
    public String sGuid = "";
    public ArrayList<LiveProxyValue> vProxyList = null;


    public LiveLaunchRsp() {
    }

    public LiveLaunchRsp(String var1, int var2, ArrayList<LiveProxyValue> var3, int var4) {
        this.sGuid = var1;
        this.iTime = var2;
        this.vProxyList = var3;
        this.eAccess = var4;
    }

    public String className() {
        return "HUYA.LiveLaunchRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.sGuid, "sGuid");
        var3.display(this.iTime, "iTime");
        var3.display(this.vProxyList, "vProxyList");
        var3.display(this.eAccess, "eAccess");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                LiveLaunchRsp var2 = (LiveLaunchRsp)var1;
                if (JceUtil.equals(this.sGuid, var2.sGuid) && JceUtil.equals(this.iTime, var2.iTime) && JceUtil.equals(this.vProxyList, var2.vProxyList) && JceUtil.equals(this.eAccess, var2.eAccess)) {
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
        return "com.duowan.HUYA.LiveLaunchRsp";
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
        this.sGuid = var1.readString(0, false);
        this.iTime = var1.read(this.iTime, 1, false);
        if (cache_vProxyList == null) {
            cache_vProxyList = new ArrayList();
            LiveProxyValue var2 = new LiveProxyValue();
            cache_vProxyList.add(var2);
        }

        this.vProxyList = (ArrayList)var1.read(cache_vProxyList, 2, false);
        this.eAccess = var1.read(this.eAccess, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.sGuid != null) {
            var1.write(this.sGuid, 0);
        }

        var1.write(this.iTime, 1);
        if (this.vProxyList != null) {
            var1.write(this.vProxyList, 2);
        }

        var1.write(this.eAccess, 3);
    }
}
