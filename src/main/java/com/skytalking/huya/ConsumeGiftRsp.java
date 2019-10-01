package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class ConsumeGiftRsp extends JceStruct {
    public int iPayRespCode = 0;
    public int iItemType = 0;
    public int iItemCount = 0;
    public String strPayId = "";
    public String strPayConfirmUrl = "";
    public String strSendContent = "";
    public long lPresenterUid = 0;
    public String sExpand = "";
    public String strPayItemInfo = "";
    public int iPayType = 0;
    public String sSign = "";
    public String sMsg = "";
    public int iPayTotal = 0;
    public int iItemGroup = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }


    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iPayRespCode = jceInputStream.read(iPayRespCode, 0, false);
        iItemType = jceInputStream.read(iItemType, 1, false);
        iItemCount = jceInputStream.read(iItemCount, 2, false);
        strPayId = jceInputStream.read(strPayId, 3, false);
        strPayConfirmUrl = jceInputStream.read(strPayConfirmUrl, 4, false);
        strSendContent = jceInputStream.read(strSendContent, 5, false);
        lPresenterUid = jceInputStream.read(lPresenterUid, 6, false);
        sExpand = jceInputStream.read(sExpand, 7, false);
        strPayItemInfo = jceInputStream.read(strPayItemInfo, 8, false);
        iPayType = jceInputStream.read(iPayType, 9, false);
        sSign = jceInputStream.read(sSign, 10, false);
        sMsg = jceInputStream.read(sMsg, 11, false);
        iPayTotal = jceInputStream.read(iPayTotal, 12, false);
        iItemGroup = jceInputStream.read(iItemGroup, 13, false);
    }
}
