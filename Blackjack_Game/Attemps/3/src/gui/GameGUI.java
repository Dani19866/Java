/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import app.App;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.Timer;
import utils.Utils;

/**
 *
 * @author Daniel
 */
public class GameGUI extends javax.swing.JFrame {
    
    private Thread timerT;
    private boolean keyPressed = false;
    private boolean keyStop = false;

    private int x_distance = 0;
    private int y_distance = 0;
    private List<JLabel> cardsOnTable = new ArrayList<>();
    static App app;
    private int time = 15;  
    private int[] x_coords;
    private int[] y_coords;
    private int[] x_coords_defeat;
    private int[] y_coords_defeat;
    private int widthCard = 50;
    private int heightCard = 60;

    // <editor-fold defaultstate="collapsed" desc="Constructor"> 
    /**
     * Creates new form MainGUI
     *
     * @param appParam
     */
    public GameGUI(App appParam) {
        // Ignore
        initComponents();

        // Params
        app = appParam;

        // Automatic
        this.coordsInGame();
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Automatic functions"> 
    /**
     * Set coords of cards to set in table of each slot (player)
     */
    private void coordsInGame() {
        x_coords = new int[8];
        y_coords = new int[8];
        x_coords_defeat = new int[8];
        y_coords_defeat = new int[8];
        // --------------------------------------------------------------------
        x_coords[0] = 815;          // Slot 1
        y_coords[0] = 170;          // Slot 1

        x_coords_defeat[0] = 870;
        y_coords_defeat[0] = 160;
        // --------------------------------------------------------------------
        x_coords[1] = 730;     // Slot 2
        y_coords[1] = 250;     // Slot 2

        x_coords_defeat[1] = 760;
        y_coords_defeat[1] = 250;
        // --------------------------------------------------------------------
        x_coords[2] = 630;     // Slot 3
        y_coords[2] = 300;     // Slot 3

        x_coords_defeat[2] = 640;
        y_coords_defeat[2] = 310;
        // --------------------------------------------------------------------
        x_coords[3] = 520;     // Slot 4
        y_coords[3] = 320;     // Slot 4

        x_coords_defeat[3] = 495;
        y_coords_defeat[3] = 330;
        // --------------------------------------------------------------------
        x_coords[4] = 410;     // Slot 5
        y_coords[4] = 300;     // Slot 5

        x_coords_defeat[4] = 350;
        y_coords_defeat[4] = 310;
        // --------------------------------------------------------------------
        x_coords[5] = 300;     // Slot 6
        y_coords[5] = 250;     // Slot 6

        x_coords_defeat[5] = 230;
        y_coords_defeat[5] = 250;
        // --------------------------------------------------------------------
        x_coords[6] = 210;     // Slot Me
        y_coords[6] = 170;     // Slot Me

        x_coords_defeat[6] = 120;
        y_coords_defeat[6] = 160;
        // --------------------------------------------------------------------
        x_coords[7] = 580;     // Dealer
        y_coords[7] = 140;     // Dealer

        x_coords_defeat[7] = 490;
        y_coords_defeat[7] = 70;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameLayout = new javax.swing.JLayeredPane();
        instructionPanel = new javax.swing.JPanel();
        holdIns = new javax.swing.JLabel();
        secondsTimer = new javax.swing.JLabel();
        requestIns = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        optionsMenu = new javax.swing.JMenu();
        startGame = new javax.swing.JMenuItem();
        restartGame = new javax.swing.JMenuItem();
        closeGame = new javax.swing.JMenuItem();
        helpersMenu = new javax.swing.JMenu();
        openHILoImage = new javax.swing.JMenuItem();
        openHILoDef = new javax.swing.JMenuItem();
        openTableCases = new javax.swing.JMenuItem();
        stadisticsMenu = new javax.swing.JMenu();
        stadisticsMe = new javax.swing.JMenuItem();
        stadisticsDealer = new javax.swing.JMenuItem();
        playersMenu = new javax.swing.JMenu();
        updatePlayers = new javax.swing.JMenuItem();
        playersForRounds = new javax.swing.JMenuItem();
        changePosition = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        instructionPanel.setOpaque(false);
        instructionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        holdIns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        holdIns.setForeground(new java.awt.Color(255, 255, 255));
        holdIns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        holdIns.setText("S: Quedarse");
        instructionPanel.add(holdIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 110, -1));

        secondsTimer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secondsTimer.setForeground(new java.awt.Color(255, 255, 255));
        secondsTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondsTimer.setText("15s");
        instructionPanel.add(secondsTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        requestIns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestIns.setForeground(new java.awt.Color(255, 255, 255));
        requestIns.setText("W: Pedir carta");
        instructionPanel.add(requestIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        timerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Tiempo de espera:");
        instructionPanel.add(timerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        gameLayout.add(instructionPanel);
        instructionPanel.setBounds(320, 610, 440, 80);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/background.jpg"))); // NOI18N
        gameLayout.add(background);
        background.setBounds(0, 0, 1080, 700);

        getContentPane().add(gameLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setFocusable(false);
        menuBar.setOpaque(false);
        menuBar.setRequestFocusEnabled(false);

        optionsMenu.setBackground(new java.awt.Color(255, 255, 255));
        optionsMenu.setText("Menu");
        optionsMenu.setContentAreaFilled(false);
        optionsMenu.setFocusable(false);
        optionsMenu.setRequestFocusEnabled(false);
        optionsMenu.setRolloverEnabled(false);
        optionsMenu.setVerifyInputWhenFocusTarget(false);

        startGame.setText("Start game");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });
        optionsMenu.add(startGame);

        restartGame.setText("Restart game");
        restartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartGameActionPerformed(evt);
            }
        });
        optionsMenu.add(restartGame);

