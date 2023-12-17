/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

/**
 *
 * @author Daniel
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardLayout = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        stadisticsLayout = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        resume1 = new lyra.components.Resume();
        jPanel4 = new javax.swing.JPanel();
        resume2 = new lyra.components.Resume();
        jPanel5 = new javax.swing.JPanel();
        resume3 = new lyra.components.Resume();
        recentSalesLayout = new javax.swing.JPanel();
        resumeAccounts1 = new lyra.components.ResumeAccounts();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardLayout.setBackground(new java.awt.Color(255, 255, 255));
        dashboardLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        title.setText("DASHBOARD");
        dashboardLayout.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 30));

        description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        description.setText("RESUME OF THIS MONTH");
        dashboardLayout.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 20));

        stadisticsLayout.setLayout(new javax.swing.BoxLayout(stadisticsLayout, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout resume1Layout = new javax.swing.GroupLayout(resume1);
        resume1.setLayout(resume1Layout);
        resume1Layout.setHorizontalGroup(
            resume1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        resume1Layout.setVerticalGroup(
            resume1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stadisticsLayout.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout resume2Layout = new javax.swing.GroupLayout(resume2);
        resume2.setLayout(resume2Layout);
        resume2Layout.setHorizontalGroup(
            resume2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        resume2Layout.setVerticalGroup(
            resume2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stadisticsLayout.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout resume3Layout = new javax.swing.GroupLayout(resume3);
        resume3.setLayout(resume3Layout);
        resume3Layout.setHorizontalGroup(
            resume3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        resume3Layout.setVerticalGroup(
            resume3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        stadisticsLayout.add(jPanel5);

        dashboardLayout.add(stadisticsLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1050, 210));

        recentSalesLayout.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout resumeAccounts1Layout = new javax.swing.GroupLayout(resumeAccounts1);
        resumeAccounts1.setLayout(resumeAccounts1Layout);
        resumeAccounts1Layout.setHorizontalGroup(
            resumeAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        resumeAccounts1Layout.setVerticalGroup(
            resumeAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout recentSalesLayoutLayout = new javax.swing.GroupLayout(recentSalesLayout);
        recentSalesLayout.setLayout(recentSalesLayoutLayout);
        recentSalesLayoutLayout.setHorizontalGroup(
            recentSalesLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resumeAccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        recentSalesLayoutLayout.setVerticalGroup(
            recentSalesLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resumeAccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dashboardLayout.add(recentSalesLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1050, 340));

        add(dashboardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardLayout;
    private javax.swing.JLabel description;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel recentSalesLayout;
    private lyra.components.Resume resume1;
    private lyra.components.Resume resume2;
    private lyra.components.Resume resume3;
    private lyra.components.ResumeAccounts resumeAccounts1;
    private javax.swing.JPanel stadisticsLayout;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
