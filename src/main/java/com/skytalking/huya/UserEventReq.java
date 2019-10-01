package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class UserEventReq extends JceStruct {
    public UserId tId = new UserId();
    public long lTid = 0;
    public long lSid = 0;
    public long eOp = 0;
    public String sChan = "";
    public int eSource = 0;
    public long lPid = 0;
    public boolean bWatchVideo = false;
    public boolean bAnonymous = false;
    public int eTemplateType = TemplateType.PRIMARY;
    public String sTraceSource = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lTid, 1);
        jceOutputStream.write(lSid, 2);
        jceOutputStream.write(eOp, 4);
        jceOutputStream.write(sChan, 5);
        jceOutputStream.write(eSource, 6);
        jceOutputStream.write(lPid, 7);
        jceOutputStream.write(bWatchVideo, 8);
        jceOutputStream.write(bAnonymous, 9);
        jceOutputStream.write(eTemplateType, 10);
        jceOutputStream.write(sTraceSource, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
