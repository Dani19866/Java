/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import game.Blackjack;
import gui.BlackjackGUI;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.Errors;
import utils.Utils;

/**
 *
 * @author Daniel
 */
public class App {

    private String nameWindow;
    private int widthWindow;
    private int heightWindow;
    private Image iconWindow;
    private Blackjack blackjack;

    public App() {
        // Window config
        widthWindow = 1080;
        heightWindow = 720;
        nameWindow = "Blackjack stadistics";
        
        // Icon
        String iconPath = "C:\\Blackjack\\icon\\icon.png";
        Toolkit iconUtilKit = Toolkit.getDefaultToolkit();
        iconWindow = iconUtilKit.createImage(iconPath);

        // Game class
        blackjack = new Blackjack();

        // Improve appareance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            Errors.changeAppareance();
        }
    }

    public void start() {
        initInterface();
    }
    
    static public void presentation(){
        Utils.information("El juego acaba de empezar. Recuerda contar las cartas, prácticar con la tabla de estadística y siempre jugar frío");
        Utils.information("El juego terminará cuando se haya alcanzado >70% de las cartas utilizadas en el mazo");
        Utils.information("Para mayor comodidad para el desarrollador y para usted, siempre va a estar en el último puesto de la mesa (7)");
    }

    private void initInterface() {
        BlackjackGUI gui = new BlackjackGUI(blackjack);
        configInterface(gui);
    }

    private void configInterface(JFrame frame) {
        // Detalles
        frame.setTitle(nameWindow);
        frame.setIconImage(new ImageIcon(iconWindow).getImage());
        System.out.println("final test");

        // Ventana
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        // frame.setSize(widthWindow, heightWindow);
    }
}

/*
    [+] Funciones por añadir:
        [-] Estadísticas por porcentaje según el total de puntos 
        [-] Estadísticas del dealer por porcentaje según el total de puntos
        [-] Según el total de puntos y la carta del delaer, pedir o quedarse
*/
