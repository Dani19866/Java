/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Errors {

    public static void changeAppareance() {
        String m = "Ocurrió un error en el cambio de apariencia moderna. Contacte con el desarrollador";
        JOptionPane.showMessageDialog(null, m, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void valuesNotAllowed() {
        String m = "Sólo números como valor! No se permiten otros carácteres";
        JOptionPane.showMessageDialog(null, m, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void numbersNotAllowed(int min, int max) {
        String m = "Sólo números del " + min + " al " + max + "! No se permiten otros números";
        JOptionPane.showMessageDialog(null, m, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void gameIsStarted() {
        String m = "No se puede empezar una partida ya empezada";
        JOptionPane.showMessageDialog(null, m, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void uknowError(String m) {
        JOptionPane.showMessageDialog(null, m, "Error", JOptionPane.ERROR_MESSAGE);

    }
}
