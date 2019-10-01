package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class QueryTreasureInfoReq extends JceStruct {
    public UserId tId = new UserId();
    public long lSid = 0;
    public long lSubSid = 0;
    public int iFromType = 0;
    public long lRoomId = 0;
    public long lPid = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lSid, 1);
        jceOutputStream.write(lSubSid, 2);
        jceOutputStream.write(iFromType, 4);
        jceOutputStream.write(lRoomId, 5);
        jceOutputStream.write(lPid, 6);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
