package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class GetRMessageListReq extends JceStruct {
    public UserId tId = new UserId();
    public RMessageScene tScene = new RMessageScene();

    @Override

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(tId, 0);
        jceOutputStream.write(tScene, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        tId = (UserId) jceInputStream.read(tId, 0, false);
        tScene = (RMessageScene) jceInputStream.read(tScene, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(tId, "tId");
        jceDisplayer.display(tScene, "tScene");
    }
}
