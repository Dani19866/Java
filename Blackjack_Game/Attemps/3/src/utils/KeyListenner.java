/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Daniel
 */
public class KeyListenner extends KeyAdapter {

    static public char keyPress(KeyEvent event) {
        char ch = event.getKeyChar();
        System.out.println(ch);
        return ch;
    }
}
