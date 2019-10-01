package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class TreasureUpdateNotice extends JceStruct {
    public long lSendUid = 0;
    public String sSendNick = "";
    public int iQueneSize = 0;
    public int iCountDown = 0;
    public int iState = 0;
    public String Id = "";
    public int iTreasureType0 = 0;
    public String sTreasureName = "";
    public int iTreasureType = 0;
    public int iItemType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lSendUid = jceInputStream.read(lSendUid, 0, false);
        sSendNick = jceInputStream.read(sSendNick, 1, false);
        iQueneSize = jceInputStream.read(iQueneSize, 2, false);
        iCountDown = jceInputStream.read(iCountDown, 3, false);
        iState = jceInputStream.read(iState, 4, false);
        Id = jceInputStream.read(Id, 5, false);
        iTreasureType0 = jceInputStream.read(iTreasureType0, 6, false);
        sTreasureName = jceInputStream.read(sTreasureName, 7, false);
        iTreasureType = jceInputStream.read(iTreasureType, 8, false);
        iItemType = jceInputStream.read(iItemType, 9, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lSendUid, "lSendUid");
        jceDisplayer.display(sSendNick, "sSendNick");
        jceDisplayer.display(iQueneSize, "iQueneSize");
        jceDisplayer.display(iCountDown, "iCountDown");
        jceDisplayer.display(iState, "iState");
        jceDisplayer.display(Id, "Id");
        jceDisplayer.display(iTreasureType0, "iTreasureType0");
        jceDisplayer.display(sTreasureName, "sTreasureName");
        jceDisplayer.display(iTreasureType, "iTreasureType");
        jceDisplayer.display(iItemType, "iItemType");
    }
}
