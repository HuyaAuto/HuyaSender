package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class QueryTreasureInfoRsp extends JceStruct {
    public int iRetCode = 0;
    public int iQueneSize = 0;
    public int iStatus = 0;
    public int iCountDown = 0;
    public long lUid = 0;
    public String sNickName = "";
    public int iTreasureType0 = 0;
    public String sTreasureName = "";
    public int iTreasureType = 0;
    public int iItemType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRetCode = jceInputStream.read(iRetCode, 0, false);
        iQueneSize = jceInputStream.read(iQueneSize, 1, false);
        iStatus = jceInputStream.read(iStatus, 2, false);
        iCountDown = jceInputStream.read(iCountDown, 3, false);
        lUid = jceInputStream.read(lUid, 4, false);
        sNickName = jceInputStream.read(sNickName, 5, false);
        iTreasureType0 = jceInputStream.read(iTreasureType0, 6, false);
        sTreasureName = jceInputStream.read(sTreasureName, 7, false);
        iTreasureType = jceInputStream.read(iTreasureType, 8, false);
        iItemType = jceInputStream.read(iItemType, 9, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRetCode, "iRetCode");
        jceDisplayer.display(iQueneSize, "iQueneSize");
        jceDisplayer.display(iStatus, "iStatus");
        jceDisplayer.display(iCountDown, "iCountDown");
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(sNickName, "sNickName");
        jceDisplayer.display(iTreasureType0, "iTreasureType0");
        jceDisplayer.display(sTreasureName, "sTreasureName");
        jceDisplayer.display(iTreasureType, "iTreasureType");
        jceDisplayer.display(iItemType, "iItemType");
    }
}
