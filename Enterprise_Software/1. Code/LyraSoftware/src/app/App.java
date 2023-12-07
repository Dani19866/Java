/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lyra.LyraGUI;

/**
 *
 * @author Daniel
 */
public class App {

    public App() {
        this.updateWindowsAppareance();
        this.initApp();
    }

    private void initApp() {
        LyraGUI lyra = new LyraGUI();
        this.configWindowApp(lyra);
    }

    private void configWindowApp(JFrame frame) {
        // Aspecto
        String windowNameApp = "Lyra Software by Daniel De Oliveira";

        // Dimensiones
        int fullScreenApp = JFrame.MAXIMIZED_BOTH;
        int minWidthApp = 500;
        int minHeightApp = 500;
        Dimension size = new Dimension(minWidthApp, minHeightApp);
        
        // Set configurations
        frame.setTitle(windowNameApp);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(fullScreenApp);
        frame.setResizable(false);
        
        // Visibility
        frame.setVisible(true);
    }

    private void updateWindowsAppareance() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            // To log
        }
    }
}
