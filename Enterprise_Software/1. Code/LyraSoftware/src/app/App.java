package app;

import installer.Installer;
import installer.InstallerUI;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lyra.LyraUI;

public class App {

    InstallerUI installer;
    Installer auxInstaller;
    LyraUI lyra;

    public App() {
        // Changing appareance
        updateWindowsAppareance();
        
        // Deciding what JFrame show
        if (existComponents()) {
            // Installer UI
            initInstaller();
            
        }else{
            // Init UI
            initApp();
            
        }
    }

    // Init of UI Installer
    private void initInstaller() {
        installer = new InstallerUI();
        installer.setTitle("Lyra Installer");
        installer.setLocationRelativeTo(null);
        installer.setResizable(false);
        installer.setVisible(true);
    }

    // Init UI App
    private void initApp() {
        lyra = new LyraUI();
        configWindowApp(lyra);
    }

    // Configs of UI App
    private void configWindowApp(JFrame frame) {
        // Configurations
        String windowNameApp = "Lyra Software";

        // Set configurations
        frame.setTitle(windowNameApp);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Visibility
        frame.setVisible(true);
    }

    // TO ACTIVE
    private boolean existComponents() {
        return true;
        // auxInstaller = new Installer();
        // return !auxInstaller.waitingServiceStatus();
    }

    // Ignore
    private void updateWindowsAppareance() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            // To log
        }
    }
}
