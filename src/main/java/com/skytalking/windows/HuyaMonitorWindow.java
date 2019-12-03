package com.skytalking.windows;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.components.*;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.skytalking.actions.*;
import com.skytalking.huya.*;
import com.skytalking.services.HuyaMonitorService;
import icons.PluginIcons;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.swing.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class HuyaMonitorWindow implements Disposable {
    private final Project project;
    final StartMonitorAction startMonitorAction;
    final ScanLoginAction scanLoginAction;
    final BroadcastAction broadcastAction;
    final ViewReportAction viewReportAction;
    final QuickSpeakerAction sendFlowerAction;
    final QuickSpeakerAction sendByeByeAction;
    final QuickSpeakerAction sendGongGaoAction;
    final TextLabelAction attendedCountAction;
    final TextLabelAction nobleCountAction;

    private JPanel content;
    private JBPanel JBPanel1;
    private JBScrollPane JBScrollPane1;
    private JBList<JceStruct> barrage_list;
    private JBTextField text_input;
    private JButton text_send;
    private final DefaultListModel<JceStruct> defaultListModel;
    private boolean mScrollerLocked = false;
    private int maxCount = 500;
    private int tempMaxCount = 40;
    private ActionToolbar actionToolbar;
    private PreviewComponent windowPanel;
    private List<JceStruct> tempList = new ArrayList<>();
    private ToolWindow toolWindow;

    public HuyaMonitorWindow(Project project) {
        this.project = project;
        startMonitorAction = new StartMonitorAction();
        scanLoginAction = new ScanLoginAction();
        broadcastAction = new BroadcastAction();
        sendFlowerAction = new QuickSpeakerAction(PluginIcons.LOVE, "/{sh/{sh/{sh/{sh/{sh");
        sendGongGaoAction = new QuickSpeakerAction(PluginIcons.GONG_GAO, "弹幕要有礼貌哦/{dx/{dx/{dx");
        sendByeByeAction = new QuickSpeakerAction(PluginIcons.BYE_BYE, "/{88/{88/{88/{88/{88", "下播啦,明天见/{dx/{dx/{dx");
        attendedCountAction = new TextLabelAction();
        nobleCountAction = new TextLabelAction();
        defaultListModel = new DefaultListModel<>();
        text_send.addActionListener(this::sendMessage);
        barrage_list.setModel(defaultListModel);
        barrage_list.setComponentPopupMenu(createPopupMenu());
        viewReportAction = new ViewReportAction(barrage_list.getComponentPopupMenu());
        barrage_list.addMouseListener(mouseAdapter);
        barrage_list.setCellRenderer(listCellRenderer);
        text_input.addActionListener(this::sendMessage);
        initEventBus();
    }

    public void sendMessage(ActionEvent actionEvent) {
        WupService.getInstance().sendMessage(HuyaMonitorService.getInstance().getChannelId(), HuyaMonitorService.getInstance().getSubChannelId(), HuyaMonitorService.getInstance().getPresenterId(), text_input.getText());
    }

    private MouseListener mouseAdapter = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            int location = barrage_list.locationToIndex(e.getPoint());
            if (location < 0) return;
            barrage_list.setSelectedIndex(location);
            JceStruct jceStruct = defaultListModel.getElementAt(location);
            if (jceStruct instanceof MessageNotice) {
                JPopupMenu componentPopupMenu = barrage_list.getComponentPopupMenu();
                MessageNotice notice = (MessageNotice) jceStruct;
                componentPopupMenu.putClientProperty("content", notice.sContent);
                componentPopupMenu.putClientProperty("sender_uid", notice.tUserInfo.lUid);
                String sContent = ((MessageNotice) jceStruct).sContent;
                try {
                    System.out.println(new String(sContent.getBytes("UTF-8"), Charset.defaultCharset()));
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            mScrollerLocked = true;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            mScrollerLocked = false;
        }
    };

    private ListCellRenderer<JceStruct> listCellRenderer = (jList, jceStruct, i, selected, focus) -> {
        JBLabel component = null;
        String messageContent = CommonLib.getMessageContent(jceStruct);
        if (messageContent != null) {
            component = new JBLabel(messageContent);
        }
        if (component == null) {
            component = new JBLabel(i + "------------------------");
        }
        component.setOpaque(selected);
        component.setBackground(jList.getSelectionBackground());
        return component;
    };

    private JMenuItem createMenuAction(String text, int type, int duration) {
        JMenuItem jMenuItem = new JMenuItem(text);
        MuteRoomUserAction muteRoomUserAction = new MuteRoomUserAction(text, type, duration);
        jMenuItem.setAction(muteRoomUserAction);
        return jMenuItem;
    }

    @Override
    public void dispose() {

    }

    private class MuteRoomUserAction extends AbstractAction {
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
            JPopupMenu componentPopupMenu = barrage_list.getComponentPopupMenu();
            String content = (String) componentPopupMenu.getClientProperty("content");
            Long senderUid = (Long) componentPopupMenu.getClientProperty("sender_uid");
            if (content != null && senderUid != null) {
                HuyaMonitorService monitorService = HuyaMonitorService.getInstance();
                WupService.getInstance().muteRoomUser(content, duration, monitorService.getPresenterId(), senderUid, monitorService.getSubChannelId(), type, 1);
            }
        }
    }

    private JPopupMenu createPopupMenu() {
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

    private void initEventBus() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        CommonLib.getInstance().init();
    }

    @Subscribe
    public void onPushMessage(MessageNotice messageNotice) {
        notifyMessage(messageNotice);
    }

    @Subscribe
    public void onAuditorRoleChangeNotice(AuditorRoleChangeNotice auditorRoleChangeNotice) {
        notifyMessage(auditorRoleChangeNotice);
    }

    @Subscribe
    public void onAttendeeCountNotice(AttendeeCountNotice attendeeCountNotice) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
            @Override
            public void run() {
                attendedCountAction.setText("人气:" + attendeeCountNotice.iAttendeeCount);
            }
        });
    }

    @Subscribe
    public void onVipBarListNotice(VipBarListRsp vipBarListRsp) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
            @Override
            public void run() {
                nobleCountAction.setText("贵宾:" + vipBarListRsp.iTotal);
            }
        });
    }

    @Subscribe
    public void onSendSubItemBroadcastPacketNotice(SendItemSubBroadcastPacket broadcastPacket) {
        if (HuyaMonitorService.getInstance().isBroadcastEnabled()) {
            notifyMessage(broadcastPacket);
        }
    }

    @Subscribe
    public void onSendItemNoticeWordBroadcastPacketNotice(SendItemNoticeWordBroadcastPacket broadcastPacket) {
        if (HuyaMonitorService.getInstance().isBroadcastEnabled()) {
            notifyMessage(broadcastPacket);
        }
    }

    @Subscribe
    public void onGetRMessageListRsp(GetRMessageListRsp getRMessageListRsp) {
        ApplicationManager.getApplication().invokeLater(() -> viewReportAction.updateReportMessageList(getRMessageListRsp.vReportedMessages));
    }

    @Subscribe
    public void onPresenterEndLiveNotice(EndLiveNotice endLiveNotice) {
        ApplicationManager.getApplication().invokeLater(() -> attendedCountAction.setText(null));
    }

    private void notifyMessage(JceStruct jceStruct) {
        Application application = ApplicationManager.getApplication();
        application.invokeLater(() -> {
            if (application.isActive() && toolWindow.isVisible() && toolWindow.isActive()) {
                if (tempList != null) {
                    defaultListModel.addAll(tempList);
                    tempList.clear();
                }
                if (defaultListModel.size() > maxCount) {
                    int removeCount = defaultListModel.size() - maxCount;
                    for (int i = 0; i < removeCount; i++) {
                        defaultListModel.remove(0);
                    }
                }
                defaultListModel.addElement(jceStruct);
                if (!mScrollerLocked) {
                    barrage_list.ensureIndexIsVisible(defaultListModel.getSize() - 1);
                }
            } else {
                tempList.add(jceStruct);
            }
        });
    }

    public void initToolWindow(ToolWindow toolWindow) {
        this.toolWindow = toolWindow;
        ContentManager contentManager = toolWindow.getContentManager();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(null, null, true);
        content.setCloseable(false);
        DefaultActionGroup actionGroup = new DefaultActionGroup();
        actionGroup.add(startMonitorAction);
        actionGroup.add(scanLoginAction);
        actionGroup.add(broadcastAction);
        actionGroup.add(viewReportAction);
        actionGroup.addSeparator();
        actionGroup.add(sendFlowerAction);
        actionGroup.add(sendGongGaoAction);
        actionGroup.add(sendByeByeAction);
        actionGroup.addSeparator();
        actionGroup.add(nobleCountAction);
        actionGroup.addSeparator();
        actionGroup.add(attendedCountAction);
        actionToolbar = ActionManager.getInstance().createActionToolbar("HuyaPreviewViewToolbar", actionGroup, true);

        actionToolbar.setShowSeparatorTitles(true);
        windowPanel = new PreviewComponent(this);
        content.setComponent(windowPanel);
        windowPanel.setToolbar(actionToolbar.getComponent());
        windowPanel.setContent(this.content);
        contentManager.addContent(content);
        contentManager.setSelectedContent(content);
        toolWindow.getComponent().addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("----------------------------------------");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        });
//        ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    notifyMessage(new MockJce("item:" + (i++)));
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                    }
//                }
//            }
//        });
    }

    private int i = 0;

    public static class MockJce extends JceStruct {
        String text;

        public MockJce(String text) {
            this.text = text;
        }

        @Override
        public void writeTo(JceOutputStream jceOutputStream) {

        }

        @Override
        public void readFrom(JceInputStream jceInputStream) {

        }

        @Override
        public String toString() {
            return text;
        }
    }
}