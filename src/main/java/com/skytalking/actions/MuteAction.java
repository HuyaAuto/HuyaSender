package com.skytalking.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKey;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

public class MuteAction extends AnAction {
    enum MuteType {
        MUTE_30_SECOND, MUTE_1_DAY, MUTE_3_DAY, MUTE_7_DAY
    }


    public MuteAction() {
        getTemplatePresentation().setText("30分钟");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        e.getData(DataKey.create(""));
    }


}
