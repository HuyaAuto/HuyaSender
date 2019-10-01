package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class AwardBoxPrizeRsp extends JceStruct {
    public int iRspCode = 0;
    public int iTaskId = 0;
    public int iItemType = 0;
    public int iCount = 0;
    public int iRewardLevel = 0;
    public int iOptStatus = 0;
    public String sOptText = "";
    public int iPrizeType = 0;
    public String sDiyAwardName = "";
    public int iADType = 0;
    public int iGiftType = 0;
    public String sCode = "";
    public String sDiyAwardName4App = "";
    public int iExistsSysMeg = 0;
    public String sAuthUrl = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iRspCode = jceInputStream.read(iRspCode, 0, false);
        iTaskId = jceInputStream.read(iTaskId, 1, false);
        iItemType = jceInputStream.read(iItemType, 2, false);
        iCount = jceInputStream.read(iCount, 3, false);
        iRewardLevel = jceInputStream.read(iRewardLevel, 4, false);
        iOptStatus = jceInputStream.read(iOptStatus, 5, false);
        sOptText = jceInputStream.read(sOptText, 6, false);
        iPrizeType = jceInputStream.read(iPrizeType, 7, false);
        sDiyAwardName = jceInputStream.read(sDiyAwardName, 8, false);
        iADType = jceInputStream.read(iADType, 9, false);
        iGiftType = jceInputStream.read(iGiftType, 10, false);
        sCode = jceInputStream.read(sCode, 11, false);
        sDiyAwardName4App = jceInputStream.read(sDiyAwardName4App, 12, false);
        iExistsSysMeg = jceInputStream.read(iExistsSysMeg, 13, false);
        sAuthUrl = jceInputStream.read(sAuthUrl, 14, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iRspCode, "iRspCode");
        jceDisplayer.display(iTaskId, "iTaskId");
        jceDisplayer.display(iItemType, "iItemType");
        jceDisplayer.display(iCount, "iCount");
        jceDisplayer.display(iRewardLevel, "iRewardLevel");
        jceDisplayer.display(iOptStatus, "iOptStatus");
        jceDisplayer.display(sOptText, "sOptText");
        jceDisplayer.display(iPrizeType, "iPrizeType");
        jceDisplayer.display(sDiyAwardName, "sDiyAwardName");
        jceDisplayer.display(iADType, "iADType");
        jceDisplayer.display(iGiftType, "iGiftType");
        jceDisplayer.display(sCode, "sCode");
        jceDisplayer.display(sDiyAwardName4App, "sDiyAwardName4App");
        jceDisplayer.display(iExistsSysMeg, "iExistsSysMeg");
        jceDisplayer.display(sAuthUrl, "sAuthUrl");
    }
}
