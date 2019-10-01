package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class SuperFansInfo extends JceStruct {
    public long lSFExpiredTS = 0;
    public int iSFFlag = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lSFExpiredTS, 0);
        jceOutputStream.write(iSFFlag, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lSFExpiredTS = jceInputStream.read(lSFExpiredTS, 0, false);
        iSFFlag = jceInputStream.read(iSFFlag, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lSFExpiredTS, "lSFExpiredTS");
        jceDisplayer.display(iSFFlag, "iSFFlag");
    }
}
