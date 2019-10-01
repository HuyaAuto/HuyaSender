package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/**
 * HUYA.MutedComeFromType = {
 * Muted_DefaultBarrage: 0,
 * Muted_WeekRank: 1,
 * Muted_FansRank: 2,
 * Muted_VipBar: 3,
 * Muted_FansSurport: 4,
 * Muted_WeekHeartStirRank: 5,
 * Muted_WeekHeartBlockRank: 6,
 * Muted_OnSendItem: 7,
 * Muted_OnUserEnterNotic: 8
 * };
 */
public class MuteRoomUserReq extends JceStruct {
    public UserId tId = new UserId();
    public long lUid = 0;
    public String sText = "";
    public long lPresenterUid = 0;
    public long lSubcid = 0;
    public int iMutedTime = 0;
    public int iMutedAction = 0;
    public int iReasonType = 0;
    public String sReason = "";
    public int iComeFromType = 0;
    public int iMutedFromType = 0;

    @Override

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lUid, 1);
        jceOutputStream.write(sText, 2);
        jceOutputStream.write(lPresenterUid, 3);
        jceOutputStream.write(lSubcid, 4);
        jceOutputStream.write(iMutedTime, 5);
        jceOutputStream.write(iMutedAction, 6);
        jceOutputStream.write(iReasonType, 7);
        jceOutputStream.write(sReason, 8);
        jceOutputStream.write(iComeFromType, 9);
        jceOutputStream.write(iMutedFromType, 10);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        tId = (UserId) jceInputStream.read(tId, 0, false);
        lUid = jceInputStream.read(lUid, 1, false);
        sText = jceInputStream.read(sText, 2, false);
        lPresenterUid = jceInputStream.read(lPresenterUid, 3, false);
        lSubcid = jceInputStream.read(lSubcid, 4, false);
        iMutedTime = jceInputStream.read(iMutedTime, 5, false);
        iMutedAction = jceInputStream.read(iMutedAction, 6, false);
        iReasonType = jceInputStream.read(iReasonType, 7, false);
        sReason = jceInputStream.read(sReason, 8, false);
        iComeFromType = jceInputStream.read(iComeFromType, 9, false);
        iMutedFromType = jceInputStream.read(iMutedFromType, 10, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(tId, "tId");
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(sText, "sText");
        jceDisplayer.display(lPresenterUid, "lPresenterUid");
        jceDisplayer.display(lSubcid, "lSubcid");
        jceDisplayer.display(iMutedTime, "iMutedTime");
        jceDisplayer.display(iMutedAction, "iMutedAction");
        jceDisplayer.display(iReasonType, "iReasonType");
        jceDisplayer.display(sReason, "sReason");
        jceDisplayer.display(iComeFromType, "iComeFromType");
        jceDisplayer.display(iMutedFromType, "iMutedFromType");
    }
}
