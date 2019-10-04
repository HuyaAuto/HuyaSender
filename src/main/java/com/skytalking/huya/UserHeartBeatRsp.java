package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class UserHeartBeatRsp extends JceStruct {
    public int iRet = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRet = jceInputStream.read(iRet, 0, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRet, "iRet");
    }
}
