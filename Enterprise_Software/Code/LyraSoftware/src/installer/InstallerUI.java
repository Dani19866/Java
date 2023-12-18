package installer;

import static java.lang.System.exit;
import lyra.utils.Popups;
import lyra.utils.Utils;

public class InstallerUI extends javax.swing.JFrame {

    Installer installer;
    Popups popup;
    String folderInstalationPath;
    boolean introductionSign;
    boolean installSign;
    boolean configureMongoUsersSign;
    boolean configureMongoFileSign;
    boolean databasesCreationSign;
    boolean complete;

    // Constructor
    public InstallerUI() {
        installer = new Installer();
        popup = new Popups();
        // introductionSign = true;
        configureMongoUsersSign = true;

        initComponents();
        stepsConfigure();
        initInstaller();
    }

    private void stepsConfigure() {
        introduction.setVisible(false);
        install_mongo.setVisible(false);
        configure_mongo_file.setVisible(false);
        configure_mongo_users.setVisible(false);
        creation_of_databases.setVisible(false);
    }

    private void initInstaller() {
        if (introductionSign) {
            introductionLogic();
        }
        if (installSign) {
            installMongoLogic();
        }
        if (configureMongoUsersSign) {
            mongoUsersLogic(false);
        }
        if (configureMongoFileSign) {

        }
        if (databasesCreationSign) {

        }
        if (complete){
            popup.informative("Lyra Software components are ready to use!");
        }
    }

    private void introductionLogic() {
        introduction.setVisible(true);
    }

    private void installMongoLogic() {
        // Mostrar instalador (Log)
        install_mongo.setVisible(true);

        // Informative popup
        popup.informative("Before starting, this installer uses 'msiexec.exe' to install MongoDB Community Server and automate the process.");

        // Log path select
        addLog("Path select: " + folderInstalationPath);

        // Start a tread
        new Thread(() -> {
            // Descargar archivo
            installer.downloadMongo(this);

            // Instalar archivo (MongoDB)
            addLog("Starting install logic");
            addLog("Remember, MongoDB will be install in the path: " + folderInstalationPath);
            installer.installMongo(this, folderInstalationPath);
            addLog("MongoDB was installed");
            addLog("Is configured to start when the start on the machine");

            // Next logic
            installSign = false;
            configureMongoUsersSign = true;
            install_mongo.setVisible(false);
            initInstaller();
        }).start();
    }

