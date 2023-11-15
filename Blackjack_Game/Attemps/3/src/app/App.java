/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import game.Game;
import gui.GameGUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utils.Utils;

/**
 *
 * @author Daniel
 */
public class App {

    public Game game;

    public void init() {
        this.initGame();
        this.changeAppareance();
        this.initGraphics();
    }
    
    public void presentation(){
        Utils.informationPopup("El juego acaba de empezar. Recuerda contar las cartas, prácticar con la tabla de estadística y siempre jugar frío");
        Utils.informationPopup("Para mayor comodidad para el desarrollador y para usted, siempre va a estar en el último puesto de la mesa (7)");
    }

    private void initGame() {
        game = new Game();
    }

    private void initGraphics() {
        GameGUI gui = new GameGUI(this);
        this.interfaceGraphicConfig(gui);
    }

    private void interfaceGraphicConfig(JFrame frame) {
        // Values
        String title = "21 Blackjack stadistics";
        String imagePath = "";
        int x_dimension = 1080;
        int y_dimension = 720;
        int closeOperation = JFrame.EXIT_ON_CLOSE;
        boolean rezisable = false;

        // Params configurable
        frame.setTitle(title);
        frame.setIconImage(new ImageIcon(imagePath).getImage());
        frame.setResizable(rezisable);
        // frame.setSize(x_dimension, y_dimension);
        frame.setDefaultCloseOperation(closeOperation);

        // Params no configurable
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void changeAppareance() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }
}

/*
    [+] Mejoras:
        [-] Descargar imágenes de un servidor
        [-] Imágenes en root para no causar problemas
    
    [+] Bugs:

    [+] Funciones por añadir:
        [-] Bot obtiene 2 aces
*/