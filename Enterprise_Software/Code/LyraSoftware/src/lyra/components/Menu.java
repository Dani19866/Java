package lyra.components;

import app.PaletteColors;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import lyra.utils.NavbarFunctions;

public class Menu extends javax.swing.JPanel {
    /**
     * To add new button (Feature)
     *      1. Create a button
     *      2. Add in "initConfiguration" and "selecButtonController"
     *      3. Create click event (ActionPerfor...)
     *      4. Add function "selectButtonController"
     */

    private NavbarFunctions nbf = new NavbarFunctions();

    public Menu() {
        initComponents();
        initConfiguration();
    }

    private void initConfiguration() {
        dashboard.setForeground(PaletteColors.TEXTBUTTON_SECUNDARY);
        nbf.controllerMouseEffect(accounts);
        nbf.controllerMouseEffect(sales);
        nbf.controllerMouseEffect(clients);
        nbf.controllerMouseEffect(employees);
        nbf.controllerMouseEffect(configuration);
        nbf.controllerMouseEffect(socialmedias);
        nbf.controllerMouseEffect(stadistics);
        nbf.controllerMouseEffect(dashboard);
        nbf.controllerMouseEffect(reports);
        nbf.controllerMouseEffect(advanced);
        nbf.controllerMouseEffect(expenses);
    }

    private void selectButtonController() {
        accounts.setForeground(PaletteColors.TEXBUTTON_CLICK);
        clients.setForeground(PaletteColors.TEXBUTTON_CLICK);
        configuration.setForeground(PaletteColors.TEXBUTTON_CLICK);
        dashboard.setForeground(PaletteColors.TEXBUTTON_CLICK);
        employees.setForeground(PaletteColors.TEXBUTTON_CLICK);
        sales.setForeground(PaletteColors.TEXBUTTON_CLICK);
        socialmedias.setForeground(PaletteColors.TEXBUTTON_CLICK);
        stadistics.setForeground(PaletteColors.TEXBUTTON_CLICK);
        reports.setForeground(PaletteColors.TEXBUTTON_CLICK);
        advanced.setForeground(PaletteColors.TEXBUTTON_CLICK);
        expenses.setForeground(PaletteColors.TEXBUTTON_CLICK);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLayout = new javax.swing.JPanel();
        titleApp = new javax.swing.JLabel();
        titleCompany = new javax.swing.JLabel();
        buttonsLayout = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        accounts = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        expenses = new javax.swing.JButton();
        clients = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        socialmedias = new javax.swing.JButton();
        stadistics = new javax.swing.JButton();
        reports = new javax.swing.JButton();
        advanced = new javax.swing.JButton();
        configuration = new javax.swing.JButton();
        version = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLayout.setBackground(new java.awt.Color(0, 0, 0));
        titleLayout.setOpaque(false);
        titleLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleApp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleApp.setForeground(new java.awt.Color(255, 255, 255));
        titleApp.setText("LYRA SOFTWARE");
        titleLayout.add(titleApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 210, -1));

