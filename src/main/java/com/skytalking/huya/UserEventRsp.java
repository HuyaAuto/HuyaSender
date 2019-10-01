package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class UserEventRsp extends JceStruct {
    public long lTid = 0;
    public long lSid = 0;
    public int iUserHeartBeatInterval = 0;
    public int iPresentHeartBeatInterval = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lTid = jceInputStream.read(lTid, 0, false);
        lSid = jceInputStream.read(lSid, 1, false);
        iUserHeartBeatInterval = jceInputStream.read(iUserHeartBeatInterval, 2, false);
        iPresentHeartBeatInterval = jceInputStream.read(iPresentHeartBeatInterval, 3, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lTid, "lTid");
        jceDisplayer.display(lSid, "lSid");
        jceDisplayer.display(iUserHeartBeatInterval, "iUserHeartBeatInterval");
        jceDisplayer.display(iPresentHeartBeatInterval, "iPresentHeartBeatInterval");
    }
}
