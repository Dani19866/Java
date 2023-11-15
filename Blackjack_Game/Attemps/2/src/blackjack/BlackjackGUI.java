/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class BlackjackGUI extends javax.swing.JFrame implements Runnable {
    private Thread oneT;
    
    public BlackjackGUI() {
        initComponents();
        oneT = new Thread(this);
        oneT.start();
    }
    
    @Override
    public void run(){
        Thread ct = Thread.currentThread();
        int count = 15;
        
        while (ct == oneT && count >= 0){
            timer.setText(count + "s");
            count--;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackjackGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameLayout = new javax.swing.JLayeredPane();
        insPanel = new javax.swing.JPanel();
        hold = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        request = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insPanel.setOpaque(false);

        hold.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hold.setForeground(new java.awt.Color(255, 255, 255));
        hold.setText("S: Quedarse");

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Tiempo para decidir:");

        request.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setText("W: Pedir carta");

        timer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(255, 255, 255));
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer.setText("15s");

        javax.swing.GroupLayout insPanelLayout = new javax.swing.GroupLayout(insPanel);
        insPanel.setLayout(insPanelLayout);
        insPanelLayout.setHorizontalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(hold, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(request))
                .addContainerGap())
        );
        insPanelLayout.setVerticalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerLabel)
                    .addComponent(request))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hold)
                    .addComponent(timer))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        gameLayout.add(insPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 440, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Documents\\Primarios\\Infinite\\Languages\\7. Java\\3. projects\\Personal-21Blackjack\\Project\\21Blackjack\\src\\images\\background\\background.jpg")); // NOI18N
        gameLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        getContentPane().add(gameLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variable declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane gameLayout;
    private javax.swing.JLabel hold;
    private javax.swing.JPanel insPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel request;
    private javax.swing.JLabel timer;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
