package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class EnterChannelReq extends JceStruct {
    public UserId tUserId = new UserId();
    public long lTid = 0;
    public long lSid = 0;
    public int iChannelType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tUserId, 1);
        jceOutputStream.write(lTid, 2);
        jceOutputStream.write(lSid, 3);
        jceOutputStream.write(iChannelType, 4);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
