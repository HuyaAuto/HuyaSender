//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

public final class EGender {
    public static final EGender FEMALE;
    public static final EGender MALE;
    public static final int _FEMALE = 1;
    public static final int _MALE = 0;
    private static EGender[] __values;
    private String __T = new String();
    private int __value;

    static {
        __values = new EGender[2];
        MALE = new EGender(0, 0, "MALE");
        FEMALE = new EGender(1, 1, "FEMALE");
    }

    private EGender(int var1, int var2, String var3) {
        this.__T = var3;
        this.__value = var2;
        __values[var1] = this;
    }

    public static EGender convert(int var0) {
        for (int var1 = 0; var1 < __values.length; ++var1) {
            if (__values[var1].value() == var0) {
                return __values[var1];
            }
        }
        return null;
    }

    public static EGender convert(String var0) {
        for (int var1 = 0; var1 < __values.length; ++var1) {
            if (__values[var1].toString().equals(var0)) {
                return __values[var1];
            }
        }
        return null;
    }

    public String toString() {
        return this.__T;
    }

    public int value() {
        return this.__value;
    }
}
