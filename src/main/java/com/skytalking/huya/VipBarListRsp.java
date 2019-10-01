package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class VipBarListRsp extends JceStruct {
    public int iStart = 0;
    public int iCount = 0;
    public int iTotal = 0;
    public List<VipBarItem> vVipBarItem = new ArrayList<>();
    public String sBadgeName = "";
    public int iChangedHighestRank = 0;
    public long lPid = 0;
    public String sVLogo = "";

    public VipBarListRsp() {
        vVipBarItem.add(new VipBarItem());
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iStart = jceInputStream.read(iStart, 1, false);
        iCount = jceInputStream.read(iCount, 2, false);
        iTotal = jceInputStream.read(iTotal, 3, false);
        vVipBarItem = (List<VipBarItem>) jceInputStream.read(vVipBarItem, 4, false);
        sBadgeName = jceInputStream.read(sBadgeName, 5, false);
        iChangedHighestRank = jceInputStream.read(iChangedHighestRank, 6, false);
        lPid = jceInputStream.read(lPid, 7, false);
        sVLogo = jceInputStream.read(sVLogo, 8, false);
    }
}