        closeGame.setText("Close game");
        closeGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeGameActionPerformed(evt);
            }
        });
        optionsMenu.add(closeGame);

        menuBar.add(optionsMenu);

        helpersMenu.setBackground(new java.awt.Color(255, 255, 255));
        helpersMenu.setText("Helpers");
        helpersMenu.setContentAreaFilled(false);
        helpersMenu.setFocusable(false);
        helpersMenu.setRequestFocusEnabled(false);
        helpersMenu.setRolloverEnabled(false);
        helpersMenu.setVerifyInputWhenFocusTarget(false);

        openHILoImage.setText("Open HI-Lo image");
        helpersMenu.add(openHILoImage);

        openHILoDef.setText("Open HI-Lo definition");
        helpersMenu.add(openHILoDef);

        openTableCases.setText("Open table of cases");
        helpersMenu.add(openTableCases);

        menuBar.add(helpersMenu);

        stadisticsMenu.setBackground(new java.awt.Color(255, 255, 255));
        stadisticsMenu.setText("Stadistics");
        stadisticsMenu.setContentAreaFilled(false);
        stadisticsMenu.setFocusable(false);
        stadisticsMenu.setRequestFocusEnabled(false);
        stadisticsMenu.setRolloverEnabled(false);
        stadisticsMenu.setVerifyInputWhenFocusTarget(false);

        stadisticsMe.setText("Stadistics of you");
        stadisticsMenu.add(stadisticsMe);

        stadisticsDealer.setText("Stadistics of dealer");
        stadisticsMenu.add(stadisticsDealer);

        menuBar.add(stadisticsMenu);

        playersMenu.setBackground(new java.awt.Color(255, 255, 255));
        playersMenu.setText("Players");
        playersMenu.setContentAreaFilled(false);
        playersMenu.setFocusable(false);
        playersMenu.setRequestFocusEnabled(false);
        playersMenu.setRolloverEnabled(false);
        playersMenu.setVerifyInputWhenFocusTarget(false);

        updatePlayers.setText("Set players");
        playersMenu.add(updatePlayers);

        playersForRounds.setText("Set players/rounds");
        playersMenu.add(playersForRounds);

        changePosition.setText("Change position");
        playersMenu.add(changePosition);

        menuBar.add(playersMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events"> 
    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        this.gameCycle();
    }//GEN-LAST:event_startGameActionPerformed

    private void closeGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeGameActionPerformed
        Utils.informationPopup("Gracias por jugar. GITHUB: Dani19866");
        System.exit(0);
    }//GEN-LAST:event_closeGameActionPerformed

    private void restartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restartGameActionPerformed
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Cycle">
    /**
     * Game cycle. The principal function of the game. The function that gives
     * life to the binary.
     *
     */
    private void gameCycle() {
        // 1. Presentation
        app.presentation();

        // 2. Worker
        int totalCards = app.game.getUsedCards();
        int hands = 1;

        // 3. Cycle
        while (totalCards < 300) {
            // Present hand
            Utils.informationPopup("Mano número " + hands);

            // First and second hand
            this.automaticHand();
            System.out.println("[%] Manos automáticas: Exitosa");

            // Bot behavior
            this.botBehavior();

            // Player behavior
            this.playerBehavior();

            // Dealer behavior
            this.dealerBehavior();

            // Pause
            Utils.informationConfirmPopup("Siguiente mano... Ingrese ENTER para continuar");

            // Clear table
            this.clearTable();

            // Reset values
            this.resetValues();

            // Update values
            System.out.println("[#] --------------------------------------------- ");
            hands++;
            totalCards = app.game.getUsedCards(); // app.game.getUsedCards();
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Functions">
    private void automaticHand() {
        // Values
        int players = 7;
        int dealer = 1;

        // All slots (8)
        for (int i = 0; i < (players + dealer); i++) {
            this.hand(i);
        }

        // Update distance
        this.updateDistance();

        // Only (7) slots (Dealer has other behavior)
        for (int i = 0; i < players; i++) {
            this.hand(i);
        }

        // Update distance
        this.updateDistance();
    }

    private void updateDistance() {
        this.x_distance += 10;
        this.y_distance += 5;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Behavior">
    private void botBehavior() {
        int numBots = 6;

        // For all bots
        for (int i = 0; i < numBots; i++) {
            // Extract her points
            int points = app.game.points(i);
            int aux_x_distance = 0;
            int aux_y_distance = -5;

            while (points < app.game.getLimit()) {
                this.hand(i, aux_x_distance, aux_y_distance);
                points = app.game.points(i);
                aux_x_distance += 10;
                aux_y_distance += 5;
            }

            if (points > 21) {
                this.losserLabel(i);
            }
        }
    }

    private void playerBehavior() {
        int numPlayer = 6;
        int points;
        int aux_x_distance = 0;
        int aux_y_distance = -5;

        // --------------------------------------------------------------------
        // Bucle para captar la tecla
        
        
        // --------------------------------------------------------------------
        // Reiniciar valores
        keyStop = false;
        keyPressed = false;
        time = 15;
    }

    private void dealerBehavior() {
        int numDealer = 7;

        // Extract her points
        int points = app.game.points(numDealer);
        int aux_x_distance = 15;

        while (points < app.game.getLimitDealer()) {
            this.hand(numDealer, aux_x_distance);
            points = app.game.points(numDealer);
            aux_x_distance += 15;
        }

        if (points > 21) {
            this.losserLabel(numDealer);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Hands | losserLabel">
    private void hand(int player) {
        try {
            // Get the path card of image
            String cardPath = app.game.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            app.game.saveCards(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(this.x_coords[player] - this.x_distance, this.y_coords[player] - this.y_distance, 60, 70);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            cardsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        }
    }

    private void hand(int player, int aux_x_distance, int aux_y_distance) {
        try {
            // Get the path card of image
            String cardPath = app.game.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            app.game.saveCards(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(this.x_coords[player] - (this.x_distance + aux_x_distance), this.y_coords[player] - (this.y_distance + aux_y_distance), this.widthCard, this.heightCard);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            cardsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        }
    }

    private void hand(int player, int aux_x_distance) {
        try {
            // Get the path card of image
            String cardPath = app.game.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            app.game.saveCards(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(this.x_coords[player] - aux_x_distance, this.y_coords[player] + 5, this.widthCard, this.heightCard);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            cardsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        }
    }

    private void losserLabel(int player) {
        JLabel element = new JLabel();
        element.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        element.setForeground(new java.awt.Color(255, 0, 51));
        element.setText("LOSSER");
        // -------------------------------------------------------------------
        element.setBounds(this.x_coords_defeat[player], this.y_coords_defeat[player], 300, 300);
        // -------------------------------------------------------------------
        gameLayout.add(element, JLayeredPane.PALETTE_LAYER);
        // -------------------------------------------------------------------
        cardsOnTable.add(element);
        // -------------------------------------------------------------------
        System.out.println("Player " + (player + 1) + " pasó el límite!");
    }

    private ImageIcon createImage(String path) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File(path));
        Image image = bufferedImage.getScaledInstance(this.widthCard, this.heightCard, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);

        return icon;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ClearTable | ResetValues">
    private void clearTable() {
        cardsOnTable.forEach(card -> {
            gameLayout.remove(card);
        });

        cardsOnTable.clear();

        gameLayout.revalidate();
        gameLayout.repaint();
    }

    private void resetValues() {
        x_distance = 0;
        y_distance = 0;
        app.game.resetValues();
    }
    //</editor-fold>

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
            new GameGUI(app).setVisible(true);
        });
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variable declaration"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JMenuItem changePosition;
    private javax.swing.JMenuItem closeGame;
    private javax.swing.JLayeredPane gameLayout;
    private javax.swing.JMenu helpersMenu;
    private javax.swing.JLabel holdIns;
    private javax.swing.JPanel instructionPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openHILoDef;
    private javax.swing.JMenuItem openHILoImage;
    private javax.swing.JMenuItem openTableCases;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JMenuItem playersForRounds;
    private javax.swing.JMenu playersMenu;
    private javax.swing.JLabel requestIns;
    private javax.swing.JMenuItem restartGame;
    private javax.swing.JLabel secondsTimer;
    private javax.swing.JMenuItem stadisticsDealer;
    private javax.swing.JMenuItem stadisticsMe;
    private javax.swing.JMenu stadisticsMenu;
    private javax.swing.JMenuItem startGame;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JMenuItem updatePlayers;
    // End of variables declaration//GEN-END:variables
     //</editor-fold>
}
