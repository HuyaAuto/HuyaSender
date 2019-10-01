package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class RMessageScene extends JceStruct {
    public long lLiveId = 0;
    public long lPid = 0;
    public long lTid = 0;
    public long lSid = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lLiveId, 0);
        jceOutputStream.write(lPid, 1);
        jceOutputStream.write(lTid, 2);
        jceOutputStream.write(lSid, 3);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lLiveId = jceInputStream.read(lLiveId, 0, false);
        lPid = jceInputStream.read(lPid, 1, false);
        lTid = jceInputStream.read(lTid, 2, false);
        lSid = jceInputStream.read(lSid, 3, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lLiveId, "lLiveId");
        jceDisplayer.display(lPid, "lPid");
        jceDisplayer.display(lTid, "lTid");
        jceDisplayer.display(lSid, "lSid");
    }
}
