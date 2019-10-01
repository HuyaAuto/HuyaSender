//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.qq.taf.jce.*;

import java.util.ArrayList;

public final class MessageNotice extends JceStruct implements Cloneable {
    static BulletFormat cache_tBulletFormat;
    static ContentFormat cache_tFormat;
    static SenderInfo cache_tUserInfo;
    static ArrayList<UidNickName> cache_vAtSomeone;
    static ArrayList<DecorationInfo> cache_vDecorationPrefix;
    static ArrayList<DecorationInfo> cache_vDecorationSuffix;
    public int iShowMode = 0;
    public int iTermType = 0;
    public long lPid = 0L;
    public long lSid = 0L;
    public long lTid = 0L;
    public String sContent = "";
    public BulletFormat tBulletFormat = null;
    public ContentFormat tFormat = null;
    public SenderInfo tUserInfo = null;
    public ArrayList<UidNickName> vAtSomeone = null;
    public ArrayList<DecorationInfo> vDecorationPrefix = null;
    public ArrayList<DecorationInfo> vDecorationSuffix = null;
    public long time;

    public MessageNotice() {
    }

    public MessageNotice(SenderInfo var1, long var2, long var4, String var6, int var7, ContentFormat var8, BulletFormat var9, int var10, ArrayList<DecorationInfo> var11, ArrayList<DecorationInfo> var12, ArrayList<UidNickName> var13, long var14) {
        this.tUserInfo = var1;
        this.lTid = var2;
        this.lSid = var4;
        this.sContent = var6;
        this.iShowMode = var7;
        this.tFormat = var8;
        this.tBulletFormat = var9;
        this.iTermType = var10;
        this.vDecorationPrefix = var11;
        this.vDecorationSuffix = var12;
        this.vAtSomeone = var13;
        this.lPid = var14;
    }

    public String className() {
        return "HUYA.MessageNotice";
    }

    public void display(StringBuilder var1, int var2) {
        JceDisplayer var3 = new JceDisplayer(var1, var2);
        var3.display(this.tUserInfo, "tUserInfo");
        var3.display(this.lTid, "lTid");
        var3.display(this.lSid, "lSid");
        var3.display(this.sContent, "sContent");
        var3.display(this.iShowMode, "iShowMode");
        var3.display(this.tFormat, "tFormat");
        var3.display(this.tBulletFormat, "tBulletFormat");
        var3.display(this.iTermType, "iTermType");
        var3.display(this.vDecorationPrefix, "vDecorationPrefix");
        var3.display(this.vDecorationSuffix, "vDecorationSuffix");
        var3.display(this.vAtSomeone, "vAtSomeone");
        var3.display(this.lPid, "lPid");
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 != null && this.getClass() == var1.getClass()) {
                MessageNotice var2 = (MessageNotice) var1;
                if (JceUtil.equals(this.tUserInfo, var2.tUserInfo) && JceUtil.equals(this.lTid, var2.lTid) && JceUtil.equals(this.lSid, var2.lSid) && JceUtil.equals(this.sContent, var2.sContent) && JceUtil.equals(this.iShowMode, var2.iShowMode) && JceUtil.equals(this.tFormat, var2.tFormat) && JceUtil.equals(this.tBulletFormat, var2.tBulletFormat) && JceUtil.equals(this.iTermType, var2.iTermType) && JceUtil.equals(this.vDecorationPrefix, var2.vDecorationPrefix) && JceUtil.equals(this.vDecorationSuffix, var2.vDecorationSuffix) && JceUtil.equals(this.vAtSomeone, var2.vAtSomeone) && JceUtil.equals(this.lPid, var2.lPid)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public String fullClassName() {
        return "com.duowan.HUYA.MessageNotice";
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
        if (cache_tUserInfo == null) {
            cache_tUserInfo = new SenderInfo();
        }

        this.tUserInfo = (SenderInfo) var1.read(cache_tUserInfo, 0, false);
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
        this.iTermType = var1.read(this.iTermType, 7, false);
        DecorationInfo var2;
        if (cache_vDecorationPrefix == null) {
            cache_vDecorationPrefix = new ArrayList();
            var2 = new DecorationInfo();
            cache_vDecorationPrefix.add(var2);
        }

        this.vDecorationPrefix = (ArrayList) var1.read(cache_vDecorationPrefix, 8, false);
        if (cache_vDecorationSuffix == null) {
            cache_vDecorationSuffix = new ArrayList();
            var2 = new DecorationInfo();
            cache_vDecorationSuffix.add(var2);
        }

        this.vDecorationSuffix = (ArrayList) var1.read(cache_vDecorationSuffix, 9, false);
        if (cache_vAtSomeone == null) {
            cache_vAtSomeone = new ArrayList();
            UidNickName var3 = new UidNickName();
            cache_vAtSomeone.add(var3);
        }

        this.vAtSomeone = (ArrayList) var1.read(cache_vAtSomeone, 10, false);
        this.lPid = var1.read(this.lPid, 11, false);
    }

    public void writeTo(JceOutputStream var1) {
        if (this.tUserInfo != null) {
            var1.write(this.tUserInfo, 0);
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

        var1.write(this.iTermType, 7);
        if (this.vDecorationPrefix != null) {
            var1.write(this.vDecorationPrefix, 8);
        }

        if (this.vDecorationSuffix != null) {
            var1.write(this.vDecorationSuffix, 9);
        }

        if (this.vAtSomeone != null) {
            var1.write(this.vAtSomeone, 10);
        }

        var1.write(this.lPid, 11);
    }
}
