package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class VipBarItem extends JceStruct {
    public long lUid = 0;
    public int iTypes = 0;
    public NobleInfo tNobleInfo = new NobleInfo();
    public GuardInfo tGuardInfo = new GuardInfo();
    public FansInfo tFansInfo = new FansInfo();
    public String sNickName = "";
    public int SuperPupleLevel = 0;
    public int iPotentialTypes = 0;
    public String sLogo = "";
    public long lExpiredTS = 0;
    public int iUserLevel = 0;
    public String sLon = "";
    public String sLat = "";
    public String sSession = "";
    public GuildMemInfo tGuildMemInfo = new GuildMemInfo();
    public String sLogoDecoUrl = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        lUid = jceInputStream.read(lUid, 0, false);
        iTypes = jceInputStream.read(iTypes, 1, false);
        tNobleInfo = (NobleInfo) jceInputStream.read(tNobleInfo, 2, false);
        tGuardInfo = (GuardInfo) jceInputStream.read(tGuardInfo, 3, false);
        tFansInfo = (FansInfo) jceInputStream.read(tFansInfo, 4, false);
        sNickName = jceInputStream.read(sNickName, 5, false);
        SuperPupleLevel = jceInputStream.read(SuperPupleLevel, 6, false);
        iPotentialTypes = jceInputStream.read(iPotentialTypes, 7, false);
        sLogo = jceInputStream.read(sLogo, 8, false);
        lExpiredTS = jceInputStream.read(lExpiredTS, 9, false);
        iUserLevel = jceInputStream.read(iUserLevel, 10, false);
        sLon = jceInputStream.read(sLon, 13, false);
        sLat = jceInputStream.read(sLat, 14, false);
        sSession = jceInputStream.read(sSession, 15, false);
        tGuildMemInfo = (GuildMemInfo) jceInputStream.read(tGuildMemInfo, 16, false);
        sLogoDecoUrl = jceInputStream.read(sLogoDecoUrl, 17, false);


    }
}
