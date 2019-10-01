package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class BoxTaskInfo extends JceStruct {
    public int iStat = 0;
    public int iItemType = 0;
    public int iItemCount = 0;
    public int iRewardLevel = 0;
    public int iTaskId = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iStat = jceInputStream.read(iStat, 0, false);
        iItemType = jceInputStream.read(iItemType, 1, false);
        iItemCount = jceInputStream.read(iItemCount, 2, false);
        iRewardLevel = jceInputStream.read(iRewardLevel, 3, false);
        iTaskId = jceInputStream.read(iTaskId, 4, false);
    }
}
