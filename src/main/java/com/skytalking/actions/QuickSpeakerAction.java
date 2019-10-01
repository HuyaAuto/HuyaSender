package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;
import com.skytalking.huya.WupService;
import com.skytalking.services.HuyaMonitorService;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSpeakerAction extends AnAction implements DumbAware {
    public List<String> contents = new ArrayList<>();

    public QuickSpeakerAction(Icon icon, String... content) {
        getTemplatePresentation().setIcon(icon);
        getTemplatePresentation().setText(Arrays.toString(content));
        contents.addAll(Arrays.asList(content));
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        HuyaMonitorService monitorService = HuyaMonitorService.getInstance();
        for (String content : contents) {
            WupService.getInstance().sendMessage(monitorService.getChannelId(), monitorService.getSubChannelId(), monitorService.getPresenterId(), content);
        }
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabled(HuyaMonitorService.getInstance().isLoginSuccessful());
    }
}
