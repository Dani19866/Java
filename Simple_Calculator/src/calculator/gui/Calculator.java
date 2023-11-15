package calculator.gui;

public class Calculator extends javax.swing.JFrame {
    Logic logic = new Logic();
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">        
    public Calculator() {
        initComponents();
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        displayLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        delRecentlyButton = new javax.swing.JButton();
        delAllButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        restButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        forButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        changeSignButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        layoutPanel.setBackground(new java.awt.Color(204, 204, 204));
        layoutPanel.setPreferredSize(new java.awt.Dimension(300, 400));
        layoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLabel.setText("Standard calculator");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layoutPanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 276, -1));

        displayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        displayPanel.setMaximumSize(new java.awt.Dimension(15, 30));

        displayLabel.setBackground(new java.awt.Color(255, 255, 255));
        displayLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayLabel.setText("0");

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layoutPanel.add(displayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 333, -1));

        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonsPanel.setMaximumSize(new java.awt.Dimension(73, 23));
        buttonsPanel.setMinimumSize(new java.awt.Dimension(73, 23));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(73, 23));

        delRecentlyButton.setBackground(new java.awt.Color(255, 102, 102));
        delRecentlyButton.setText("CE");
        delRecentlyButton.setFocusPainted(false);
        delRecentlyButton.setMaximumSize(new java.awt.Dimension(73, 23));
        delRecentlyButton.setMinimumSize(new java.awt.Dimension(73, 23));
        delRecentlyButton.setPreferredSize(new java.awt.Dimension(73, 23));

        delAllButton.setBackground(new java.awt.Color(255, 102, 102));
        delAllButton.setText("C");
        delAllButton.setFocusPainted(false);
        delAllButton.setMaximumSize(new java.awt.Dimension(73, 23));
        delAllButton.setMinimumSize(new java.awt.Dimension(73, 23));
        delAllButton.setPreferredSize(new java.awt.Dimension(73, 23));

        delButton.setBackground(new java.awt.Color(153, 255, 255));
        delButton.setText("DEL");
        delButton.setFocusPainted(false);
        delButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButtonMouseClicked(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(255, 153, 255));
        divideButton.setText("÷");
        divideButton.setFocusPainted(false);
        divideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideButtonMouseClicked(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(255, 153, 255));
        multiplyButton.setText("x");
        multiplyButton.setFocusPainted(false);
        multiplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyButtonMouseClicked(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(255, 255, 255));
        eightButton.setText("8");
        eightButton.setFocusPainted(false);
        eightButton.setMaximumSize(new java.awt.Dimension(73, 23));
        eightButton.setMinimumSize(new java.awt.Dimension(73, 23));
        eightButton.setPreferredSize(new java.awt.Dimension(73, 23));
        eightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightButtonMouseClicked(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(255, 255, 255));
        sevenButton.setText("7");
        sevenButton.setFocusPainted(false);
        sevenButton.setMaximumSize(new java.awt.Dimension(73, 23));
        sevenButton.setMinimumSize(new java.awt.Dimension(73, 23));
        sevenButton.setPreferredSize(new java.awt.Dimension(73, 23));
        sevenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenButtonMouseClicked(evt);
            }
        });

        restButton.setBackground(new java.awt.Color(255, 153, 255));
        restButton.setText("-");
        restButton.setFocusPainted(false);
        restButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restButtonMouseClicked(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(255, 255, 255));
        sixButton.setText("6");
        sixButton.setFocusPainted(false);
        sixButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixButtonMouseClicked(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(255, 255, 255));
        fiveButton.setText("5");
        fiveButton.setFocusPainted(false);
        fiveButton.setMaximumSize(new java.awt.Dimension(73, 23));
        fiveButton.setMinimumSize(new java.awt.Dimension(73, 23));
        fiveButton.setPreferredSize(new java.awt.Dimension(73, 23));
        fiveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveButtonMouseClicked(evt);
            }
        });

        forButton.setBackground(new java.awt.Color(255, 255, 255));
        forButton.setText("4");
        forButton.setFocusPainted(false);
        forButton.setMaximumSize(new java.awt.Dimension(73, 23));
        forButton.setMinimumSize(new java.awt.Dimension(73, 23));
        forButton.setPreferredSize(new java.awt.Dimension(73, 23));
        forButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forButtonMouseClicked(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(255, 255, 255));
        threeButton.setText("3");
        threeButton.setFocusPainted(false);
        threeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeButtonMouseClicked(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(255, 153, 255));
        plusButton.setText("+");
        plusButton.setFocusPainted(false);
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusButtonMouseClicked(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(255, 255, 255));
        twoButton.setText("2");
        twoButton.setFocusPainted(false);
        twoButton.setMaximumSize(new java.awt.Dimension(73, 23));
        twoButton.setMinimumSize(new java.awt.Dimension(73, 23));
        twoButton.setPreferredSize(new java.awt.Dimension(73, 23));
        twoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoButtonMouseClicked(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(255, 255, 255));
        oneButton.setText("1");
        oneButton.setFocusPainted(false);
        oneButton.setMaximumSize(new java.awt.Dimension(73, 23));
        oneButton.setMinimumSize(new java.awt.Dimension(73, 23));
        oneButton.setPreferredSize(new java.awt.Dimension(73, 23));
        oneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneButtonMouseClicked(evt);
            }
        });

        resultButton.setBackground(new java.awt.Color(204, 255, 204));
        resultButton.setText("=");
        resultButton.setFocusPainted(false);
        resultButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultButtonMouseClicked(evt);
            }
        });

        pointButton.setBackground(new java.awt.Color(153, 204, 255));
        pointButton.setText(".");
        pointButton.setFocusPainted(false);

        zeroButton.setBackground(new java.awt.Color(255, 255, 255));
        zeroButton.setText("0");
        zeroButton.setFocusPainted(false);
        zeroButton.setMaximumSize(new java.awt.Dimension(73, 23));
        zeroButton.setMinimumSize(new java.awt.Dimension(73, 23));
        zeroButton.setPreferredSize(new java.awt.Dimension(73, 23));
        zeroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroButtonMouseClicked(evt);
            }
        });

        changeSignButton.setBackground(new java.awt.Color(153, 204, 255));
        changeSignButton.setText("+/-");
        changeSignButton.setFocusPainted(false);
        changeSignButton.setMaximumSize(new java.awt.Dimension(73, 23));
        changeSignButton.setMinimumSize(new java.awt.Dimension(73, 23));
        changeSignButton.setPreferredSize(new java.awt.Dimension(73, 23));

        nineButton.setBackground(new java.awt.Color(255, 255, 255));
        nineButton.setText("9");
        nineButton.setFocusPainted(false);
        nineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(delRecentlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(forButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(threeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(plusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(restButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divideButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delRecentlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layoutPanel.add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 333, 248));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events: Addition | Subtraction | Multiplication | Division">      
    private void plusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseClicked
        this.updateOperation(1);
    }//GEN-LAST:event_plusButtonMouseClicked

    private void restButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restButtonMouseClicked
        this.updateOperation(2);
    }//GEN-LAST:event_restButtonMouseClicked

    private void multiplyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyButtonMouseClicked
        this.updateOperation(3);
    }//GEN-LAST:event_multiplyButtonMouseClicked

    private void divideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideButtonMouseClicked
        this.updateOperation(4);
    }//GEN-LAST:event_divideButtonMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Events: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 0"> 
    private void oneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneButtonMouseClicked
        this.updateDisplay("1");
    }//GEN-LAST:event_oneButtonMouseClicked

    private void twoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoButtonMouseClicked
        this.updateDisplay("2");
    }//GEN-LAST:event_twoButtonMouseClicked

    private void threeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeButtonMouseClicked
        this.updateDisplay("3");
    }//GEN-LAST:event_threeButtonMouseClicked

    private void forButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forButtonMouseClicked
        this.updateDisplay("4");
    }//GEN-LAST:event_forButtonMouseClicked

    private void fiveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveButtonMouseClicked
        this.updateDisplay("5");
    }//GEN-LAST:event_fiveButtonMouseClicked

    private void sixButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixButtonMouseClicked
        this.updateDisplay("6");
    }//GEN-LAST:event_sixButtonMouseClicked

    private void sevenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenButtonMouseClicked
        this.updateDisplay("7");
    }//GEN-LAST:event_sevenButtonMouseClicked

    private void eightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightButtonMouseClicked
        this.updateDisplay("8");
    }//GEN-LAST:event_eightButtonMouseClicked

    private void nineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineButtonMouseClicked
        this.updateDisplay("9");
    }//GEN-LAST:event_nineButtonMouseClicked
        
    private void zeroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroButtonMouseClicked
        this.updateDisplay("0");
    }//GEN-LAST:event_zeroButtonMouseClicked

    private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButtonMouseClicked
        this.deleteDisplay();
    }//GEN-LAST:event_delButtonMouseClicked

    private void resultButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultButtonMouseClicked
        this.showResult();
    }//GEN-LAST:event_resultButtonMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Functions"> 
    private void updateDisplay(String x){
        logic.setNumber(x);
        displayLabel.setText(logic.display);
    }
    
    private void updateOperation(int x){
        if (x == 1) logic.worker(1);
        if (x == 2) logic.worker(2);
        if (x == 3) logic.worker(3);
        if (x == 4) logic.worker(4);
    }
    
    private void deleteDisplay(){
        logic.delNumber();
        displayLabel.setText(logic.display);
    }
    
    private void showResult(){
        logic.result();
        displayLabel.setText(logic.resultDisplay);
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Main function">        
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration">        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton changeSignButton;
    private javax.swing.JButton delAllButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton delRecentlyButton;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton forButton;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton restButton;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
