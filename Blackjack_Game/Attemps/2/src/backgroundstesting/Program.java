/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgroundstesting;

import blackjack.BlackjackGUI;

/**
 *
 * @author Daniel
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BlackjackGUI gui = new BlackjackGUI();
        gui.setVisible(true);
        gui.setTitle("Blackjack background testing");
        gui.setLocationRelativeTo(null);
    }
}
