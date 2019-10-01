//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.skytalking.huya;

import com.intellij.ide.util.PropertiesComponent;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OkHttpService {
    private static OkHttpService ourInstance = new OkHttpService();
    private OkHttpClient mOkHttpClient;
    private Map<String, List<Cookie>> cookieMap = new HashMap<>();

    private OkHttpService() {
    }

    public static OkHttpService getInstance() {
        return ourInstance;
    }

    public OkHttpClient get() {
        if (mOkHttpClient == null) {
            init();
        }
        return this.mOkHttpClient;
    }

    public void setCookie(String host, Cookie cookie) {
        cookieMap.computeIfAbsent(host, k -> new ArrayList<>()).add(cookie);
    }

    public void init() {
        if (this.mOkHttpClient == null) {
            String uid = PropertiesComponent.getInstance().getValue("uid");
            String biztoken = PropertiesComponent.getInstance().getValue("biztoken");
            if (null != uid && null != biztoken) {
                Cookie udb_uid = new Cookie.Builder().name("udb_uid").value(uid).domain("www.huya.com").build();
                Cookie udb_biztoken = new Cookie.Builder().name("udb_biztoken").value(biztoken).domain("www.huya.com").build();
                ArrayList<Cookie> cookies = new ArrayList<>();
                cookies.add(udb_uid);
                cookies.add(udb_biztoken);
                cookieMap.put("www.huya.com", cookies);
            }
            this.mOkHttpClient = (new Builder())
                    .connectTimeout(10L, TimeUnit.SECONDS)
                    .writeTimeout(10L, TimeUnit.SECONDS)
                    .readTimeout(10L, TimeUnit.SECONDS)
                    .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE))
                    .cookieJar(CookieJar.NO_COOKIES)
                    .cookieJar(new CookieJar() {
                        @Override
                        public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                            List<Cookie> cookies = cookieMap.get(httpUrl.host());
                            if (cookies != null) {
                                cookies.addAll(list);
                            } else {
                                cookieMap.put(httpUrl.host(), list);
                            }
                        }

                        @NotNull
                        @Override
                        public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                            List<Cookie> cookies = cookieMap.get(httpUrl.host());
                            if (cookies == null) {
                                cookies = new ArrayList<>();
                            }
                            return cookies;
                        }
                    })
                    .build();
        }
    }

    public void clearCookie() {
        cookieMap.clear();
    }
}
