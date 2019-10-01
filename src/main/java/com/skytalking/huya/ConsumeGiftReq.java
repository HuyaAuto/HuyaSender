package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.HashMap;
import java.util.Map;

public class ConsumeGiftReq extends JceStruct {
    public UserId tId = new UserId();
    public long lSid = 0;
    public long lSubSid = 0;
    public int iShowFreeitemInfo = 0;
    public int iItemType = 0;
    public int iItemCount = 0;
    public long lPresenterUid = 0;
    public String sPayId = "";
    public String sSendContent = "";
    public int iPayPloy = 0;
    public int iFromType = 0;
    public String sExpand = "";
    public int iTemplateType = 0;
    public String sPassport = "";
    public int iEventType = 0;
    public Map<String, String> mapParam = new HashMap<>();
    public String sSenderNick = "";
    public String sPresenterNick = "";
    public String sSign = "";
    public int iUseType = 0;
    public int iMergeDeliver = 0;

    public ConsumeGiftReq() {
        mapParam.put("", "");
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(lSid, 1);
        jceOutputStream.write(lSubSid, 2);
        jceOutputStream.write(iShowFreeitemInfo, 3);
        jceOutputStream.write(iItemType, 4);
        jceOutputStream.write(iItemCount, 5);
        jceOutputStream.write(lPresenterUid, 6);
        jceOutputStream.write(sPayId, 7);
        jceOutputStream.write(sSendContent, 8);
        jceOutputStream.write(iPayPloy, 9);
        jceOutputStream.write(iFromType, 10);
        jceOutputStream.write(sExpand, 11);
        jceOutputStream.write(iTemplateType, 12);
        jceOutputStream.write(sPassport, 13);
        jceOutputStream.write(iEventType, 14);
        jceOutputStream.write(mapParam, 15);
        jceOutputStream.write(sSenderNick, 16);
        jceOutputStream.write(sPresenterNick, 17);
        jceOutputStream.write(sSign, 18);
        jceOutputStream.write(iUseType, 19);
        jceOutputStream.write(iMergeDeliver, 20);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
