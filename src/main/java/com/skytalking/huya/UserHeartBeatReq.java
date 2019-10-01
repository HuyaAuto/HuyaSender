package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class UserHeartBeatReq extends JceStruct {
    public UserId tId = new UserId();
    public long lTid = 0;
    public long lSid = 0;
    public long lPid = 0;
    public boolean bWatchVideo = false;
    public int eLineType = 0;
    public int iFps = 0;
    public int iAttendee = 0;
    public int iBandwidth = 0;
    public int iLastHeartElapseTime = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lTid, 1);
        jceOutputStream.write(lSid, 2);
        jceOutputStream.write(lPid, 4);
        jceOutputStream.write(bWatchVideo, 5);
        jceOutputStream.write(eLineType, 6);
        jceOutputStream.write(iFps, 7);
        jceOutputStream.write(iAttendee, 8);
        jceOutputStream.write(iBandwidth, 9);
        jceOutputStream.write(iLastHeartElapseTime, 10);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
