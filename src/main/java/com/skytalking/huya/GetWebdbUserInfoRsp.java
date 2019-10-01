//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class GetWebdbUserInfoRsp extends JceStruct implements Cloneable {
    static DBUserInfo cache_tUserInfo;
    public DBUserInfo tUserInfo = null;


    public GetWebdbUserInfoRsp() {
    }

    public GetWebdbUserInfoRsp(DBUserInfo var1) {
        this.tUserInfo = var1;
    }

    public String className() {
        return "HUYA.GetWebdbUserInfoRsp";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.tUserInfo, "tUserInfo");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            GetWebdbUserInfoRsp var2 = (GetWebdbUserInfoRsp)var1;
            return JceUtil.equals(this.tUserInfo, var2.tUserInfo);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.GetWebdbUserInfoRsp";
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
        if (cache_tUserInfo == null) {
            cache_tUserInfo = new DBUserInfo();
        }

        this.tUserInfo = (DBUserInfo)var1.read(cache_tUserInfo, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tUserInfo != null) {
            var1.write(this.tUserInfo, 0);
        }

    }
}