    private void mongoUsersLogic(boolean sign) {
        configure_mongo_users.setVisible(true);

        if (sign) {
            // Start a tread
            new Thread(() -> {
                // Configurar usuarios
                installer.configUsers(this);

                // Next logic
                {
                /*
                    configureMongoUsersSign = false;
                    configureMongoFileSign = true;
                    configure_mongo_users.setVisible(false);
                    initInstaller();
                */
                }
            }).start();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configure_mongo_file = new javax.swing.JPanel();
        creation_of_databases = new javax.swing.JPanel();
        installerLayout = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        htitle = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        configure_mongo_users = new javax.swing.JPanel();
        cmutitle = new javax.swing.JLabel();
        introduction = new javax.swing.JPanel();
        ititle = new javax.swing.JLabel();
        itext = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        icancel = new javax.swing.JButton();
        icontinue = new javax.swing.JButton();
        install_mongo = new javax.swing.JPanel();
        lititle = new javax.swing.JLabel();
        liscrollpanel = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        footer = new javax.swing.JPanel();
        ftitle = new javax.swing.JLabel();

        configure_mongo_file.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout configure_mongo_fileLayout = new javax.swing.GroupLayout(configure_mongo_file);
        configure_mongo_file.setLayout(configure_mongo_fileLayout);
        configure_mongo_fileLayout.setHorizontalGroup(
            configure_mongo_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        configure_mongo_fileLayout.setVerticalGroup(
            configure_mongo_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        creation_of_databases.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout creation_of_databasesLayout = new javax.swing.GroupLayout(creation_of_databases);
        creation_of_databases.setLayout(creation_of_databasesLayout);
        creation_of_databasesLayout.setHorizontalGroup(
            creation_of_databasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        creation_of_databasesLayout.setVerticalGroup(
            creation_of_databasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        installerLayout.setPreferredSize(new java.awt.Dimension(470, 375));

        header.setBackground(new java.awt.Color(204, 204, 204));

        htitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        htitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        htitle.setText("LYRA INSTALLER");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(htitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(htitle, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        main.setBackground(new java.awt.Color(153, 153, 153));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        configure_mongo_users.setBackground(new java.awt.Color(153, 153, 153));
        configure_mongo_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmutitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmutitle.setForeground(new java.awt.Color(255, 255, 255));
        cmutitle.setText("SETTING MONGODB");
        configure_mongo_users.add(cmutitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 29));

        main.add(configure_mongo_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        introduction.setBackground(new java.awt.Color(153, 153, 153));
        introduction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ititle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ititle.setForeground(new java.awt.Color(255, 255, 255));
        ititle.setText("INSTALATION OF MONGO DATABASE");
        introduction.add(ititle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 29));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("MONGODB IS INTEGRATED INTO ENTERPRISE SOFTWARE INSTALLATION FOR ITS UNIQUE ABILITY TO MANAGE UNSTRUCTURED DATA, HORIZONTAL SCALABILITY, AGILITY IN DEVELOPMENT, AND RELIABILITY. IT ADAPTS DYNAMICALLY TO CHANGING DATA STRUCTURES, FACILITATING AGILE DEVELOPMENT. HORIZONTAL SCALING ENSURES OPTIMAL PERFORMANCE WITH LARGE DATA VOLUMES, AND DISTRIBUTED ARCHITECTURE SECURES SYSTEM RELIABILITY. MONGODB IS A STRATEGIC CHOICE TO MAXIMIZE APPLICATION EFFECTIVENESS, PROVIDING A SOLID FOUNDATION FOR EFFICIENTLY MANAGING BUSINESS DATA.\n\nCLICK THE BUTTON \"CONTINUE\" TO SELECT THE INSTALLATION PATH.");
        jTextArea1.setFocusable(false);
        itext.setViewportView(jTextArea1);

        introduction.add(itext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 190));

        icancel.setBackground(new java.awt.Color(255, 204, 204));
        icancel.setText("CANCEL");
        icancel.setBorderPainted(false);
        icancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icancelActionPerformed(evt);
            }
        });
        introduction.add(icancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 30));

        icontinue.setBackground(new java.awt.Color(204, 255, 204));
        icontinue.setText("CONTINUE");
        icontinue.setBorderPainted(false);
        icontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icontinueActionPerformed(evt);
            }
        });
        introduction.add(icontinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 30));

        main.add(introduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        install_mongo.setBackground(new java.awt.Color(153, 153, 153));
        install_mongo.setPreferredSize(new java.awt.Dimension(460, 270));
        install_mongo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lititle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lititle.setForeground(new java.awt.Color(255, 255, 255));
        lititle.setText("INSTALATION OF MONGO DATABASE");
        install_mongo.add(lititle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 29));

        log.setEditable(false);
        log.setColumns(20);
        log.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        log.setLineWrap(true);
        log.setRows(5);
        log.setFocusable(false);
        liscrollpanel.setViewportView(log);

        install_mongo.add(liscrollpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 230));

        main.add(install_mongo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        footer.setBackground(new java.awt.Color(204, 204, 204));

        ftitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ftitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ftitle.setText("COPYRIGHT 2023 - SANTOS Y SANTOS");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ftitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ftitle, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout installerLayoutLayout = new javax.swing.GroupLayout(installerLayout);
        installerLayout.setLayout(installerLayoutLayout);
        installerLayoutLayout.setHorizontalGroup(
            installerLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        installerLayoutLayout.setVerticalGroup(
            installerLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(installerLayoutLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(installerLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(installerLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events">  
    private void icontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icontinueActionPerformed
        // Request path
        folderInstalationPath = popup.requestPath(this);

        // Disable download mongo layout
        introduction.setVisible(false);

        // Next logic
        introductionSign = false;
        installSign = true;
        initInstaller();
    }//GEN-LAST:event_icontinueActionPerformed

    private void icancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icancelActionPerformed
        popup.error("Se ha cancelado la instalación!");
        exit(0);
    }//GEN-LAST:event_icancelActionPerformed
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Reserved">  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstallerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstallerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstallerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstallerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstallerUI().setVisible(true);
            }
        });
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmutitle;
    private javax.swing.JPanel configure_mongo_file;
    private javax.swing.JPanel configure_mongo_users;
    private javax.swing.JPanel creation_of_databases;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel ftitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel htitle;
    private javax.swing.JButton icancel;
    private javax.swing.JButton icontinue;
    private javax.swing.JPanel install_mongo;
    private javax.swing.JPanel installerLayout;
    private javax.swing.JPanel introduction;
    private javax.swing.JScrollPane itext;
    private javax.swing.JLabel ititle;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane liscrollpanel;
    private javax.swing.JLabel lititle;
    private javax.swing.JTextArea log;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>  

    public void addLog(String msg) {
        String text = log.getText();
        String formattedMsg = "[" + Utils.getFullHour() + "] " + msg;

        if (text.isEmpty()) {
            log.setText(formattedMsg);
        } else {
            log.setText(text + "\n" + formattedMsg);
        }
    }
}
