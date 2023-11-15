/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import game.Game;
import graphicInterface.GameGUI;
import graphicInterface.StadisticsGUI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Daniel
 */
public class App {

    private Game game = new Game();

    public void start() {
        this.graphicInterface();
    }

    // <editor-fold defaultstate="collapsed" desc="Graphic Interface">
    private void graphicInterface() {
        try {
            // 1. Instance GUI
            GameGUI g = new GameGUI(this.game);
            StadisticsGUI s = new StadisticsGUI();

            // 2. Windows config
            this.gameInterfaceConfig(g);
            this.stadisticsInterfaceConfig(s);
        } catch (Exception ev1) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                JOptionPane.showMessageDialog(null, "No se pudo abrir la aplicación, inténtelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println("[!] ERROR: " + ev1);

                // Ex
                System.exit(0);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ev2) {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la aplicación ni cambiar el estilo de los mensajes emergentes, inténtelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println("[!] ERROR: " + ev1);
                System.out.println("[!] ERROR IN Look: " + ev2);

                // Ex
                System.exit(0);
            }
        }
    }

    private void gameInterfaceConfig(JFrame frame) {
        // Ventana
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Blackjack game");
        frame.setResizable(false);

        // Operaciones
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void stadisticsInterfaceConfig(JFrame frame) {
        // Ventana
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Blackjack game real-time stadistics");

        // Operaciones
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    // </editor-fold>
}
