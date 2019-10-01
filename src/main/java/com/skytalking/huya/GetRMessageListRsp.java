package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class GetRMessageListRsp extends JceStruct {
    public List<RMessage> vReportedMessages = new ArrayList<>();

    public GetRMessageListRsp() {
        vReportedMessages.add(new RMessage());
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(vReportedMessages, 0);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        vReportedMessages = (List<RMessage>) jceInputStream.read(vReportedMessages, 0, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(vReportedMessages, "vReportedMessages");
    }
}
