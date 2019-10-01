package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class LiveRoomTransferNotice extends JceStruct {
    public BeginLiveNotice tNotice = new BeginLiveNotice();
    public StreamSettingNotice tStreamSettingNotice = new StreamSettingNotice();

    @Override

    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        tNotice = (BeginLiveNotice) jceInputStream.read(tNotice, 0, false);
        tStreamSettingNotice = (StreamSettingNotice) jceInputStream.read(tStreamSettingNotice, 1, false);
    }
}
