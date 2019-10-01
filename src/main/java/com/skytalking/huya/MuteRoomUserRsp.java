package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class MuteRoomUserRsp extends JceStruct {
    public int iRetCode = 0;
    public String sMsg = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(iRetCode, 0);
        jceOutputStream.write(sMsg, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRetCode = jceInputStream.read(iRetCode, 0, false);
        sMsg = jceInputStream.read(sMsg, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRetCode, "iRetCode");
        jceDisplayer.display(sMsg, "sMsg");
    }
}
