package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.skytalking.huya.RMessage;
import com.skytalking.huya.WupService;
import com.skytalking.services.HuyaMonitorService;
import com.skytalking.windows.ReportMessageDialog;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ViewReportAction extends DumbAwareAction {
    private ReportMessageDialog reportMessageDialog;
    private final ComponentPopupBuilder componentPopupBuilder;
    private JBPopup jbPopup;

    public ViewReportAction(JPopupMenu popupMenu) {
        getTemplatePresentation().setText("处理被举报弹幕");
        getTemplatePresentation().setIcon(PluginIcons.REPORT);
        reportMessageDialog = new ReportMessageDialog(popupMenu);
        componentPopupBuilder = JBPopupFactory.getInstance().createComponentPopupBuilder(reportMessageDialog.content, null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        if (jbPopup != null && jbPopup.isVisible()) {
            jbPopup.dispose();
        } else {
            HuyaMonitorService monitorService = HuyaMonitorService.getInstance();
            WupService.getInstance().getRMessageList(monitorService.getLiveId(), monitorService.getPresenterId(), monitorService.getChannelId(), monitorService.getSubChannelId());
            jbPopup = componentPopupBuilder.createPopup();
            jbPopup.showUnderneathOf(e.getInputEvent().getComponent());
        }
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabled(HuyaMonitorService.getInstance().isLoginSuccessful());
    }

    public void updateReportMessageList(List<RMessage> list) {
        reportMessageDialog.initReportMessage(list);
    }
}