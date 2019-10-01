package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class BadgeInfo extends JceStruct {
    public long lUid = 0;
    public long lBadgeId = 0;
    public String sPresenterNickName = "";
    public String sBadgeName = "";
    public int iBadgeLevel = 0;
    public int iRank = 0;
    public int iScore = 0;
    public int iNextScore = 0;
    public int iQuotaUsed = 0;
    public int iQuota = 0;
    public long lQuotaTS = 0;
    public long lOpenTS = 0;
    public int iVFlag = 0;
    public String sVLogo = "";
    public PresenterChannelInfo tChannelInfo = new PresenterChannelInfo();
    public String sPresenterLogo = "";
    public long lVExpiredTS = 0;
    public int iBadgeType = 0;
    public FaithInfo tFaithInfo = new FaithInfo();
    public SuperFansInfo tSuperFansInfo = new SuperFansInfo();

    @Override

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lUid, 0);
        jceOutputStream.write(lBadgeId, 1);
        jceOutputStream.write(sPresenterNickName, 2);
        jceOutputStream.write(sBadgeName, 3);
        jceOutputStream.write(iBadgeLevel, 4);
        jceOutputStream.write(iRank, 5);
        jceOutputStream.write(iScore, 6);
        jceOutputStream.write(iNextScore, 7);
        jceOutputStream.write(iQuotaUsed, 8);
        jceOutputStream.write(iQuota, 9);
        jceOutputStream.write(lQuotaTS, 10);
        jceOutputStream.write(lOpenTS, 11);
        jceOutputStream.write(iVFlag, 12);
        jceOutputStream.write(sVLogo, 13);
        jceOutputStream.write(tChannelInfo, 14);
        jceOutputStream.write(sPresenterLogo, 15);
        jceOutputStream.write(lVExpiredTS, 16);
        jceOutputStream.write(iBadgeType, 17);
        jceOutputStream.write(tFaithInfo, 18);
        jceOutputStream.write(tSuperFansInfo, 19);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lBadgeId = jceInputStream.read(lBadgeId, 1, false);
        sPresenterNickName = jceInputStream.read(sPresenterNickName, 2, false);
        sBadgeName = jceInputStream.read(sBadgeName, 3, false);
        iBadgeLevel = jceInputStream.read(iBadgeLevel, 4, false);
        iRank = jceInputStream.read(iRank, 5, false);
        iScore = jceInputStream.read(iScore, 6, false);
        iNextScore = jceInputStream.read(iNextScore, 7, false);
        iQuotaUsed = jceInputStream.read(iQuotaUsed, 8, false);
        iQuota = jceInputStream.read(iQuota, 9, false);
        lQuotaTS = jceInputStream.read(lQuotaTS, 10, false);
        lOpenTS = jceInputStream.read(lOpenTS, 11, false);
        iVFlag = jceInputStream.read(iVFlag, 12, false);
        sVLogo = jceInputStream.read(sVLogo, 13, false);
        tChannelInfo = (PresenterChannelInfo) jceInputStream.read(tChannelInfo, 14, false);
        sPresenterLogo = jceInputStream.read(sPresenterLogo, 15, false);
        lVExpiredTS = jceInputStream.read(lVExpiredTS, 16, false);
        iBadgeType = jceInputStream.read(iBadgeType, 17, false);
        tFaithInfo = (FaithInfo) jceInputStream.read(tFaithInfo, 18, false);
        tSuperFansInfo = (SuperFansInfo) jceInputStream.read(tSuperFansInfo, 19, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(lBadgeId, "lBadgeId");
        jceDisplayer.display(sPresenterNickName, "sPresenterNickName");
        jceDisplayer.display(sBadgeName, "sBadgeName");
        jceDisplayer.display(iBadgeLevel, "iBadgeLevel");
        jceDisplayer.display(iRank, "iRank");
        jceDisplayer.display(iScore, "iScore");
        jceDisplayer.display(iNextScore, "iNextScore");
        jceDisplayer.display(iQuotaUsed, "iQuotaUsed");
        jceDisplayer.display(iQuota, "iQuota");
        jceDisplayer.display(lQuotaTS, "lQuotaTS");
        jceDisplayer.display(lOpenTS, "lOpenTS");
        jceDisplayer.display(iVFlag, "iVFlag");
        jceDisplayer.display(sVLogo, "sVLogo");
        jceDisplayer.display(tChannelInfo, "tChannelInfo");
        jceDisplayer.display(sPresenterLogo, "sPresenterLogo");
        jceDisplayer.display(lVExpiredTS, "lVExpiredTS");
        jceDisplayer.display(iBadgeType, "iBadgeType");
        jceDisplayer.display(tFaithInfo, "tFaithInfo");
        jceDisplayer.display(tSuperFansInfo, "tSuperFansInfo");
    }
}
