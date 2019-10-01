//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;
import com.qq.taf.jce.*;

public final class DecorationInfo extends JceStruct implements Cloneable {
    static byte[] cache_vData;
    public int iAppId = 0;
    public int iViewType = 0;
    public byte[] vData = null;

    public DecorationInfo() {
    }

    public DecorationInfo(int var1, int var2, byte[] var3) {
        this.iAppId = var1;
        this.iViewType = var2;
        this.vData = var3;
    }

    public String className() {
        return "HUYA.DecorationInfo";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iAppId, "iAppId");
        var3.display(this.iViewType, "iViewType");
        var3.display(this.vData, "vData");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                DecorationInfo var2 = (DecorationInfo)var1;
                if (JceUtil.equals(this.iAppId, var2.iAppId) && JceUtil.equals(this.iViewType, var2.iViewType) && JceUtil.equals(this.vData, var2.vData)) {
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
        return "com.duowan.HUYA.DecorationInfo";
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
        this.iAppId = var1.read(this.iAppId, 0, false);
        this.iViewType = var1.read(this.iViewType, 1, false);
        if (cache_vData == null) {
            cache_vData = (byte[])(new byte[1]);
            ((byte[])cache_vData)[0] = 0;
        }

        this.vData = (byte[])var1.read(cache_vData, 2, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iAppId, 0);
        var1.write(this.iViewType, 1);
        if (this.vData != null) {
            var1.write(this.vData, 2);
        }

    }
}
