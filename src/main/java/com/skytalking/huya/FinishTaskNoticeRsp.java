package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class FinishTaskNoticeRsp extends JceStruct {
    public int iRspCode = 0;
    public int iTaskId = 0;
    public int iPrizeType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRspCode = jceInputStream.read(iRspCode, 0, false);
        iTaskId = jceInputStream.read(iTaskId, 1, false);
        iPrizeType = jceInputStream.read(iPrizeType, 3, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRspCode, "iRspCode");
        jceDisplayer.display(iTaskId, "iTaskId");
        jceDisplayer.display(iPrizeType, "iPrizeType");
    }
}
