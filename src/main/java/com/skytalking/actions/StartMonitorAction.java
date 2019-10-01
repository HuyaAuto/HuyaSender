package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;
import com.skytalking.services.HuyaMonitorService;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

public class StartMonitorAction extends AnAction {
    public StartMonitorAction() {
        getTemplatePresentation().setText("开启弹幕");
        getTemplatePresentation().setIcon(PluginIcons.MONITOR);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        HuyaMonitorService.getInstance().startMonitor();
    }
}
