package com.skytalking.huya;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

import java.util.ArrayList;
import java.util.List;

public class FaithInfo extends JceStruct {
    private static FaithPresenter faithPresenter = new FaithPresenter();
    public String sFaithName = "";
    public List<FaithPresenter> vPresenter = new ArrayList<>();

    public FaithInfo() {
        vPresenter.add(faithPresenter);
    }

    @Override
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(sFaithName, 0);
        jceOutputStream.write(vPresenter, 1);
    }

    @Override
    public void readFrom(JceInputStream jceInputStream) {
        sFaithName = jceInputStream.read(sFaithName, 0, false);
        vPresenter = jceInputStream.readArray(vPresenter, 1, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, level);
        jceDisplayer.display(sFaithName, "sFaithName");
        jceDisplayer.display(vPresenter, "vPresenter");
    }
}
