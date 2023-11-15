/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import app.App;
import game.Blackjack;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import utils.Errors;
import utils.Utils;

/**
 *
 * @author Daniel
 */
public class BlackjackGUI extends javax.swing.JFrame implements KeyListener {

    // App class
    private static Blackjack blackjack;

    // Array of elements to delete after
    private List<JLabel> elementsOnTable = new ArrayList<>();

    // Coords in JFrame
    private int[] x_coords;
    private int[] y_coords;
    private int[] x_coords_defeat;
    private int[] y_coords_defeat;

    // Distance card to card
    private int x_distance;
    private int y_distance;

    // Size card
    private int widthCard;
    private int heightCard;

    // Time to waiting cards
    private int waitingTime;
    private int waitingTimeRef;
    private int breakTime;
    private int breakTimeRef;

    // Values to void errors
    private boolean gameRef;
    private boolean reqCards;
    private boolean reqCard;

    public BlackjackGUI(Blackjack game) {
        // Init function
        initComponents();

        // Params
        blackjack = game;
        gameRef = false;
        reqCards = true;

        // Values
        widthCard = 50;
        heightCard = 60;
        
        // Time
        waitingTime = 60;
        breakTime = 2;

        // Automatic functions
        breakSeconds.setText(breakTime + "s");
        coords();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Coords">      
    private void coords() {
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

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Cycle">    
    private void gameCycle() {
        new Thread(() -> {
            // Presentation
            App.presentation();

            // Worker
            double totalCards = blackjack.getCards();
            int hand = 1;

            // Cycle
            while (totalCards < blackjack.getLimitCards()) {
                // Presentation
                Utils.information("Mano número " + hand);

                // First and second hands
                automaticHand();
                System.out.println("[%] Mano automática exitosa");

                // Bot behavior
                botBehaviorThread();
                System.out.println("[%] Mano automática de los bots exitosa");

                // Player behavior
                playerBehaviorThread();

                // Dealer behavior
                dealerBehaviorThread();
                System.out.println("[%] Mano automática del dealer exitosa");

                // Clear table & pause
                clearTableThread();
                System.out.println("[%] Limpieza exitosa");

                // Reset values
                reset();
                System.out.println("[%] Reiniciando cuentas de cartas");

                // Update values
                hand++;
                totalCards = blackjack.getCards();
                
                // Testing
                System.out.println(blackjack.getLimitCards());
                System.out.println(totalCards);
            }
            
            Utils.information("Gracias por jugar! Puede comenzar otra partida si lo desea");
            resetAll();
        }).start();
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Behavior Threads"> 
    private void botBehaviorThread() {
        Thread thread = new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                int numBots = 6;

                // For all bots
                for (int i = 0; i < numBots; i++) {
                    // Extract her points
                    int points = blackjack.points(i);
                    int aux_x_distance = 0;
                    int aux_y_distance = 0;

                    while (points < blackjack.getLimitBot()) {
                        this.hand(i, aux_x_distance, aux_y_distance);
                        points = blackjack.points(i);
                        aux_x_distance += 10;
                        aux_y_distance += 5;
                    }

                    if (points > 21) {
                        losserLabel(i);
                    }
                }
            });
        });

