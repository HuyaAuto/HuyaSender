package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.openapi.project.DumbAware;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.net.URL;

public class TextLabelAction extends AnAction implements CustomComponentAction, DumbAware {
    private String text;
    private JLabel textLabel;

    public TextLabelAction() {
        textLabel = new JLabel();
    }

    public void setText(String text) {
        getTemplatePresentation().setText(text);
        this.text = text;
        textLabel.setText(text);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
    }

    @NotNull
    @Override
    public JComponent createCustomComponent(@NotNull Presentation presentation, @NotNull String place) {
        return textLabel;
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabledAndVisible(text != null && !"".equals(text));
    }
}
