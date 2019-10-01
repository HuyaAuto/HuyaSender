package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class IsMutedRsp extends JceStruct {
    public boolean bMuted;
    public int iMutedTime;
    public long lAutoUnmutedTime;
    public int iMutedType;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(bMuted, 0);
        jceOutputStream.write(iMutedTime, 1);
        jceOutputStream.write(lAutoUnmutedTime, 2);
        jceOutputStream.write(iMutedType, 3);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        bMuted = jceInputStream.read(bMuted, 0, false);
        iMutedTime = jceInputStream.read(iMutedTime, 1, false);
        lAutoUnmutedTime = jceInputStream.read(lAutoUnmutedTime, 2, false);
        iMutedType = jceInputStream.read(iMutedType, 3, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(bMuted, "bMuted");
        jceDisplayer.display(iMutedTime, "iMutedTime");
        jceDisplayer.display(lAutoUnmutedTime, "lAutoUnmutedTime");
        jceDisplayer.display(iMutedType,"iMutedType");
    }
}
