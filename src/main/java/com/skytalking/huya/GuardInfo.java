package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class GuardInfo extends JceStruct {
    public long lUid = 0;
    public long lPid = 0;
    public int iGuardLevel = 0;
    public long lEndTime = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lPid = jceInputStream.read(lPid, 1, false);
        iGuardLevel = jceInputStream.read(iGuardLevel, 2, false);
        lEndTime = jceInputStream.read(lEndTime, 3, false);
    }
}
