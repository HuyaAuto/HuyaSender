//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetCdnTokenReq extends JceStruct implements Cloneable {
    public String cdn_type = "";
    public long presenter_uid = 0L;
    public String stream_name = "";
    public String url = "";


    public GetCdnTokenReq() {
    }

    public GetCdnTokenReq(String var1, String var2, String var3, long var4) {
        this.url = var1;
        this.cdn_type = var2;
        this.stream_name = var3;
        this.presenter_uid = var4;
    }

    public String className() {
        return "HUYA.GetCdnTokenReq";
    }


    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.url, "url");
        var3.display(this.cdn_type, "cdn_type");
        var3.display(this.stream_name, "stream_name");
        var3.display(this.presenter_uid, "presenter_uid");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                GetCdnTokenReq var2 = (GetCdnTokenReq)var1;
                if (JceUtil.equals(this.url, var2.url) && JceUtil.equals(this.cdn_type, var2.cdn_type) && JceUtil.equals(this.stream_name, var2.stream_name) && JceUtil.equals(this.presenter_uid, var2.presenter_uid)) {
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
        return "com.duowan.HUYA.GetCdnTokenReq";
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
    }
}
