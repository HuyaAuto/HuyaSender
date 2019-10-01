package com.skytalking.model;

import com.intellij.util.messages.Topic;
import com.skytalking.huya.LiveLaunchRsp;

public interface WebSocketNotifier {
    Topic<WebSocketNotifier> WEB_SOCKET_TOPIC = Topic.create("web_socket notifier", WebSocketNotifier.class);

    void onDoLaunch(LiveLaunchRsp liveLaunchRsp);
}