        titleCompany.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleCompany.setForeground(new java.awt.Color(255, 255, 255));
        titleCompany.setText("SANTOS Y SANTOS C.A.");
        titleLayout.add(titleCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        add(titleLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        buttonsLayout.setBackground(new java.awt.Color(0, 0, 0));
        buttonsLayout.setOpaque(false);
        buttonsLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        dashboard.setText("DASHBOARD");
        dashboard.setToolTipText("");
        dashboard.setBorderPainted(false);
        dashboard.setContentAreaFilled(false);
        dashboard.setFocusPainted(false);
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dashboard.setIconTextGap(20);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        buttonsLayout.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        accounts.setBackground(new java.awt.Color(255, 255, 255));
        accounts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        accounts.setForeground(new java.awt.Color(255, 255, 255));
        accounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accounts.png"))); // NOI18N
        accounts.setText("ACCOUNTS");
        accounts.setToolTipText("");
        accounts.setBorderPainted(false);
        accounts.setContentAreaFilled(false);
        accounts.setFocusPainted(false);
        accounts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accounts.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accounts.setIconTextGap(20);
        accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsActionPerformed(evt);
            }
        });
        buttonsLayout.add(accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 30));

        sales.setBackground(new java.awt.Color(255, 255, 255));
        sales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sales.png"))); // NOI18N
        sales.setText("SALES");
        sales.setToolTipText("");
        sales.setBorderPainted(false);
        sales.setContentAreaFilled(false);
        sales.setFocusPainted(false);
        sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sales.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sales.setIconTextGap(20);
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        buttonsLayout.add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 30));

        expenses.setBackground(new java.awt.Color(255, 255, 255));
        expenses.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        expenses.setForeground(new java.awt.Color(255, 255, 255));
        expenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expenses.png"))); // NOI18N
        expenses.setText("EXPENSES");
        expenses.setToolTipText("");
        expenses.setBorderPainted(false);
        expenses.setContentAreaFilled(false);
        expenses.setFocusPainted(false);
        expenses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expenses.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        expenses.setIconTextGap(20);
        expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensesActionPerformed(evt);
            }
        });
        buttonsLayout.add(expenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 30));

        clients.setBackground(new java.awt.Color(255, 255, 255));
        clients.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clients.setForeground(new java.awt.Color(255, 255, 255));
        clients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients.png"))); // NOI18N
        clients.setText("CLIENTS");
        clients.setToolTipText("");
        clients.setBorderPainted(false);
        clients.setContentAreaFilled(false);
        clients.setFocusPainted(false);
        clients.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clients.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clients.setIconTextGap(20);
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });
        buttonsLayout.add(clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 30));

        employees.setBackground(new java.awt.Color(255, 255, 255));
        employees.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employees.setForeground(new java.awt.Color(255, 255, 255));
        employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employees.png"))); // NOI18N
        employees.setText("EMPLOYEES");
        employees.setToolTipText("");
        employees.setBorderPainted(false);
        employees.setContentAreaFilled(false);
        employees.setFocusPainted(false);
        employees.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employees.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        employees.setIconTextGap(20);
        employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesActionPerformed(evt);
            }
        });
        buttonsLayout.add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 30));

        socialmedias.setBackground(new java.awt.Color(255, 255, 255));
        socialmedias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        socialmedias.setForeground(new java.awt.Color(255, 255, 255));
        socialmedias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/social_media.png"))); // NOI18N
        socialmedias.setText("SOCIALMEDIAS");
        socialmedias.setToolTipText("");
        socialmedias.setBorderPainted(false);
        socialmedias.setContentAreaFilled(false);
        socialmedias.setFocusPainted(false);
        socialmedias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        socialmedias.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        socialmedias.setIconTextGap(20);
        socialmedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialmediasActionPerformed(evt);
            }
        });
        buttonsLayout.add(socialmedias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 30));

        stadistics.setBackground(new java.awt.Color(255, 255, 255));
        stadistics.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stadistics.setForeground(new java.awt.Color(255, 255, 255));
        stadistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadistics.png"))); // NOI18N
        stadistics.setText("STADISTICS");
        stadistics.setToolTipText("");
        stadistics.setBorderPainted(false);
        stadistics.setContentAreaFilled(false);
        stadistics.setFocusPainted(false);
        stadistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stadistics.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        stadistics.setIconTextGap(20);
        stadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stadisticsActionPerformed(evt);
            }
        });
        buttonsLayout.add(stadistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 30));

        reports.setBackground(new java.awt.Color(255, 255, 255));
        reports.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reports.setForeground(new java.awt.Color(255, 255, 255));
        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports.png"))); // NOI18N
        reports.setText("REPORTS");
        reports.setToolTipText("");
        reports.setBorderPainted(false);
        reports.setContentAreaFilled(false);
        reports.setFocusPainted(false);
        reports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reports.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        reports.setIconTextGap(20);
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        buttonsLayout.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 30));

        advanced.setBackground(new java.awt.Color(255, 255, 255));
        advanced.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        advanced.setForeground(new java.awt.Color(255, 255, 255));
        advanced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/advanced.png"))); // NOI18N
        advanced.setText("ADVANCED");
        advanced.setToolTipText("");
        advanced.setBorderPainted(false);
        advanced.setContentAreaFilled(false);
        advanced.setFocusPainted(false);
        advanced.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        advanced.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        advanced.setIconTextGap(20);
        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });
        buttonsLayout.add(advanced, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 30));

        configuration.setBackground(new java.awt.Color(255, 255, 255));
        configuration.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        configuration.setForeground(new java.awt.Color(255, 255, 255));
        configuration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuration.png"))); // NOI18N
        configuration.setText("CONFIGURATION");
        configuration.setToolTipText("");
        configuration.setBorderPainted(false);
        configuration.setContentAreaFilled(false);
        configuration.setFocusPainted(false);
        configuration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        configuration.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        configuration.setIconTextGap(20);
        configuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurationActionPerformed(evt);
            }
        });
        buttonsLayout.add(configuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 30));

        version.setForeground(new java.awt.Color(255, 255, 255));
        version.setText("V1.0.0");
        buttonsLayout.add(version, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        add(buttonsLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 570));
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Click event"> 
    private void configurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurationActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_configurationActionPerformed

    private void stadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stadisticsActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_stadisticsActionPerformed

    private void socialmediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialmediasActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_socialmediasActionPerformed

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_employeesActionPerformed

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_clientsActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_salesActionPerformed

    private void accountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_accountsActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_dashboardActionPerformed

    private void advancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_advancedActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_reportsActionPerformed

    private void expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensesActionPerformed
        this.selectButtonController();
    }//GEN-LAST:event_expensesActionPerformed
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Paint">
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(100, 100, PaletteColors.PRIMARY, 100, getHeight(), PaletteColors.SECUNDARY);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(getWidth(), 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables declaration"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounts;
    private javax.swing.JButton advanced;
    private javax.swing.JPanel buttonsLayout;
    private javax.swing.JButton clients;
    private javax.swing.JButton configuration;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton employees;
    private javax.swing.JButton expenses;
    private javax.swing.JButton reports;
    private javax.swing.JButton sales;
    private javax.swing.JButton socialmedias;
    private javax.swing.JButton stadistics;
    private javax.swing.JLabel titleApp;
    private javax.swing.JLabel titleCompany;
    private javax.swing.JPanel titleLayout;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
