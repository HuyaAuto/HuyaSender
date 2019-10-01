package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class AwardBoxPrizeReq extends JceStruct {
    public UserId tId = new UserId();
    public long lSid = 0;
    public long lSubSid = 0;
    public int iTaskId = 0;
    public String sPassport = "";
    public int iFromType = 0;
    public float fVersion = 1;
    public String sTime = "";
    public String sMd5 = "";
    public String sChannel = "";
    public String sIp = "";
    public int iPrizeType = 0;
    public long lPid = 0;
    public int iADType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lSid, 1);
        jceOutputStream.write(lSubSid, 2);
        jceOutputStream.write(iTaskId, 3);
        jceOutputStream.write(sPassport, 4);
        jceOutputStream.write(iFromType, 5);
        jceOutputStream.write(fVersion, 6);
        jceOutputStream.write(sTime, 7);
        jceOutputStream.write(sMd5, 8);
        jceOutputStream.write(sChannel, 9);
        jceOutputStream.write(sIp, 10);
        jceOutputStream.write(iPrizeType, 11);
        jceOutputStream.write(lPid, 12);
        jceOutputStream.write(iADType, 13);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
