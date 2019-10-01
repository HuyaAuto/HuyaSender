//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;
import com.qq.taf.jce.*;

public final class WSPushMessage extends JceStruct implements Cloneable {
    static byte[] cache_sMsg;
    public int ePushType = 0;
    public int iProtocolType = 0;
    public long iUri = 0L;
    public byte[] sMsg = null;

    public WSPushMessage() {
    }

    public WSPushMessage(int var1, long var2, byte[] var4, int var5) {
        this.ePushType = var1;
        this.iUri = var2;
        this.sMsg = var4;
        this.iProtocolType = var5;
    }

    public String className() {
        return "HUYA.WSPushMessage";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.ePushType, "ePushType");
        var3.display(this.iUri, "iUri");
        var3.display(this.sMsg, "sMsg");
        var3.display(this.iProtocolType, "iProtocolType");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                WSPushMessage var2 = (WSPushMessage)var1;
                if (JceUtil.equals(this.ePushType, var2.ePushType) && JceUtil.equals(this.iUri, var2.iUri) && JceUtil.equals(this.sMsg, var2.sMsg) && JceUtil.equals(this.iProtocolType, var2.iProtocolType)) {
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
        return "com.duowan.HUYA.WSPushMessage";
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
        this.ePushType = var1.read(this.ePushType, 0, false);
        this.iUri = var1.read(this.iUri, 1, false);
        if (cache_sMsg == null) {
            cache_sMsg = (byte[])(new byte[1]);
            ((byte[])cache_sMsg)[0] = 0;
        }

        this.sMsg = (byte[])var1.read(cache_sMsg, 2, false);
        this.iProtocolType = var1.read(this.iProtocolType, 3, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.ePushType, 0);
        var1.write(this.iUri, 1);
        if (this.sMsg != null) {
            var1.write(this.sMsg, 2);
        }

        var1.write(this.iProtocolType, 3);
    }
}
