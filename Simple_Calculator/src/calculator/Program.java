package calculator;

import calculator.gui.Calculator;
import java.awt.Dimension;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Configurations
        // Name GUI
        calculator.setTitle("Calculator by Daniel De Oliveira");
        
        // Center GUI
        calculator.setLocationRelativeTo(null);
        
        // Set minimum and maximum size
        calculator.setMinimumSize(new Dimension(353, 334));
        calculator.setMaximumSize(new Dimension(353, 334));
        calculator.setResizable(false);
        
        // Show GUI
        calculator.setVisible(true);
    }
}
