//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;


import com.qq.jce.wup.UniPacket;
import com.qq.taf.jce.JceStruct;
import com.skytalking.services.HuyaMonitorService;
import okhttp3.*;
import okhttp3.Request.Builder;
import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class WupHelper {

    public WupHelper() {
    }


    public static <Rsp extends JceStruct> void send(JceStruct var0, String var1, String var2, Rsp var3, boolean webSocket) throws IllegalArgumentException {
//        send(CommonLib.okHttp(), var0, var1, var2, var3, webSocket);
        send(var1, var2, var0);
    }

    public static void send(String func, String servant, JceStruct jceStruct) {
        HuyaMonitorService.getInstance().sendPacket(buildUniPacket(func, servant, jceStruct));
    }

    private static AtomicInteger reqId = new AtomicInteger(0);

    public static UniPacket buildUniPacket(String func, String servant, JceStruct jceStruct) {
        UniPacket uniPacket = new UniPacket();
        uniPacket.useVersion3();
        uniPacket.setFuncName(func);
        uniPacket.setServantName(servant);
        uniPacket.setEncodeName("UTF-8");
        uniPacket.setRequestId(reqId.incrementAndGet());
        uniPacket.put("tReq", jceStruct);
        return uniPacket;
    }

    public static <Rsp extends JceStruct> void send(OkHttpClient var0, final JceStruct var1, final String var2, final String var3, final Rsp var4, final boolean webSocket) throws IllegalArgumentException {

        if (var0 == null) {
            throw new IllegalArgumentException("okHttpClient cannot be null.");
        } else if (var1 == null) {
            throw new IllegalArgumentException("req cannot be null.");
        } else {
            UniPacket var6 = new UniPacket();
            var6.useVersion3();
            var6.setFuncName(var2);
            var6.setServantName(var3);
            var6.put("tReq", var1);
            byte[] var7 = var6.encode();
            if (webSocket) {
                HuyaMonitorService.getInstance().sendPacket(var6);
                return;
            }
            RequestBody var8 = RequestBody.create(MediaType.parse("*/*"), var7);
            var0.newCall((new Builder()).url(wupUrl()).post(var8).build()).enqueue(new Callback() {
                public void onFailure(Call var1x, IOException var2x) {
                    StringBuilder var3x = new StringBuilder();
                    var1.display(var3x, 0);
                    System.out.println("NetworkError:" + var4);
//                    EventBus.getDefault().postSticky(new NetworkError("", var4));
                }

                public void onResponse(Call var1x, Response var2x) throws IOException {
                    try {
                        if (var4 != null) {
                            byte[] bytes = var2x.body().bytes();
                            UniPacket var4x = new UniPacket();
                            var4x.setEncodeName("UTF-8");
                            var4x.decode(bytes);
                            JceStruct jceStruct = var4x.getByClass("tRsp", var4);
                            EventBus.getDefault().post(jceStruct);
                        }
                    } catch (Exception var3x) {
                        StringBuilder var6 = new StringBuilder();
                        var1.display(var6, 0);
                        System.out.println(String.format("onResponse exception, req : %s, funcName : %s, servantName : %s, exception : %s ", new Object[]{var6.toString(), var2, var3, var3x.getMessage()}));
                    }
                }
            });
        }
    }

    public static String wupUrl() {
        return "http://wup.huya.com";
    }
}
