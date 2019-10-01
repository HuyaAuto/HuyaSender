package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class NobleLevelAttr extends JceStruct {
    public int iAttrType = 0;
    public long lValidDate = 0;
    public int iAttrStatus = 0;
    public int iProgress = 0;
    public int iTask = 0;
    public int iRemainDays = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iAttrType = jceInputStream.read(iAttrType, 0, false);
        lValidDate = jceInputStream.read(lValidDate, 1, false);
        iAttrStatus = jceInputStream.read(iAttrStatus, 2, false);
        iProgress = jceInputStream.read(iProgress, 3, false);
        iTask = jceInputStream.read(iTask, 4, false);
        iRemainDays = jceInputStream.read(iRemainDays, 5, false);
    }
}
