package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class FansInfo extends JceStruct {
    public long lUid = 0;
    public long lBadgeId = 0;
    public int iBadgeLevel = 0;
    public int iScore = 0;
    public int iVFlag = 0;
    public int iBadgeType = 0;
    public int iSFFlag = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lBadgeId = jceInputStream.read(lBadgeId, 1, false);
        iBadgeLevel = jceInputStream.read(iBadgeLevel, 2, false);
        iScore = jceInputStream.read(iScore, 3, false);
        iVFlag = jceInputStream.read(iVFlag, 4, false);
        iBadgeType = jceInputStream.read(iBadgeType, 5, false);
        iSFFlag = jceInputStream.read(iSFFlag, 6, false);
    }
}
