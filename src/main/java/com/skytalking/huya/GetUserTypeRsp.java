package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class GetUserTypeRsp extends JceStruct {
    public long lUid;
    public long lPresenterUid;
    public int iType;
    public IsMutedRsp tIsMutedRsp = new IsMutedRsp();
    public int iGHManagerType;
    public String sManagerDecorationUrl;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lUid, 0);
        jceOutputStream.write(lPresenterUid, 1);
        jceOutputStream.write(iType, 3);
        jceOutputStream.write(tIsMutedRsp, 4);
        jceOutputStream.write(iGHManagerType, 5);
        jceOutputStream.write(sManagerDecorationUrl, 6);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lPresenterUid = jceInputStream.read(lPresenterUid, 1, false);
        iType = jceInputStream.read(iType, 3, false);
        tIsMutedRsp = (IsMutedRsp) jceInputStream.read(tIsMutedRsp, 4, false);
        iGHManagerType = jceInputStream.read(iGHManagerType, 5, false);
        sManagerDecorationUrl = jceInputStream.read(sManagerDecorationUrl, 6, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(lUid, "lUid");
        jceDisplayer.display(lPresenterUid, "lPresenterUid");
        jceDisplayer.display(iType, "iType");
        jceDisplayer.display(tIsMutedRsp, "tIsMutedRsp");
        jceDisplayer.display(iGHManagerType, "iGHManagerType");
        jceDisplayer.display(sManagerDecorationUrl, "sManagerDecorationUrl");
    }
}
