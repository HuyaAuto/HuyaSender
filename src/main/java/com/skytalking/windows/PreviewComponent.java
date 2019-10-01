package com.skytalking.windows;

import com.intellij.openapi.ui.SimpleToolWindowPanel;

public class PreviewComponent extends SimpleToolWindowPanel {
    private final HuyaMonitorWindow myView;

    PreviewComponent(HuyaMonitorWindow view) {
        super(true, true);
        this.myView = view;
    }
}
