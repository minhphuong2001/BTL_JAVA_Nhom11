/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ScreenSwitchController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import models.CategoriesModel;

/**
 *
 * @author Minh Phuong Do
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public Main() {
        initComponents();
        ScreenSwitchController ssController = new ScreenSwitchController(containerPanel);
        ssController.setDashboard(home_pagePanel, homepageLabel);

        List<CategoriesModel> listCate = new ArrayList<>();
        listCate.add(new CategoriesModel("HomePage", home_pagePanel, homepageLabel));
        listCate.add(new CategoriesModel("ManagementAccount", management_accPanel, accLabel));
        listCate.add(new CategoriesModel("ManagementEmployee", management_employeePanel, employeeLabel));
        listCate.add(new CategoriesModel("ManagementCustomer", management_customerPanel, customerLabel));
        listCate.add(new CategoriesModel("ManagementProduct", management_productPanel, receptLabel));
        listCate.add(new CategoriesModel("ManagementRecept", management_receptPanel, receptLabel));
        listCate.add(new CategoriesModel("ManagementStatistical", management_statisticalPanel, statistifyLabel));
        ssController.setEvent(listCate);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        home_pagePanel = new javax.swing.JPanel();
        homepageLabel = new javax.swing.JLabel();
        management_customerPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        management_productPanel = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        management_receptPanel = new javax.swing.JPanel();
        receptLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        management_statisticalPanel = new javax.swing.JPanel();
        statistifyLabel = new javax.swing.JLabel();
        management_accPanel = new javax.swing.JPanel();
        accLabel = new javax.swing.JLabel();
        management_employeePanel = new javax.swing.JPanel();
        employeeLabel = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ SHOP THỜI TRANG");

        sidebarPanel.setBackground(new java.awt.Color(153, 153, 153));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(300, 630));

        home_pagePanel.setBackground(new java.awt.Color(75, 123, 236));
        home_pagePanel.setPreferredSize(new java.awt.Dimension(270, 50));

        homepageLabel.setBackground(new java.awt.Color(255, 255, 255));
        homepageLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        homepageLabel.setForeground(new java.awt.Color(255, 255, 255));
        homepageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quan_Li.png"))); // NOI18N
        homepageLabel.setText("TRANG CHỦ");

        javax.swing.GroupLayout home_pagePanelLayout = new javax.swing.GroupLayout(home_pagePanel);
        home_pagePanel.setLayout(home_pagePanelLayout);
        home_pagePanelLayout.setHorizontalGroup(
            home_pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_pagePanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(homepageLabel)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        home_pagePanelLayout.setVerticalGroup(
            home_pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        management_customerPanel.setBackground(new java.awt.Color(75, 123, 236));
        management_customerPanel.setForeground(new java.awt.Color(255, 255, 255));
        management_customerPanel.setPreferredSize(new java.awt.Dimension(270, 50));

        customerLabel.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hoa_don.png"))); // NOI18N
        customerLabel.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout management_customerPanelLayout = new javax.swing.GroupLayout(management_customerPanel);
        management_customerPanel.setLayout(management_customerPanelLayout);
        management_customerPanelLayout.setHorizontalGroup(
            management_customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_customerPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(customerLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        management_customerPanelLayout.setVerticalGroup(
            management_customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        management_productPanel.setBackground(new java.awt.Color(75, 123, 236));
        management_productPanel.setPreferredSize(new java.awt.Dimension(270, 50));

        productLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quan_Li.png"))); // NOI18N
        productLabel.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout management_productPanelLayout = new javax.swing.GroupLayout(management_productPanel);
        management_productPanel.setLayout(management_productPanelLayout);
        management_productPanelLayout.setHorizontalGroup(
            management_productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_productPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(productLabel)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        management_productPanelLayout.setVerticalGroup(
            management_productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        management_receptPanel.setBackground(new java.awt.Color(75, 123, 236));
        management_receptPanel.setPreferredSize(new java.awt.Dimension(270, 50));

        receptLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        receptLabel.setForeground(new java.awt.Color(255, 255, 255));
        receptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thong_ke.png"))); // NOI18N
        receptLabel.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout management_receptPanelLayout = new javax.swing.GroupLayout(management_receptPanel);
        management_receptPanel.setLayout(management_receptPanelLayout);
        management_receptPanelLayout.setHorizontalGroup(
            management_receptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_receptPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(receptLabel)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        management_receptPanelLayout.setVerticalGroup(
            management_receptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receptLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MINSHOP");

        logoutBtn.setBackground(new java.awt.Color(204, 255, 204));
        logoutBtn.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thoat.png"))); // NOI18N
        logoutBtn.setText("Đăng xuất");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        management_statisticalPanel.setBackground(new java.awt.Color(75, 123, 236));
        management_statisticalPanel.setPreferredSize(new java.awt.Dimension(270, 50));

        statistifyLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        statistifyLabel.setForeground(new java.awt.Color(255, 255, 255));
        statistifyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statistifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thong_ke.png"))); // NOI18N
        statistifyLabel.setText("THỐNG KÊ DOANH THU");

        javax.swing.GroupLayout management_statisticalPanelLayout = new javax.swing.GroupLayout(management_statisticalPanel);
        management_statisticalPanel.setLayout(management_statisticalPanelLayout);
        management_statisticalPanelLayout.setHorizontalGroup(
            management_statisticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_statisticalPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(statistifyLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        management_statisticalPanelLayout.setVerticalGroup(
            management_statisticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statistifyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        management_accPanel.setBackground(new java.awt.Color(75, 123, 236));
        management_accPanel.setPreferredSize(new java.awt.Dimension(270, 50));
        management_accPanel.setVerifyInputWhenFocusTarget(false);

        accLabel.setBackground(new java.awt.Color(255, 255, 255));
        accLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        accLabel.setForeground(new java.awt.Color(255, 255, 255));
        accLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thanh_toan.png"))); // NOI18N
        accLabel.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout management_accPanelLayout = new javax.swing.GroupLayout(management_accPanel);
        management_accPanel.setLayout(management_accPanelLayout);
        management_accPanelLayout.setHorizontalGroup(
            management_accPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_accPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(accLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        management_accPanelLayout.setVerticalGroup(
            management_accPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        management_employeePanel.setBackground(new java.awt.Color(75, 123, 236));
        management_employeePanel.setPreferredSize(new java.awt.Dimension(270, 50));

        employeeLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        employeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thanh_toan.png"))); // NOI18N
        employeeLabel.setText("QUẢN LÝ NHÂN VIÊN");
        employeeLabel.setMaximumSize(new java.awt.Dimension(154, 50));
        employeeLabel.setMinimumSize(new java.awt.Dimension(154, 50));

        javax.swing.GroupLayout management_employeePanelLayout = new javax.swing.GroupLayout(management_employeePanel);
        management_employeePanel.setLayout(management_employeePanelLayout);
        management_employeePanelLayout.setHorizontalGroup(
            management_employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_employeePanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        management_employeePanelLayout.setVerticalGroup(
            management_employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidebarPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(management_productPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(management_customerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(home_pagePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addComponent(management_receptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(management_accPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sidebarPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(management_employeePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(management_statisticalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(home_pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(management_productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(management_customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(management_receptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(management_accPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(management_employeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(management_statisticalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        containerPanel.setPreferredSize(new java.awt.Dimension(985, 670));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLabel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JPanel home_pagePanel;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel management_accPanel;
    private javax.swing.JPanel management_customerPanel;
    private javax.swing.JPanel management_employeePanel;
    private javax.swing.JPanel management_productPanel;
    private javax.swing.JPanel management_receptPanel;
    private javax.swing.JPanel management_statisticalPanel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel receptLabel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JLabel statistifyLabel;
    // End of variables declaration//GEN-END:variables
}
