//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

public final class AttendeeCountNotice extends JceStruct implements Cloneable {
    public int iAttendeeCount = 0;

    public AttendeeCountNotice() {
    }

    public AttendeeCountNotice(int var1) {
        this.iAttendeeCount = var1;
    }

    public String className() {
        return "HUYA.AttendeeCountNotice";
    }

    public void display(StringBuilder var1, int var2) {
        (new JceDisplayer(var1, var2)).display(this.iAttendeeCount, "iAttendeeCount");
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            AttendeeCountNotice var2 = (AttendeeCountNotice)var1;
            return JceUtil.equals(this.iAttendeeCount, var2.iAttendeeCount);
        } else {
            return false;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.AttendeeCountNotice";
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
        this.iAttendeeCount = var1.read(this.iAttendeeCount, 0, false);
    }

    public void writeTo(JceOutputStream var1) {
        var1.write(this.iAttendeeCount, 0);
    }
}
