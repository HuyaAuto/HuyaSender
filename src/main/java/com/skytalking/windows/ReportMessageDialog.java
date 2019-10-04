package com.skytalking.windows;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBList;
import com.skytalking.huya.CommonLib;
import com.skytalking.huya.RMessage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class ReportMessageDialog {
    public JBList<RMessage> message_list;
    public JPanel content;
    private JScrollPane scroller;
    private DefaultListModel<RMessage> rMessageDefaultListModel = new DefaultListModel<>();
    private final JPopupMenu popupMenu;

    public ReportMessageDialog(JPopupMenu popupMenu) {
        this.popupMenu = popupMenu;
        message_list.setCellRenderer(rMessageListCellRenderer);
        message_list.setModel(rMessageDefaultListModel);
        message_list.addMouseListener(rMessageMouseAdapter);
        message_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        message_list.setComponentPopupMenu(popupMenu);
    }

    public void initReportMessage(List<RMessage> rMessages) {
        ApplicationManager.getApplication().invokeLater(() -> {
            rMessageDefaultListModel.clear();
            for (RMessage message : rMessages) {
                rMessageDefaultListModel.addElement(message);
            }
        });
    }

    private ListCellRenderer<RMessage> rMessageListCellRenderer = (jList, rMessage, i, selected, focus) -> {
        JBLabel jbLabel = new JBLabel(CommonLib.getRMessageContent(rMessage));
        jbLabel.setOpaque(selected);
        jbLabel.setBackground(jList.getSelectionBackground());
        return jbLabel;
    };

    private MouseListener rMessageMouseAdapter = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            int location = message_list.locationToIndex(e.getPoint());
            if (location < 0) return;
            message_list.setSelectedIndex(location);
            RMessage rMessage = rMessageDefaultListModel.getElementAt(location);
            if (rMessage != null) {
                popupMenu.putClientProperty("sender_uid", rMessage.tBase.lSenderUid);
                popupMenu.putClientProperty("content", rMessage.tBase.sContent);
            }
        }
    };
}
