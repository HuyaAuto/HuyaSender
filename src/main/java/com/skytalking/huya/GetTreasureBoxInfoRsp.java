package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class GetTreasureBoxInfoRsp extends JceStruct {
    public long lUid = 0;
    public List<BoxTaskInfo> vBoxTaskInfo = new ArrayList<>();
    public int iBoxLevel = 0;
    public List<ADBoxTaskInfo> vADBoxInfo = new ArrayList<>();
    public String sBackGroundURL = "";
    public int iTipsCount = 0;
    public String sTipsPic = "";
    public String sBBGPic = "";

    public GetTreasureBoxInfoRsp() {
        vBoxTaskInfo.add(new BoxTaskInfo());
        vADBoxInfo.add(new ADBoxTaskInfo());
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        vBoxTaskInfo = (List<BoxTaskInfo>) jceInputStream.read(vBoxTaskInfo, 1, false);
        iBoxLevel = jceInputStream.read(iBoxLevel, 2, false);
        vADBoxInfo = (List<ADBoxTaskInfo>) jceInputStream.read(vADBoxInfo, 3, false);
        sBackGroundURL = jceInputStream.read(sBackGroundURL, 4, false);
        iTipsCount = jceInputStream.read(iTipsCount, 5, false);
        sTipsPic = jceInputStream.read(sTipsPic, 6, false);
        sBBGPic = jceInputStream.read(sBBGPic, 7, false);
    }
}
