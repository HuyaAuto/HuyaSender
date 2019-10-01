package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class SendItemNoticeWordBroadcastPacket extends JceStruct {
    public int iItemType = 0;
    public int iItemCount = 0;
    //    this.lSenderSid = 0;
//    this.lSenderUid = 0;
    public String sSenderNick = "";
    //    this.lPresenterUid =0;
    public String sPresenterNick = "";

    //    this.lNoticeChannelCount =0;
//    this.iItemCountByGroup =0;
//    this.iItemGroup =0;
//    this.iDisplayInfo =0;
//    this.iSuperPupleLevel =0;
//    this.iTemplateType =0;
//    this.sExpand ="";
//    this.bBusi =false;
//    this.iShowTime =0;
//    this.lPresenterYY =0;
//    this.lSid =0;
//    this.lSubSid =0;
//    this.lRoomId =0;
//    this.iNobleLevel =0;
//    this.tNobleLevel =new HUYA.NobleLevelInfo
    @Override

    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iItemType = jceInputStream.read(iItemType, 0, false);
        iItemCount = jceInputStream.read(iItemCount, 1, false);
        sSenderNick = jceInputStream.read(sSenderNick, 4, false);
        sPresenterNick = jceInputStream.read(sPresenterNick, 6, false);
    }
}
