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
public class Utils {

    static public void informationPopup(String message) {
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    static public boolean informationConfirmPopup(String message) {
        int selection = JOptionPane.showConfirmDialog(null, message);
        return selection == 0;
    }

}