        try {
            thread.start();
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(BlackjackGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void playerBehaviorThread() {
        Thread thread = new Thread(() -> {
            int numPlayer = 6;
            int points = blackjack.points(numPlayer);
            int aux_x_distance = 0;
            int aux_y_distance = 0;

            try {
                // Condición: No ha holdeado y el tiempo de espera no se ha acabado
                waitingTimeRef = 0;
                while (reqCards && waitingTime > 0) {
                    // Actualizar reloj
                    SwingUtilities.invokeLater(() -> {
                        seconds.setText((waitingTime - waitingTimeRef) + "s");
                        seconds.repaint();
                    });

                    // Agregar carta
                    if (reqCard) {
                        this.hand(numPlayer, aux_x_distance, aux_y_distance);
                        points = blackjack.points(numPlayer);
                        aux_x_distance += 10;
                        aux_y_distance += 5;

                        // Si se pasa del valor
                        // point > 21
                        // 23 > 21 = TRUE
                        if (points > blackjack.getLimit()) {
                            reqCards = false;
                            losserLabel(numPlayer);
                        }

                        // Reiniciar valor para no caer en bucle
                        reqCard = false;
                    }

                    Thread.sleep(1000);
                    waitingTimeRef++;
                }

            } catch (Exception ex) {
            }

            seconds.setText(waitingTime + "s");
            seconds.repaint();
        });

        try {
            thread.start();
            thread.join();
            // Se reinician los valores
            reqCards = true;
            seconds.setText(waitingTime + "s");
        } catch (InterruptedException ex) {
            Logger.getLogger(BlackjackGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dealerBehaviorThread() {
        int numDealer = 7;

        // Extract her points
        int points = blackjack.points(numDealer);
        int aux_x_distance = 15;

        while (points < blackjack.getLimitDealer()) {
            this.hand(numDealer, aux_x_distance);
            points = blackjack.points(numDealer);
            aux_x_distance += 15;
        }

        // Losser table
        // point > 21
        // 23 > 21 = TRUE
        if (points > blackjack.getLimit()) {
            this.losserLabel(numDealer);
        } else {
            // Loop for 7 players to compareer points
            for (int player = 0; player < 7; player++) {
                int pointsPlayerCompareer = blackjack.points(player);

                // If points of dealer > Points of the players = Players defeat
                if (points > pointsPlayerCompareer) {
                    System.out.println("Sexo al player (" + player + ")");
                    this.losserLabel(player);
                }
            }
        }
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Basic Game Functions">   
    private void automaticHand() {
        // Values
        int players = 7;
        int dealer = 1;

        // All slots (8)
        for (int i = 0; i < (players + dealer); i++) {
            this.hand(i);
        }

        // Update distance
        updateDistance();

        // Only (7) slots (Dealer has other behavior)
        for (int i = 0; i < players; i++) {
            this.hand(i);
        }

        // Update distance
        updateDistance();
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
        elementsOnTable.add(element);
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Hands">      
    private void hand(int player) {
        try {
            // Get the path card of image
            String cardPath = blackjack.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            blackjack.saveCard(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(x_coords[player] - x_distance, y_coords[player] - y_distance, widthCard, heightCard);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            elementsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("[!] ERROR EN EL PAINT DEL ELEMENTO: " + ex);
        }
    }

    private void hand(int player, int aux_x_distance) {
        try {
            // Get the path card of image
            String cardPath = blackjack.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            blackjack.saveCard(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(this.x_coords[player] - aux_x_distance, this.y_coords[player], this.widthCard, this.heightCard);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            elementsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        }
    }

    private void hand(int player, int aux_x_distance, int aux_y_distance) {
        try {
            // Get the path card of image
            String cardPath = blackjack.card();

            // Search image and ajust
            ImageIcon icon = this.createImage(cardPath);

            // Counter hand
            blackjack.saveCard(player, cardPath);

            // Add to GUI
            JLabel element = new JLabel();
            element.setIcon(icon);
            element.setBounds(this.x_coords[player] - (this.x_distance + aux_x_distance), this.y_coords[player] - (this.y_distance + aux_y_distance), this.widthCard, this.heightCard);
            gameLayout.add(element, JLayeredPane.PALETTE_LAYER);

            // Agrega la referencia del elemento a la lista
            elementsOnTable.add(element);

        } catch (IOException ex) {
            System.out.println("[!] ERROR ENTREGADO CARTAS DE MANO: " + ex);
        }
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Elements">
    private ImageIcon createImage(String path) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File(path));
        Image image = bufferedImage.getScaledInstance(widthCard, heightCard, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);

        return icon;
    }

    private void updateDistance() {
        x_distance += 10;
        y_distance += 5;
    }

    private void clearTableThread() {
        Thread waitThread = new Thread(() -> {
            try {
                breakTimeRef = 0;

                while (breakTimeRef < breakTime + 1) {
                    SwingUtilities.invokeLater(() -> {
                        // Actualizar la interfaz de usuario en el hilo principal
                        breakSeconds.setText((breakTime - breakTimeRef) + "s");
                        breakSeconds.repaint();
                    });

                    Thread.sleep(1000);
                    breakTimeRef++;
                }
            } catch (Exception ex) {
            }

            breakSeconds.setText(breakTime + "s");
            breakSeconds.repaint();

        });

        try {
            waitThread.start();
            waitThread.join();
        } catch (InterruptedException ex) {
        }

        waitThread = new Thread(() -> {
            elementsOnTable.forEach(card -> {
                gameLayout.remove(card);
            });

            gameLayout.repaint();
            elementsOnTable.clear();
        });

        try {
            waitThread.start();
            waitThread.join();
        } catch (InterruptedException ex) {
        }
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Resets Values">      
    private void reset() {
        x_distance = 0;
        y_distance = 0;
        blackjack.reset();
    }

    private void resetAll() {
        gameRef = false;
        x_distance = 0;
        y_distance = 0;
        blackjack.resetAll();
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Key listenner">
    /*
        W | ARROW.UP:       Get card
        S | ARROX.DOWN:     Stop
        ENTER:              Start game
     */
    @Override
    public void keyTyped(KeyEvent e) {
        // Este método se llama cuando se presiona y luego se suelta una tecla
        // No se utiliza en este ejemplo
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            // Pedir carta
            case KeyEvent.VK_UP:
                reqCard();
                break;

            // Quedarse
            case KeyEvent.VK_DOWN:
                reqCardStop();
                break;

            // Reiniciar
            case KeyEvent.VK_RIGHT:
                restart();
                break;

            // Comenzar
            case KeyEvent.VK_ENTER:
                start();
                break;

            // Salir
            case KeyEvent.VK_ESCAPE:
                close();
                break;

            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Este método se llama cuando se suelta una tecla
        // No se utiliza en este ejemplo
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Actions">
    private void start() {
        if (!gameRef) {
            gameRef = true;
            gameCycle();

        } else {
            Errors.gameIsStarted();
        }
    }

    private void restart() {
        Utils.information("Has reiniciado el juego!");
        resetAll();
    }

    private void close() {
        Utils.information("Muchas gracias por jugar, pulse OK para continuar");
        System.exit(0);
    }

    private void reqCardStop() {
        reqCards = false;
    }

    private void reqCard() {
        reqCard = true;
    }
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameLayout = new javax.swing.JLayeredPane();
        secondsPanel = new javax.swing.JPanel();
        secondsLabel = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        breakPanel = new javax.swing.JPanel();
        breakLabel = new javax.swing.JLabel();
        breakSeconds = new javax.swing.JLabel();
        instruccionsPanel = new javax.swing.JPanel();
        requestIns = new javax.swing.JLabel();
        holdIns = new javax.swing.JLabel();
        startIns = new javax.swing.JLabel();
        startIns1 = new javax.swing.JLabel();
        holdIns1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        showDeveloper = new javax.swing.JMenuItem();
        start = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        gameMenu = new javax.swing.JMenu();
        limitCards = new javax.swing.JMenuItem();
        mallet = new javax.swing.JMenuItem();
        setLimitBot = new javax.swing.JMenuItem();
        setLimitDealer = new javax.swing.JMenuItem();
        stadisticsMenu = new javax.swing.JMenu();
        stadistics = new javax.swing.JMenuItem();
        hiloMenu = new javax.swing.JMenu();
        showCount = new javax.swing.JMenuItem();
        hiloExplication = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondsPanel.setBackground(new java.awt.Color(255, 255, 255));
        secondsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondsPanel.setForeground(new java.awt.Color(255, 255, 255));

        secondsLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondsLabel.setText("Tiempo de espera:");

        seconds.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seconds.setText("60s");

        javax.swing.GroupLayout secondsPanelLayout = new javax.swing.GroupLayout(secondsPanel);
        secondsPanel.setLayout(secondsPanelLayout);
        secondsPanelLayout.setHorizontalGroup(
            secondsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondsPanelLayout.createSequentialGroup()
                .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seconds)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        secondsPanelLayout.setVerticalGroup(
            secondsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondsPanelLayout.createSequentialGroup()
                .addGroup(secondsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gameLayout.add(secondsPanel);
        secondsPanel.setBounds(10, 10, 210, 30);

        breakPanel.setBackground(new java.awt.Color(255, 255, 255));
        breakPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        breakPanel.setForeground(new java.awt.Color(255, 255, 255));

        breakLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        breakLabel.setText("Tiempo de break:");

        breakSeconds.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        breakSeconds.setText("0s");

        javax.swing.GroupLayout breakPanelLayout = new javax.swing.GroupLayout(breakPanel);
        breakPanel.setLayout(breakPanelLayout);
        breakPanelLayout.setHorizontalGroup(
            breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakPanelLayout.createSequentialGroup()
                .addComponent(breakLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(breakSeconds)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        breakPanelLayout.setVerticalGroup(
            breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakPanelLayout.createSequentialGroup()
                .addGroup(breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakSeconds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gameLayout.add(breakPanel);
        breakPanel.setBounds(10, 50, 210, 30);

        instruccionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        instruccionsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        instruccionsPanel.setOpaque(false);

        requestIns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestIns.setForeground(new java.awt.Color(255, 255, 255));
        requestIns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        requestIns.setText("ABAJO: Quedarse");

        holdIns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        holdIns.setForeground(new java.awt.Color(255, 255, 255));
        holdIns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        holdIns.setText("ARRIBA: Pedir carta");

        startIns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startIns.setForeground(new java.awt.Color(255, 255, 255));
        startIns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        startIns.setText("DERECHA: Reiniciar");

        startIns1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startIns1.setForeground(new java.awt.Color(255, 255, 255));
        startIns1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        startIns1.setText("ENTER: Comenzar");

        holdIns1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        holdIns1.setForeground(new java.awt.Color(255, 255, 255));
        holdIns1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        holdIns1.setText("KEYSHORTS");

        javax.swing.GroupLayout instruccionsPanelLayout = new javax.swing.GroupLayout(instruccionsPanel);
        instruccionsPanel.setLayout(instruccionsPanelLayout);
        instruccionsPanelLayout.setHorizontalGroup(
            instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instruccionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(holdIns1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(instruccionsPanelLayout.createSequentialGroup()
                        .addGroup(instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startIns1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(holdIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startIns)
                            .addComponent(requestIns, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        instruccionsPanelLayout.setVerticalGroup(
            instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instruccionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(holdIns1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(holdIns)
                    .addComponent(requestIns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(instruccionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startIns)
                    .addComponent(startIns1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gameLayout.add(instruccionsPanel);
        instruccionsPanel.setBounds(210, 600, 350, 110);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/background.jpg"))); // NOI18N
        gameLayout.add(background);
        background.setBounds(0, 0, 1080, 720);

        getContentPane().add(gameLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        menuPrincipal.setText("Menu");

        showDeveloper.setText("Desarrollador");
        showDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDeveloperActionPerformed(evt);
            }
        });
        menuPrincipal.add(showDeveloper);

        start.setText("Comenzar partida");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        menuPrincipal.add(start);

        exit.setText("Salir del juego");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuPrincipal.add(exit);

        menuBar.add(menuPrincipal);

        gameMenu.setText("Partida");

        limitCards.setText("Límite de cartas");
        limitCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitCardsActionPerformed(evt);
            }
        });
        gameMenu.add(limitCards);

        mallet.setText("Mazo de cartas");
        mallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malletActionPerformed(evt);
            }
        });
        gameMenu.add(mallet);

        setLimitBot.setText("Configurar límite del bot");
        setLimitBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLimitBotActionPerformed(evt);
            }
        });
        gameMenu.add(setLimitBot);

        setLimitDealer.setText("Configurar límite del dealer");
        setLimitDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLimitDealerActionPerformed(evt);
            }
        });
        gameMenu.add(setLimitDealer);

        menuBar.add(gameMenu);

        stadisticsMenu.setText("Estadísticas");

        stadistics.setText("Estadísticas de cartas");
        stadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stadisticsActionPerformed(evt);
            }
        });
        stadisticsMenu.add(stadistics);

        menuBar.add(stadisticsMenu);

        hiloMenu.setText("HI-Lo");

        showCount.setText("Ver cuenta");
        showCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCountActionPerformed(evt);
            }
        });
        hiloMenu.add(showCount);

        hiloExplication.setText("Explicación");
        hiloExplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiloExplicationActionPerformed(evt);
            }
        });
        hiloMenu.add(hiloExplication);

        menuBar.add(hiloMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Events">
    private void showDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDeveloperActionPerformed
        Utils.information("Este juego ha sido desarrollado por Daniel De Oliveira");
        Utils.information("Estudio en la Universidad Metropolitana de Caracas. Trimestre 5/12");
        Utils.information("GitHub: Dani19866");
    }//GEN-LAST:event_showDeveloperActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        close();
    }//GEN-LAST:event_exitActionPerformed

    private void limitCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitCardsActionPerformed
        int req = Utils.requestInt("Por favor, introduce el nuevo límite de cartas (Default: 208 - 4 mazos)", 1, blackjack.getTotalCards());
        if (req != -1) {
            blackjack.setLimitCards(req);
        }
    }//GEN-LAST:event_limitCardsActionPerformed

    private void setLimitBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLimitBotActionPerformed
        int req = Utils.requestInt("Por favor, introduce el nuevo límite de cartas (Default: 16)", 1, 21);
        if (req != -1) {
            blackjack.setLimitBot(req);
        }
    }//GEN-LAST:event_setLimitBotActionPerformed

