//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class SendMessageRsp extends JceStruct implements Cloneable {
    static MessageNotice cache_tNotice;
    public int iStatus = 0;
    public MessageNotice tNotice = null;

    public SendMessageRsp() {
    }

    public SendMessageRsp(int var1, MessageNotice var2) {
        this.iStatus = var1;
        this.tNotice = var2;
    }

    public String className() {
        return "HUYA.SendMessageRsp";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.iStatus, "iStatus");
        var3.display(this.tNotice, "tNotice");
    }

    public String fullClassName() {
        return "com.duowan.HUYA.SendMessageRsp";
    }

    public void readFrom(JceInputStream var1) {
        this.iStatus = var1.read(this.iStatus, 0, false);
        if (cache_tNotice == null) {
            cache_tNotice = new MessageNotice();
        }

        this.tNotice = (MessageNotice)var1.read(cache_tNotice, 1, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iStatus, 0);
        if (this.tNotice != null) {
            var1.write(this.tNotice, 1);
        }

    }
}
