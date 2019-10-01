package com.skytalking.model;

import com.intellij.util.messages.Topic;
import com.qq.taf.jce.JceStruct;

public interface BarrageNotifier {
    Topic<BarrageNotifier> CHANGE_ACTION_TOPIC = Topic.create("barrage notifier", BarrageNotifier.class);
    void onWebsocketConnected();

    void onReceivePushMessage(JceStruct jceStruct);
}
