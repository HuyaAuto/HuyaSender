package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class WSRegisterGroupReq extends JceStruct {
    public List<String> vGroupId = new ArrayList<>();
    public String sToken = "";

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(vGroupId, 0);
        jceOutputStream.write(sToken, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {

    }
}
