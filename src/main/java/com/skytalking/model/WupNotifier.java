package com.skytalking.model;

import com.intellij.util.messages.Topic;
import com.qq.taf.jce.JceStruct;

public interface WupNotifier {
    Topic<WupNotifier> WUP_NOTIFIER = Topic.create("wup notifier", WupNotifier.class);

    void onReceiveWupRsp(JceStruct response);
}
