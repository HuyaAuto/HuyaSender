package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class VideoGatewayProxy2VGPingReq extends JceStruct {
    public long lLocalTime = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(lLocalTime, 0);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
