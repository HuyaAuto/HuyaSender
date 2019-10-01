package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.project.DumbAwareAction;
import com.skytalking.services.HuyaMonitorService;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

public class BroadcastAction extends DumbAwareAction {
    public BroadcastAction() {
        updateState(getTemplatePresentation());
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        HuyaMonitorService.getInstance().setBroadcastEnabled(!HuyaMonitorService.getInstance().isBroadcastEnabled());
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        updateState(e.getPresentation());
    }

    private void updateState(Presentation presentation) {
        HuyaMonitorService huyaMonitorService = HuyaMonitorService.getInstance();
        boolean broadcastEnabled = huyaMonitorService.isBroadcastEnabled();
        presentation.setText(broadcastEnabled ? "点击关闭通知弹幕" : "点击开启通知弹幕");
        presentation.setIcon(broadcastEnabled ? PluginIcons.OPEN : PluginIcons.CLOSE);
        presentation.setEnabled(huyaMonitorService.isConnectSuccessful());
    }
}
