package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class MsgCommDecoChannelRoleInfo extends JceStruct {
    public int iLevel;

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iLevel, "iLevel");

    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(iLevel, 0);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iLevel = jceInputStream.read(iLevel, 0, false);
    }
}
