/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicInterface;

import game.Game;

/**
 *
 * @author Daniel
 */
public class GameGUI extends javax.swing.JFrame {

    static Game game;

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Creates new form GameGUI
     *
     * @param gameClass
     */
    public GameGUI(Game gameClass) {
        initComponents();

        // App object
        game = gameClass;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutGame = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        layoutPlayer1 = new javax.swing.JPanel();
        labelPlayer1 = new javax.swing.JLabel();
        totalPlayer1 = new javax.swing.JLabel();
        numbersExtraPlayer1 = new javax.swing.JLabel();
        numbersPlayer1 = new javax.swing.JLabel();
        layoutPlayer2 = new javax.swing.JPanel();
        totalPlayer2 = new javax.swing.JLabel();
        labelPlayer2 = new javax.swing.JLabel();
        numbersPlayer2 = new javax.swing.JLabel();
        numbersExtraPlayer2 = new javax.swing.JLabel();
        layoutPlayer3 = new javax.swing.JPanel();
        totalPlayer3 = new javax.swing.JLabel();
        labelPlayer3 = new javax.swing.JLabel();
        numbersPlayer3 = new javax.swing.JLabel();
        numbersExtraPlayer3 = new javax.swing.JLabel();
        layoutPlayer4 = new javax.swing.JPanel();
        totalPlayer4 = new javax.swing.JLabel();
        labelPlayer4 = new javax.swing.JLabel();
        numbersPlayer4 = new javax.swing.JLabel();
        numbersExtraPlayer4 = new javax.swing.JLabel();
        layoutPlayer5 = new javax.swing.JPanel();
        totalPlayer5 = new javax.swing.JLabel();
        labelPlayer5 = new javax.swing.JLabel();
        numbersPlayer5 = new javax.swing.JLabel();
        numbersExtraPlayer5 = new javax.swing.JLabel();
        layoutPlayer6 = new javax.swing.JPanel();
        totalPlayer6 = new javax.swing.JLabel();
        labelPlayer6 = new javax.swing.JLabel();
        numbersPlayer6 = new javax.swing.JLabel();
        numbersExtraPlayer6 = new javax.swing.JLabel();
        layoutMe = new javax.swing.JPanel();
        totalMe = new javax.swing.JLabel();
        labelMe = new javax.swing.JLabel();
        numbersMe = new javax.swing.JLabel();
        numbersExtraMe = new javax.swing.JLabel();
        layoutDealer = new javax.swing.JPanel();
        totalDealer = new javax.swing.JLabel();
        labelDealer = new javax.swing.JLabel();
        numberDealer = new javax.swing.JLabel();
        numbersExtraDealer = new javax.swing.JLabel();
        closeHand = new javax.swing.JButton();
        giveCard = new javax.swing.JButton();
        cardsMissing = new javax.swing.JPanel();
        missingLabel = new javax.swing.JLabel();
        missingCounter = new javax.swing.JLabel();
        cardsShowed = new javax.swing.JPanel();
        showsedLabel = new javax.swing.JLabel();
        showedCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layoutGame.setBackground(new java.awt.Color(3, 93, 23));
        layoutGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("21 BLACKJACK GAME");
        layoutGame.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        layoutPlayer1.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPlayer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer1.setText("Player 1");
        layoutPlayer1.add(labelPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        totalPlayer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer1.setText("00");
        layoutPlayer1.add(totalPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        numbersExtraPlayer1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer1.setText("00 + 00 + 00");
        layoutPlayer1.add(numbersExtraPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        numbersPlayer1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer1.setText("00 + 00");
        layoutPlayer1.add(numbersPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        layoutGame.add(layoutPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 30));

        layoutPlayer2.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPlayer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer2.setText("00");
        layoutPlayer2.add(totalPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelPlayer2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer2.setText("Player 2");
        layoutPlayer2.add(labelPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersPlayer2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer2.setText("00 + 00");
        layoutPlayer2.add(numbersPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraPlayer2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer2.setText("00 + 00 + 00");
        layoutPlayer2.add(numbersExtraPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 30));

        layoutPlayer3.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPlayer3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer3.setText("00");
        layoutPlayer3.add(totalPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelPlayer3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer3.setText("Player 3");
        layoutPlayer3.add(labelPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersPlayer3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer3.setText("00 + 00");
        layoutPlayer3.add(numbersPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraPlayer3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer3.setText("00 + 00 + 00");
        layoutPlayer3.add(numbersExtraPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 320, 30));

        layoutPlayer4.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPlayer4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer4.setText("00");
        layoutPlayer4.add(totalPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelPlayer4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer4.setText("Player 4");
        layoutPlayer4.add(labelPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersPlayer4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer4.setText("00 + 00");
        layoutPlayer4.add(numbersPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraPlayer4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer4.setText("00 + 00 + 00");
        layoutPlayer4.add(numbersExtraPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 30));

        layoutPlayer5.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPlayer5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer5.setText("00");
        layoutPlayer5.add(totalPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelPlayer5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer5.setText("Player 5");
        layoutPlayer5.add(labelPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersPlayer5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer5.setText("00 + 00");
        layoutPlayer5.add(numbersPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraPlayer5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer5.setText("00 + 00 + 00");
        layoutPlayer5.add(numbersExtraPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutPlayer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 320, 30));

        layoutPlayer6.setBackground(new java.awt.Color(0, 153, 0));
        layoutPlayer6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutPlayer6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPlayer6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalPlayer6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPlayer6.setText("00");
        layoutPlayer6.add(totalPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelPlayer6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPlayer6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayer6.setText("Player 6");
        layoutPlayer6.add(labelPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersPlayer6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersPlayer6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersPlayer6.setText("00 + 00");
        layoutPlayer6.add(numbersPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraPlayer6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraPlayer6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraPlayer6.setText("00 + 00 + 00");
        layoutPlayer6.add(numbersExtraPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutPlayer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 320, 30));

        layoutMe.setBackground(new java.awt.Color(0, 153, 0));
        layoutMe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutMe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalMe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalMe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalMe.setText("00");
        layoutMe.add(totalMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelMe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelMe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMe.setText("YOU");
        layoutMe.add(labelMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numbersMe.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersMe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersMe.setText("00 + 00");
        layoutMe.add(numbersMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraMe.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraMe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraMe.setText("00 + 00 + 00");
        layoutMe.add(numbersExtraMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 320, 30));

        layoutDealer.setBackground(new java.awt.Color(153, 255, 255));
        layoutDealer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        layoutDealer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalDealer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalDealer.setText("00");
        layoutDealer.add(totalDealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        labelDealer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDealer.setText("DEALER");
        layoutDealer.add(labelDealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        numberDealer.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numberDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberDealer.setText("00 + 00");
        layoutDealer.add(numberDealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 30));

        numbersExtraDealer.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        numbersExtraDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numbersExtraDealer.setText("00 + 00 + 00");
        layoutDealer.add(numbersExtraDealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 30));

        layoutGame.add(layoutDealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 320, 30));

        closeHand.setBackground(new java.awt.Color(255, 255, 255));
        closeHand.setText("Close hand");
        layoutGame.add(closeHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 160, -1));

        giveCard.setBackground(new java.awt.Color(255, 255, 255));
        giveCard.setText("Give me card");
        layoutGame.add(giveCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, -1));

        cardsMissing.setBackground(new java.awt.Color(204, 255, 204));
        cardsMissing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cardsMissing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        missingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        missingLabel.setText("Cartas faltantes:");
        cardsMissing.add(missingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        missingCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        missingCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        missingCounter.setText("0");
        cardsMissing.add(missingCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 30));

        layoutGame.add(cardsMissing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 30));

        cardsShowed.setBackground(new java.awt.Color(204, 255, 204));
        cardsShowed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cardsShowed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showsedLabel.setText("Cartas mostradas:");
        cardsShowed.add(showsedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        showedCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showedCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showedCounter.setText("0");
        cardsShowed.add(showedCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 30));

        layoutGame.add(cardsShowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 140, 30));

        getContentPane().add(layoutGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Main function">  
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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameGUI(game).setVisible(true);
        });
    }
    // </editor-fold>          

    // <editor-fold defaultstate="collapsed" desc="Variable delcaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardsMissing;
    private javax.swing.JPanel cardsShowed;
    private javax.swing.JButton closeHand;
    private javax.swing.JButton giveCard;
    private javax.swing.JLabel labelDealer;
    private javax.swing.JLabel labelMe;
    private javax.swing.JLabel labelPlayer1;
    private javax.swing.JLabel labelPlayer2;
    private javax.swing.JLabel labelPlayer3;
    private javax.swing.JLabel labelPlayer4;
    private javax.swing.JLabel labelPlayer5;
    private javax.swing.JLabel labelPlayer6;
    private javax.swing.JPanel layoutDealer;
    private javax.swing.JPanel layoutGame;
    private javax.swing.JPanel layoutMe;
    private javax.swing.JPanel layoutPlayer1;
    private javax.swing.JPanel layoutPlayer2;
    private javax.swing.JPanel layoutPlayer3;
    private javax.swing.JPanel layoutPlayer4;
    private javax.swing.JPanel layoutPlayer5;
    private javax.swing.JPanel layoutPlayer6;
    private javax.swing.JLabel missingCounter;
    private javax.swing.JLabel missingLabel;
    private javax.swing.JLabel numberDealer;
    private javax.swing.JLabel numbersExtraDealer;
    private javax.swing.JLabel numbersExtraMe;
    private javax.swing.JLabel numbersExtraPlayer1;
    private javax.swing.JLabel numbersExtraPlayer2;
    private javax.swing.JLabel numbersExtraPlayer3;
    private javax.swing.JLabel numbersExtraPlayer4;
    private javax.swing.JLabel numbersExtraPlayer5;
    private javax.swing.JLabel numbersExtraPlayer6;
    private javax.swing.JLabel numbersMe;
    private javax.swing.JLabel numbersPlayer1;
    private javax.swing.JLabel numbersPlayer2;
    private javax.swing.JLabel numbersPlayer3;
    private javax.swing.JLabel numbersPlayer4;
    private javax.swing.JLabel numbersPlayer5;
    private javax.swing.JLabel numbersPlayer6;
    private javax.swing.JLabel showedCounter;
    private javax.swing.JLabel showsedLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalDealer;
    private javax.swing.JLabel totalMe;
    private javax.swing.JLabel totalPlayer1;
    private javax.swing.JLabel totalPlayer2;
    private javax.swing.JLabel totalPlayer3;
    private javax.swing.JLabel totalPlayer4;
    private javax.swing.JLabel totalPlayer5;
    private javax.swing.JLabel totalPlayer6;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>              
}
