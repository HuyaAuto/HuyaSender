package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;
import com.skytalking.popup.ScanCodeDialogWrapper;
import com.skytalking.services.HuyaMonitorService;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

public class ScanLoginAction extends AnAction {

    public ScanLoginAction() {
        getTemplatePresentation().setText("扫码登录");
        getTemplatePresentation().setIcon(PluginIcons.SCAN);

    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        boolean showAndGet = new ScanCodeDialogWrapper().showAndGet();
        if (showAndGet) {
            HuyaMonitorService.getInstance().showNotification("用户登录", "扫码登录成功,正在启动...");
            HuyaMonitorService.getInstance().startMonitor();
        }
    }
}
