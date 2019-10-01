package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class PresenterChannelInfo extends JceStruct {
    public long lYYId = 0;
    public long lTid = 0;
    public long lSid = 0;
    public int iSourceType = 0;
    public int iScreenType = 0;
    public long lUid = 0;
    public int iGameId = 0;
    public int iRoomId = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lYYId, 0);
        jceOutputStream.write(lTid, 1);
        jceOutputStream.write(lSid, 3);
        jceOutputStream.write(iSourceType, 4);
        jceOutputStream.write(iScreenType, 5);
        jceOutputStream.write(lUid, 6);
        jceOutputStream.write(iGameId, 7);
        jceOutputStream.write(iRoomId, 8);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lYYId = jceInputStream.read(lYYId, 0, false);
        lTid = jceInputStream.read(lTid, 1, false);
        lSid = jceInputStream.read(lSid, 3, false);
        iSourceType = jceInputStream.read(iSourceType, 4, false);
        iScreenType = jceInputStream.read(iScreenType, 5, false);
        lUid = jceInputStream.read(lUid, 6, false);
        iGameId = jceInputStream.read(iGameId, 7, false);
        iRoomId = jceInputStream.read(iRoomId, 8, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lYYId, "lYYId");
        jceDisplayer.display(lTid, "lTid");
        jceDisplayer.display(lSid, "lSid");
        jceDisplayer.display(iSourceType, "iSourceType");
        jceDisplayer.display(iScreenType, "iScreenType");
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(iGameId, "iGameId");
        jceDisplayer.display(iRoomId, "iRoomId");
    }
}
