package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class NobleLevelInfo extends JceStruct {
    public int iNobleLevel = 0;
    public int iAttrType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(iNobleLevel, 0);
        jceOutputStream.write(iAttrType, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iNobleLevel = jceInputStream.read(iNobleLevel, 0, false);
        iAttrType = jceInputStream.read(iAttrType, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iNobleLevel, "iNobleLevel");
        jceDisplayer.display(iAttrType, "iAttrType");
    }
}
