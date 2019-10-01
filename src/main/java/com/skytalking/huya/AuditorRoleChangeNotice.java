package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class AuditorRoleChangeNotice extends JceStruct {
    public int iOldUserType = 0;
    public int iNewUserType = 0;
    public long lUid = 0;
    public long lSubcid = 0;
    public String sNick = "";
    public boolean bPopUp = false;
    public String sSystemTips = "";
    public boolean bSendMessagePopUp = false;
    public String sSendMessageTips = "";
    public int iSendMessagePopUpAmtTime = 0;
    public long lPid = 0;

    //  G.isManager = e == 1 || e == 2 || e == 6
    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(iOldUserType, 0);
        jceOutputStream.write(iNewUserType, 1);
        jceOutputStream.write(lUid, 2);
        jceOutputStream.write(lSubcid, 3);
        jceOutputStream.write(sNick, 4);
        jceOutputStream.write(bPopUp, 5);
        jceOutputStream.write(sSystemTips, 6);
        jceOutputStream.write(bSendMessagePopUp, 7);
        jceOutputStream.write(sSendMessageTips, 8);
        jceOutputStream.write(iSendMessagePopUpAmtTime, 9);
        jceOutputStream.write(lPid, 10);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iOldUserType = jceInputStream.read(iOldUserType, 0, false);
        iNewUserType = jceInputStream.read(iNewUserType, 1, false);
        lUid = jceInputStream.read(lUid, 2, false);
        lSubcid = jceInputStream.read(lSubcid, 3, false);
        sNick = jceInputStream.read(sNick, 4, false);
        bPopUp = jceInputStream.read(bPopUp, 5, false);
        sSystemTips = jceInputStream.read(sSystemTips, 6, false);
        bSendMessagePopUp = jceInputStream.read(bSendMessagePopUp, 7, false);
        sSendMessageTips = jceInputStream.read(sSendMessageTips, 8, false);
        iSendMessagePopUpAmtTime = jceInputStream.read(iSendMessagePopUpAmtTime, 9, false);
        lPid = jceInputStream.read(lPid, 10, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iOldUserType, "iOldUserType");
        jceDisplayer.display(iNewUserType, "iNewUserType");
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(lSubcid, "lSubcid");
        jceDisplayer.display(sNick, "sNick");
        jceDisplayer.display(bPopUp, "bPopUp");
        jceDisplayer.display(sSystemTips, "sSystemTips");
        jceDisplayer.display(bSendMessagePopUp, "bSendMessagePopUp");
        jceDisplayer.display(sSendMessageTips, "sSendMessageTips");
        jceDisplayer.display(iSendMessagePopUpAmtTime, "iSendMessagePopUpAmtTime");
        jceDisplayer.display(lPid, "lPid");
    }
}
