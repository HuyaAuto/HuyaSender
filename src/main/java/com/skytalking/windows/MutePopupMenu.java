package com.skytalking.windows;

import com.skytalking.huya.WupService;
import com.skytalking.services.HuyaMonitorService;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MutePopupMenu {
    private JMenuItem createMenuAction(String text, int type, int duration) {
        JMenuItem jMenuItem = new JMenuItem(text);
        MuteRoomUserAction muteRoomUserAction = new MuteRoomUserAction(text, type, duration);
        jMenuItem.setAction(muteRoomUserAction);
        return jMenuItem;
    }

    public JPopupMenu createPopupMenu() {
        JPopupMenu rootPopupMenu = new JPopupMenu();
        rootPopupMenu.add(createMenuAction("禁言30分钟", MuteRoomUserAction.TYPE_MUTE, 60 * 30));
        rootPopupMenu.add(createMenuAction("禁言1天", MuteRoomUserAction.TYPE_MUTE, 60 * 60 * 24));
        rootPopupMenu.add(createMenuAction("禁言3天", MuteRoomUserAction.TYPE_MUTE, 60 * 60 * 24 * 3));
        rootPopupMenu.add(createMenuAction("禁言7天", MuteRoomUserAction.TYPE_MUTE, 60 * 60 * 24 * 7));
        JMenu blackPopupMenu = new JMenu("拉黑");
        rootPopupMenu.add(blackPopupMenu);
        blackPopupMenu.add(createMenuAction("拉黑30分钟", MuteRoomUserAction.TYPE_BLOCK, 60 * 30));
        blackPopupMenu.add(createMenuAction("拉黑1天", MuteRoomUserAction.TYPE_BLOCK, 60 * 60 * 24));
        blackPopupMenu.add(createMenuAction("拉黑3天", MuteRoomUserAction.TYPE_BLOCK, 60 * 60 * 24 * 3));
        blackPopupMenu.add(createMenuAction("拉黑7天", MuteRoomUserAction.TYPE_BLOCK, 60 * 60 * 24 * 7));
        return rootPopupMenu;
    }

    private static class MuteRoomUserAction extends AbstractAction {
        public static final int TYPE_MUTE = 0;
        public static final int TYPE_BLOCK = 1;
        private int type;
        private int duration;

        public MuteRoomUserAction(String text, int type, int duration) {
            putValue(NAME, text);
            this.type = type;
            this.duration = duration;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//            JPopupMenu componentPopupMenu = barrage_list.getComponentPopupMenu();
//            String content = (String) componentPopupMenu.getClientProperty("content");
//            Long senderUid = (Long) componentPopupMenu.getClientProperty("sender_uid");
//            if (content != null && senderUid != null) {
//                HuyaMonitorService monitorService = HuyaMonitorService.getInstance();
//                WupService.getInstance().muteRoomUser(content, duration, monitorService.getChannelId(), senderUid, monitorService.getSubChannelId(), type, 1);
//            }
        }
    }
}
