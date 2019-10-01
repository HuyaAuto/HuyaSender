package com.skytalking.services;

import com.intellij.openapi.components.ServiceManager;
import com.qq.jce.wup.UniPacket;

public interface HuyaMonitorService {
    static HuyaMonitorService getInstance() {
        return ServiceManager.getService(HuyaMonitorService.class);
    }

    void sendPacket(UniPacket uniPacket);

    boolean isLoginSuccessful();

    boolean isConnectSuccessful();

    long getPresenterId();

    long getLiveId();

    long getChannelId();

    long getSubChannelId();

    void showNotification(String notification);

    void showNotification(String title, String notification);

    void startMonitor();

    boolean isBroadcastEnabled();

    void setBroadcastEnabled(boolean broadcastEnabled);
}
