package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class GuildMemInfo extends JceStruct {
    public int iGuildVip = 0;
    public String sUrl = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iGuildVip = jceInputStream.read(iGuildVip, 0, false);
        sUrl = jceInputStream.read(sUrl, 1, false);
    }
}
