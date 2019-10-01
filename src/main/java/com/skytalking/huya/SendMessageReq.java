//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class SendMessageReq extends JceStruct implements Cloneable {
    static BulletFormat cache_tBulletFormat;
    static ContentFormat cache_tFormat;
    static UserId cache_tUserId;
    static ArrayList<UidNickName> cache_vAtSomeone;
    public int iShowMode = 0;
    public long lPid = 0L;
    public long lSid = 0L;
    public long lTid = 0L;
    public String sContent = "";
    public BulletFormat tBulletFormat = new BulletFormat();
    public ContentFormat tFormat = new ContentFormat();
    public UserId tUserId = null;
    public ArrayList<UidNickName> vAtSomeone = new ArrayList<>();

    public SendMessageReq() {
    }

    public SendMessageReq(UserId var1, long var2, long var4, String var6, int var7, ContentFormat var8, BulletFormat var9, ArrayList<UidNickName> var10, long var11) {
        this.tUserId = var1;
        this.lTid = var2;
        this.lSid = var4;
        this.sContent = var6;
        this.iShowMode = var7;
        this.tFormat = var8;
        this.tBulletFormat = var9;
        this.vAtSomeone = var10;
        this.lPid = var11;
    }

    public String className() {
        return "HUYA.SendMessageReq";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tUserId, "tUserId");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSid, "lSid");
        var3.display(this.sContent, "sContent");
        var3.display(this.iShowMode, "iShowMode");
        var3.display(this.tFormat, "tFormat");
        var3.display(this.tBulletFormat, "tBulletFormat");
        var3.display(this.vAtSomeone, "vAtSomeone");
        var3.display(this.lPid, "lPid");
    }

    public String fullClassName() {
        return "com.duowan.HUYA.SendMessageReq";
    }

    public void readFrom(JceInputStream var1) {
        if (cache_tUserId == null) {
            cache_tUserId = new UserId();
        }

        this.tUserId = (UserId) var1.read(cache_tUserId, 0, false);
        this.lTid = var1.read(this.lTid, 1, false);
        this.lSid = var1.read(this.lSid, 2, false);
        this.sContent = var1.readString(3, false);
        this.iShowMode = var1.read(this.iShowMode, 4, false);
        if (cache_tFormat == null) {
            cache_tFormat = new ContentFormat();
        }

        this.tFormat = (ContentFormat) var1.read(cache_tFormat, 5, false);
        if (cache_tBulletFormat == null) {
            cache_tBulletFormat = new BulletFormat();
        }

        this.tBulletFormat = (BulletFormat) var1.read(cache_tBulletFormat, 6, false);
        if (cache_vAtSomeone == null) {
            cache_vAtSomeone = new ArrayList();
            UidNickName var2 = new UidNickName();
            cache_vAtSomeone.add(var2);
        }

        this.vAtSomeone = (ArrayList) var1.read(cache_vAtSomeone, 7, false);
        this.lPid = var1.read(this.lPid, 8, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tUserId != null) {
            var1.write(this.tUserId, 0);
        }

        var1.write(this.lTid, 1);
        var1.write(this.lSid, 2);
        if (this.sContent != null) {
            var1.write(this.sContent, 3);
        }

        var1.write(this.iShowMode, 4);
        if (this.tFormat != null) {
            var1.write(this.tFormat, 5);
        }

        if (this.tBulletFormat != null) {
            var1.write(this.tBulletFormat, 6);
        }

        if (this.vAtSomeone != null) {
            var1.write(this.vAtSomeone, 7);
        }

        var1.write(this.lPid, 8);
    }
}
