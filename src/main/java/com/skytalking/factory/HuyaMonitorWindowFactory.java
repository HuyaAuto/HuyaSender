package com.skytalking.factory;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.skytalking.windows.HuyaMonitorWindow;
import org.jetbrains.annotations.NotNull;

public class HuyaMonitorWindowFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        DumbService.getInstance(project).runWhenSmart(() -> {
            System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
            ServiceManager.getService(project, HuyaMonitorWindow.class).initToolWindow(toolWindow);
//            ServiceManager.getService(project, PPP.class).init(toolWindow);
        });
    }
}
