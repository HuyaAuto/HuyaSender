package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class ReplayPresenterInLiveNotify extends JceStruct {
    public long lUid = 0;
    public long lChannelId = 0;
    public long lSubChannelId = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        lChannelId = jceInputStream.read(lChannelId, 1, false);
        lSubChannelId = jceInputStream.read(lSubChannelId, 2, false);
    }
}
