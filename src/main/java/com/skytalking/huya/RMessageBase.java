package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class RMessageBase extends JceStruct {
    public long lSenderUid = 0;
    public String sSenderNick = "";
    public String sContent = "";
    public long lPid = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lSenderUid, 0);
        jceOutputStream.write(sSenderNick, 1);
        jceOutputStream.write(sContent, 2);
        jceOutputStream.write(lPid, 3);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lSenderUid = jceInputStream.read(lSenderUid, 0, false);
        sSenderNick = jceInputStream.read(sSenderNick, 1, false);
        sContent = jceInputStream.read(sContent, 2, false);
        lPid = jceInputStream.read(lPid, 3, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lSenderUid, "lSenderUid");
        jceDisplayer.display(sSenderNick, "sSenderNick");
        jceDisplayer.display(sContent, "sContent");
        jceDisplayer.display(lPid, "lPid");
    }
}
