package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class NobleBase extends JceStruct {
    private static DecorationInfo sDecorationInfo = new DecorationInfo();
    public long lUid = 0;
    public String sNickName = "";
    public int iLevel = 0;
    public String sName = "";
    public int iPet = 0;
    public long lPid = 0;
    public long lTid = 0;
    public long lSid = 0;
    public long lStartTime = 0;
    public long lEndTime = 0;
    public int iLeftDay = 0;
    public int iStatus = 0;
    public int iOpenFlag = 0;
    public int iMonths = 0;
    public String sPNickName = "";
    public long lShortSid = 0;
    public int iSourceType = 0;
    public int iPayType = 0;
    public String sLogoUrl = "";
    public List<DecorationInfo> vDecorationPrefix = new ArrayList<>();
    public List<DecorationInfo> vDecorationSuffix = new ArrayList<>();
    public int iScreenType = 0;
    public NobleLevelInfo tLevel = new NobleLevelInfo();
    public long lRoomId = 0;

    public NobleBase() {
        vDecorationPrefix.add(sDecorationInfo);
        vDecorationSuffix.add(sDecorationInfo);
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lUid, 0);
        jceOutputStream.write(sNickName, 1);
        jceOutputStream.write(iLevel, 2);
        jceOutputStream.write(sName, 3);
        jceOutputStream.write(iPet, 4);
        jceOutputStream.write(lPid, 5);
        jceOutputStream.write(lTid, 6);
        jceOutputStream.write(lSid, 7);
        jceOutputStream.write(lStartTime, 8);
        jceOutputStream.write(lEndTime, 9);
        jceOutputStream.write(iLeftDay, 10);
        jceOutputStream.write(iStatus, 11);
        jceOutputStream.write(iOpenFlag, 12);
        jceOutputStream.write(iMonths, 13);
        jceOutputStream.write(sPNickName, 14);
        jceOutputStream.write(lShortSid, 15);
        jceOutputStream.write(iSourceType, 16);
        jceOutputStream.write(iPayType, 17);
        jceOutputStream.write(sLogoUrl, 18);
        jceOutputStream.write(vDecorationPrefix, 19);
        jceOutputStream.write(vDecorationSuffix, 20);
        jceOutputStream.write(iScreenType, 21);
        jceOutputStream.write(tLevel, 22);
        jceOutputStream.write(lRoomId, 23);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        sNickName = jceInputStream.read(sNickName, 1, false);
        iLevel = jceInputStream.read(iLevel, 2, false);
        sName = jceInputStream.read(sName, 3, false);
        iPet = jceInputStream.read(iPet, 4, false);
        lPid = jceInputStream.read(lPid, 5, false);
        lTid = jceInputStream.read(lTid, 6, false);
        lSid = jceInputStream.read(lSid, 7, false);
        lStartTime = jceInputStream.read(lStartTime, 8, false);
        lEndTime = jceInputStream.read(lEndTime, 9, false);
        iLeftDay = jceInputStream.read(iLeftDay, 10, false);
        iStatus = jceInputStream.read(iStatus, 11, false);
        iOpenFlag = jceInputStream.read(iOpenFlag, 12, false);
        iMonths = jceInputStream.read(iMonths, 13, false);
        sPNickName = jceInputStream.read(sPNickName, 14, false);
        lShortSid = jceInputStream.read(lShortSid, 15, false);
        iSourceType = jceInputStream.read(iSourceType, 16, false);
        iPayType = jceInputStream.read(iPayType, 17, false);
        sLogoUrl = jceInputStream.read(sLogoUrl, 18, false);
        vDecorationPrefix = jceInputStream.readArray(vDecorationPrefix, 19, false);
        vDecorationSuffix = jceInputStream.readArray(vDecorationSuffix, 20, false);
        iScreenType = jceInputStream.read(iScreenType, 21, false);
        tLevel = (NobleLevelInfo) jceInputStream.read(tLevel, 22, false);
        lRoomId = jceInputStream.read(lRoomId, 23, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(sNickName, "sNickName");
        jceDisplayer.display(iLevel, "iLevel");
        jceDisplayer.display(sName, "sName");
        jceDisplayer.display(iPet, "iPet");
        jceDisplayer.display(lPid, "lPid");
        jceDisplayer.display(lTid, "lTid");
        jceDisplayer.display(lSid, "lSid");
        jceDisplayer.display(lStartTime, "lStartTime");
        jceDisplayer.display(lEndTime, "lEndTime");
        jceDisplayer.display(iLeftDay, "iLeftDay");
        jceDisplayer.display(iStatus, "iStatus");
        jceDisplayer.display(iOpenFlag, "iOpenFlag");
        jceDisplayer.display(iMonths, "iMonths");
        jceDisplayer.display(sPNickName, "sPNickName");
        jceDisplayer.display(lShortSid, "lShortSid");
        jceDisplayer.display(iSourceType, "iSourceType");
        jceDisplayer.display(iPayType, "iPayType");
        jceDisplayer.display(sLogoUrl, "sLogoUrl");
        jceDisplayer.display(vDecorationPrefix, "vDecorationPrefix");
        jceDisplayer.display(vDecorationSuffix, "vDecorationSuffix");
        jceDisplayer.display(iScreenType, "iScreenType");
        jceDisplayer.display(tLevel, "tLevel");
        jceDisplayer.display(lRoomId, "lRoomId");
    }
}
