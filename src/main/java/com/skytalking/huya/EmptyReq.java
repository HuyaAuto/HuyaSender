//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public class EmptyReq extends JceStruct implements Cloneable {

    public EmptyReq() {
    }

    public void display(StringBuilder var1, int var2) {
    }

    public boolean equals(Object var1) {
        return var1 instanceof EmptyReq;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception var2) {
            var2.printStackTrace();
            return 0;
        }
    }

    public void readFrom(JceInputStream var1) {
    }

    public void writeTo(JceOutputStream var1) {
    }
}
