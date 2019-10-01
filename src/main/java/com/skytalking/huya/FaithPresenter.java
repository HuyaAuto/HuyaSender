package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class FaithPresenter extends JceStruct {
    public long lPid = 0;
    public String sLogo = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lPid, 0);
        jceOutputStream.write(sLogo, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lPid = jceInputStream.read(lPid, 0, false);
        sLogo = jceInputStream.read(sLogo, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lPid, "lPid");
        jceDisplayer.display(sLogo, "sLogo");
    }
}
