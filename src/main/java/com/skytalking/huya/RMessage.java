package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class RMessage extends JceStruct {
    public RMessageBase tBase = new RMessageBase();
    public RMessageStatistics tStat = new RMessageStatistics();

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tBase, 0);
        jceOutputStream.write(tStat, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        tBase = (RMessageBase) jceInputStream.read(tBase, 0, false);
        tStat = (RMessageStatistics) jceInputStream.read(tStat, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(tBase, "tBase");
        jceDisplayer.display(tStat, "tStat");
    }
}
