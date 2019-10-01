package com.skytalking.huya;

import com.intellij.sisyphus.api.Issues;
import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class WSRegisterGroupRsp extends JceStruct {
    public int iResCode = 0;
    public List<String> vSupportP2PGroupId = new ArrayList<>();

    public WSRegisterGroupRsp() {
        vSupportP2PGroupId.add("");
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {

    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        iResCode = jceInputStream.read(iResCode, 0, false);
        vSupportP2PGroupId = (List<String>) jceInputStream.read(vSupportP2PGroupId, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(iResCode, "iResCode");
        for (String s : vSupportP2PGroupId) {
            jceDisplayer.display(s, "vSupportP2PGroupId");
        }
    }
}
