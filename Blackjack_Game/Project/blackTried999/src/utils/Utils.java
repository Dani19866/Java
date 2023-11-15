/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.HeadlessException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Utils {

    static public void information(String message) {
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    static public int requestInt(String message, int min, int max) {
        try {
            String idInput = JOptionPane.showInputDialog(message).trim();
            int value = Integer.parseInt(idInput);
            if (value >= min && value <= max) {
                return value;
            } else {
                throw new Exception("Values not allowed!");
            }

        } catch (HeadlessException | NumberFormatException e) {
            Errors.valuesNotAllowed();
            return -1;
        } catch (Exception ex) {
            Errors.numbersNotAllowed(min, max);
            return -1;
        }
    }

    static public String regex_completeNameFile(String chain) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("cards\\\\([^\\.]+)\\.png");
        matcher = pattern.matcher(chain);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }
    
    static public String regex_shortNameFile(String chain){
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("^(.*?)_");
        matcher = pattern.matcher(chain);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }
}
