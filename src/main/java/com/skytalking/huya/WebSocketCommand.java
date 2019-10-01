//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class WebSocketCommand extends JceStruct implements Cloneable {
    static byte[] cache_vData;
    public int iCmdType = 0;
    public byte[] vData = null;


    public WebSocketCommand() {
    }

    public WebSocketCommand(int var1, byte[] var2) {
        this.iCmdType = var1;
        this.vData = var2;
    }

    public String className() {
        return "HUYA.WebSocketCommand";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iCmdType, "iCmdType");
        var3.display(this.vData, "vData");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                WebSocketCommand var2 = (WebSocketCommand)var1;
                if (JceUtil.equals(this.iCmdType, var2.iCmdType) && JceUtil.equals(this.vData, var2.vData)) {
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
        return "com.duowan.HUYA.WebSocketCommand";
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
        this.iCmdType = var1.read(this.iCmdType, 0, false);
        if (cache_vData == null) {
            cache_vData = (byte[])(new byte[1]);
            ((byte[])cache_vData)[0] = 0;
        }

        this.vData = (byte[])var1.read(cache_vData, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iCmdType, 0);
        if (this.vData != null) {
            var1.write(this.vData, 1);
        }

    }
}
