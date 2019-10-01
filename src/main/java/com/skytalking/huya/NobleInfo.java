package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class NobleInfo extends JceStruct {
    public long lUid = 0;
    public long lPid = 0;
    public long lValidDate = 0;
    public String sNobleName = "";
    public int iNobleLevel = 0;
    public int iNoblePet = 0;
    public int iNobleStatus = 0;
    public int iNobleType = 0;
    public int iRemainDays = 0;
    public NobleLevelAttr tLevelAttr = new NobleLevelAttr();

    @Override

    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lPid = jceInputStream.read(lPid, 1, false);
        lValidDate = jceInputStream.read(lValidDate, 2, false);
        sNobleName = jceInputStream.read(sNobleName, 3, false);
        iNobleLevel = jceInputStream.read(iNobleLevel, 4, false);
        iNoblePet = jceInputStream.read(iNoblePet, 5, false);
        iNobleStatus = jceInputStream.read(iNobleStatus, 6, false);
        iNobleType = jceInputStream.read(iNobleType, 7, false);
        iRemainDays = jceInputStream.read(iRemainDays, 8, false);
        tLevelAttr = (NobleLevelAttr) jceInputStream.read(tLevelAttr, 9, false);
    }
}
