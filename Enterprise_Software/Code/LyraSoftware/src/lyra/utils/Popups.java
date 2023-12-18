package lyra.utils;

import static java.lang.System.exit;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Popups {

    JFileChooser fileChooser = new JFileChooser();

    public Popups() {
    }

    public String requestPath(JFrame frame) {
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            String rutaCarpeta = fileChooser.getSelectedFile().getPath();
            return rutaCarpeta;
        }
        
        fatalError("Error selecting path");
        return "null";
    }

    public void informative(String message) {
        JOptionPane.showMessageDialog(null, message, "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }

    public void warning(String message) {
        JOptionPane.showMessageDialog(null, message, "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public void error(String message) {
        JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);

    }
    
    public void fatalError(String message) {
        JOptionPane.showMessageDialog(null, message, "FATAL ERROR", JOptionPane.ERROR_MESSAGE);
        exit(1);
    }

    public String simpleInput(String title) {
        return JOptionPane.showInputDialog(title);
    }
}