    private void setLimitDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLimitDealerActionPerformed
        int req = Utils.requestInt("Por favor, introduce el nuevo límite de cartas (Default: 17)", 1, 21);
        if (req != -1) {
            blackjack.setLimitDealer(req);
        }
    }//GEN-LAST:event_setLimitDealerActionPerformed

    private void stadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stadisticsActionPerformed
        StadisticsGUI gui = new StadisticsGUI(blackjack);

        // Window config
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setTitle("Stadistics");
        gui.setLocationRelativeTo(null);
    }//GEN-LAST:event_stadisticsActionPerformed

    private void showCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCountActionPerformed
        int values = blackjack.getCountHILo();
        Utils.information("El conteo va por " + values);
    }//GEN-LAST:event_showCountActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start();
    }//GEN-LAST:event_startActionPerformed

    private void hiloExplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiloExplicationActionPerformed
        HiloExplicationGUI gui = new HiloExplicationGUI();
        
        // Window config
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setTitle("HI-LO Explication");
        gui.setLocationRelativeTo(null);
    }//GEN-LAST:event_hiloExplicationActionPerformed

    private void malletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malletActionPerformed
        int req = Utils.requestInt("Por favor, introduce el nuevo número de mazos (Default: 4)", 1, 12);
        if (req != -1) {
            Utils.information("Partida reiniciada para reestablecer valores!");
            blackjack.setMallet(req);
            resetAll();
        }
    }//GEN-LAST:event_malletActionPerformed
    // </editor-fold>

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Main Function">    
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
            java.util.logging.Logger.getLogger(BlackjackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackjackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackjackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackjackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BlackjackGUI(blackjack).setVisible(true);
        });
    }
    // </editor-fold>    

    // -----------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel breakLabel;
    private javax.swing.JPanel breakPanel;
    private javax.swing.JLabel breakSeconds;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLayeredPane gameLayout;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenuItem hiloExplication;
    private javax.swing.JMenu hiloMenu;
    private javax.swing.JLabel holdIns;
    private javax.swing.JLabel holdIns1;
    private javax.swing.JPanel instruccionsPanel;
    private javax.swing.JMenuItem limitCards;
    private javax.swing.JMenuItem mallet;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JLabel requestIns;
    private javax.swing.JLabel seconds;
    private javax.swing.JLabel secondsLabel;
    private javax.swing.JPanel secondsPanel;
    private javax.swing.JMenuItem setLimitBot;
    private javax.swing.JMenuItem setLimitDealer;
    private javax.swing.JMenuItem showCount;
    private javax.swing.JMenuItem showDeveloper;
    private javax.swing.JMenuItem stadistics;
    private javax.swing.JMenu stadisticsMenu;
    private javax.swing.JMenuItem start;
    private javax.swing.JLabel startIns;
    private javax.swing.JLabel startIns1;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>    
}
