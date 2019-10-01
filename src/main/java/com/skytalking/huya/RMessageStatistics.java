package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class RMessageStatistics extends JceStruct {
    public int iRCount = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(iRCount, 0);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRCount = jceInputStream.read(iRCount, 0, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRCount, "iRCount");
    }
}
