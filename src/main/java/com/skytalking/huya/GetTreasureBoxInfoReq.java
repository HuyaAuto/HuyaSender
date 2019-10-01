package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class GetTreasureBoxInfoReq extends JceStruct {
    public UserId tId = new UserId();
    public String sChannel = "";
    public String sIp = "";
    public long lPid = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(sChannel, 1);
        jceOutputStream.write(sIp, 2);
        jceOutputStream.write(lPid, 3);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
