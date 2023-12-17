package lyra.utils;

import app.PaletteColors;
import java.awt.Cursor;
import javax.swing.JButton;

public class NavbarFunctions {

    // Public functions...
    public void controllerMouseEffect(JButton b) {
        this.styleMouse(b);
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterMouseEffect(b);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseEffect(b);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseEffect(b);
            }
        });
    }

    // Private functions...
    private void styleMouse(JButton b) {
    }
    private void enterMouseEffect(JButton b) {
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    private void exitMouseEffect(JButton b) {
    }
    private void clickMouseEffect(JButton b) {
        b.setForeground(PaletteColors.TEXTBUTTON_SECUNDARY);
    }
}
