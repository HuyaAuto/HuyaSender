//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetCdnTokenRsp extends JceStruct implements Cloneable {
    public String anti_code = "";
    public String cdn_type = "";
    public String flv_anti_code = "";
    public String hls_anti_code = "";
    public long presenter_uid = 0L;
    public String sTime = "";
    public String stream_name = "";
    public String url = "";

    public GetCdnTokenRsp() {
    }

    public GetCdnTokenRsp(String var1, String var2, String var3, long var4, String var6, String var7, String var8, String var9) {
        this.url = var1;
        this.cdn_type = var2;
        this.stream_name = var3;
        this.presenter_uid = var4;
        this.anti_code = var6;
        this.sTime = var7;
        this.flv_anti_code = var8;
        this.hls_anti_code = var9;
    }

    public String className() {
        return "HUYA.GetCdnTokenRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.url, "url");
        var3.display(this.cdn_type, "cdn_type");
        var3.display(this.stream_name, "stream_name");
        var3.display(this.presenter_uid, "presenter_uid");
        var3.display(this.anti_code, "anti_code");
        var3.display(this.sTime, "sTime");
        var3.display(this.flv_anti_code, "flv_anti_code");
        var3.display(this.hls_anti_code, "hls_anti_code");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetCdnTokenRsp var2 = (GetCdnTokenRsp)var1;
                if (JceUtil.equals(this.url, var2.url) && JceUtil.equals(this.cdn_type, var2.cdn_type) && JceUtil.equals(this.stream_name, var2.stream_name) && JceUtil.equals(this.presenter_uid, var2.presenter_uid) && JceUtil.equals(this.anti_code, var2.anti_code) && JceUtil.equals(this.sTime, var2.sTime) && JceUtil.equals(this.flv_anti_code, var2.flv_anti_code) && JceUtil.equals(this.hls_anti_code, var2.hls_anti_code)) {
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
        return "com.duowan.HUYA.GetCdnTokenRsp";
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
        this.url = var1.readString(0, false);
        this.cdn_type = var1.readString(1, false);
        this.stream_name = var1.readString(2, false);
        this.presenter_uid = var1.read(this.presenter_uid, 3, false);
        this.anti_code = var1.readString(4, false);
        this.sTime = var1.readString(5, false);
        this.flv_anti_code = var1.readString(6, false);
        this.hls_anti_code = var1.readString(7, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.url != null) {
            var1.write(this.url, 0);
        }

        if (this.cdn_type != null) {
            var1.write(this.cdn_type, 1);
        }

        if (this.stream_name != null) {
            var1.write(this.stream_name, 2);
        }

        var1.write(this.presenter_uid, 3);
        if (this.anti_code != null) {
            var1.write(this.anti_code, 4);
        }

        if (this.sTime != null) {
            var1.write(this.sTime, 5);
        }

        if (this.flv_anti_code != null) {
            var1.write(this.flv_anti_code, 6);
        }

        if (this.hls_anti_code != null) {
            var1.write(this.hls_anti_code, 7);
        }

    }
}
