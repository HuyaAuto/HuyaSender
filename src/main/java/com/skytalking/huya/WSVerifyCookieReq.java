package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class WSVerifyCookieReq extends JceStruct {
    public long lUid = 0;
    public String sUA = "";
    public String sCookie = "";
    public String sGuid = "";
    public int bAutoRegisterUid = 0;
    public String sAppSrc = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lUid, 0);
        jceOutputStream.write(sUA, 1);
        jceOutputStream.write(sCookie, 2);
        jceOutputStream.write(sGuid, 3);
        jceOutputStream.write(bAutoRegisterUid, 4);
        jceOutputStream.write(sAppSrc, 5);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
    }
}
