package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class PresenterEndGameNotice extends JceStruct {
    public int iGameId = 0;
    public int iGameUnitId = 0;
    public int iGameResult = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iGameId = jceInputStream.read(iGameId, 0, false);
        iGameUnitId = jceInputStream.read(iGameUnitId, 1, false);
        iGameResult = jceInputStream.read(iGameResult, 2, false);
    }
}
