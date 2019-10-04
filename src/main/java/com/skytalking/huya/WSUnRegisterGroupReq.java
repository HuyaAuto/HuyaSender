package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class WSUnRegisterGroupReq extends JceStruct {
    public List<String> vGroupId = new ArrayList<>();

    public WSUnRegisterGroupReq() {
        vGroupId.add("");
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(vGroupId, 0);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
