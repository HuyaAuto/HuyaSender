package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class ADBoxTaskInfo extends JceStruct {
    public int iTaskId = 0;
    public int iStat = 0;
    public int iADType = 0;
    public int iItemCount = 0;
    public int iRewardLevel = 0;
    public String sADPic = "";
    public String sGetPic = "";
    public String sGetJmp = "";
    public String sUnGetPic = "";
    public String sUnGetJmp = "";
    public int iGiftType = 0;
    public String sTitle = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iTaskId = jceInputStream.read(iTaskId, 0, false);
        iStat = jceInputStream.read(iStat, 1, false);
        iADType = jceInputStream.read(iADType, 2, false);
        iItemCount = jceInputStream.read(iItemCount, 3, false);
        iRewardLevel = jceInputStream.read(iRewardLevel, 4, false);
        sADPic = jceInputStream.read(sADPic, 5, false);
        sGetPic = jceInputStream.read(sGetPic, 6, false);
        sGetJmp = jceInputStream.read(sGetJmp, 7, false);
        sUnGetPic = jceInputStream.read(sUnGetPic, 8, false);
        sUnGetJmp = jceInputStream.read(sUnGetJmp, 9, false);
        iGiftType = jceInputStream.read(iGiftType, 10, false);
        sTitle = jceInputStream.read(sTitle, 11, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iTaskId, "iTaskId");
        jceDisplayer.display(iStat, "iStat");
        jceDisplayer.display(iADType, "iADType");
        jceDisplayer.display(iItemCount, "iItemCount");
        jceDisplayer.display(iRewardLevel, "iRewardLevel");
        jceDisplayer.display(sADPic, "sADPic");
        jceDisplayer.display(sGetPic, "sGetPic");
        jceDisplayer.display(sGetJmp, "sGetJmp");
        jceDisplayer.display(sUnGetPic, "sUnGetPic");
        jceDisplayer.display(sUnGetJmp, "sUnGetJmp");
        jceDisplayer.display(iGiftType, "iGiftType");
        jceDisplayer.display(sTitle, "sTitle");
    }
}
