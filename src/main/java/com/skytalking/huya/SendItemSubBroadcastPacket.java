package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class SendItemSubBroadcastPacket extends JceStruct {
    public int iItemType = 0;
    public String strPayId = "";
    public int iItemCount = 0;
    public long lPresenterUid = 0;
    public long lSenderUid = 0;
    public String sPresenterNick = "";
    public String sSenderNick = "";
    public String sSendContent = "";
    public int iItemCountByGroup = 0;
    public int iItemGroup = 0;
    public int iSuperPupleLevel = 0;
    public int iComboScore = 0;
    public int iDisplayInfo = 0;
    public int iEffectType = 0;
    public String iSenderIcon = "";
    public String iPresenterIcon = "";
    public int iTemplateType = 0;
    public String sExpand = "";
    public boolean bBusi = false;
    public int iColorEffectType = 0;
    public String sPropsName = "";
    public int iAccpet = 0;
    public int iEventType = 0;
    //    this.userInfo =new HUYA.UserIdentityInfo;
    public long lRoomId = 0;
    public long lHomeOwnerUid = 0;
    //    streamerInfo =new HUYA.StreamerNode;
    public int iPayType = -1;
    public int iNobleLevel = 0;
    //    public tNobleLevel =new HUYA.NobleLevelInfo;
//    this.tEffectInfo =new HUYA.ItemEffectInfo;
//    this.vExUid =new Taf.Vector(new Taf.INT64);
    public int iComboStatus = 0;
    public int iPidColorType = 0;

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iItemType = jceInputStream.read(iItemType, 0, false);
        iItemCount = jceInputStream.read(iItemCount, 2, false);
        sSenderNick = jceInputStream.read(sSenderNick, 6, false);
    }
}
