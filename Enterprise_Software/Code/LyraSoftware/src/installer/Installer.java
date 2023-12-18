package installer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import lyra.utils.Popups;

/**
 * Installer Class
 *
 * Installer Class allows appropriate functionally of Lyra Software. It
 * download, install and configure all de ecosystem components to work with this
 * software
 *
 * It si the logic: 1. Download MongoDB 2. Install MongoDB 3. Configure mongo
 * users 4. Configure mongo file for security 5. Creation of databases
 *
 * Use this to install MongoDB 7.0 Community Edition on Windows in an unattended
 * fashion using msiexec.exe from the command line
 *
 * Platform Support MongoDB 7.0 Community Edition supports the following 64-bit
 * versions of Windows on x86_64 architecture: Windows Server 2022 Windows
 * Server 2019 Windows 11
 *
 * NOTE: MongoDB is not supported on Windows Subsystem for Linux (WSL). To run
 * MongoDB on Linux, use a supported Linux system.
 */
public class Installer {

    private final Popups popup;

    private final String url_mongodb_msi_2023 = "https://fastdl.mongodb.org/windows/mongodb-windows-x86_64-7.0.4-signed.msi";
    private final String createNameFile = url_mongodb_msi_2023.split("/")[url_mongodb_msi_2023.split("/").length - 1];
    private final String createNameFolder = "LyraSoftware";
    private final String createNameMongoFolder = "Mongo";
    private String pathFolder;
    private String pathFile;

    private boolean size25PercentVerifier = false;
    private boolean size50PercentVerifier = false;
    private boolean size75PercentVerifier = false;

    /**
     * Constructor class
     *
     * Create a Installer object. No do any, only creates a Popups object
     */
    public Installer() {
        popup = new Popups();
    }

    /**
     * Download mongo Function
     *
     * It download msi installer from oficial URL of MongoDB. It connect to the
     * URL to extract basic information as such size file and others facts.
     *
     * It is the logic: 1. TryCatch to connect to URL 2. Extract basic
     * information 3. Calculate size in 25%, 50% and 75% 4. Calculate tolerance
     * error (5%)
     *
     * 5. TryWithResource to close resources after download 6. Create a temp
     * folder in %temp% (Name of folder + randomNumbers) 7. Save the temp folder
     * path 7. Create a path file in temp folder 8. Saving file into the path
     * file 9. Be waiting for status of download (Watching progress in percent)
     * a. If is in 25%, 50% or 75% (Work both percentDownload and
     * isApproximately functions) I. Log in a InstallerUI JFrame
     *
     * @param ui JFrame of InstallerUI
     */
    public void downloadMongo(InstallerUI ui) {
        try {
            URL url = new URL(url_mongodb_msi_2023);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            // Obtener el tamaño del archivo en bytes
            int fileSizeBytes = httpURLConnection.getContentLength();
            double fileSizeMegabytes = fileSizeBytes / (1024.0 * 1024.0); // Convertir a megabytes

            ui.addLog("Starting download... URL: " + url_mongodb_msi_2023);
            ui.addLog("File size: " + Math.round(fileSizeMegabytes) + " MB");

            // Calcular el tamaño del 25%, 50% y 75%
            long size25Percent = fileSizeBytes / 4;
            long size50Percent = fileSizeBytes / 2;
            long size75Percent = size25Percent + size50Percent;

            // Establecer la tolerancia para la aproximación
            int tolerance = (int) (0.05 * fileSizeBytes); // 5%

            // Utilizar try-with-resources para garantizar el cierre adecuado de recursos
            try (InputStream inputStream = url.openStream()) {
                Path tempDirectory = Files.createTempDirectory(createNameFolder);
                pathFolder = tempDirectory.toString();
                ui.addLog("Folder was created! Path: " + pathFolder);

                Path tempFile = tempDirectory.resolve(createNameFile);
                pathFile = tempFile.toString();
                ui.addLog("File was created! Path: " + pathFile);

                byte[] buffer = new byte[1024];
                int bytesRead;
                long totalBytesRead = 0;

                // Copiar el archivo desde la secuencia de entrada al archivo temporal
                try (OutputStream outputStream = Files.newOutputStream(tempFile)) {
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                        totalBytesRead += bytesRead;

                        // Calcular el progreso en porcentaje
                        int progress = (int) ((totalBytesRead * 100) / fileSizeBytes);

                        // Loggear detalles cuando alcanza ciertos porcentajes
                        percentDownload(ui, totalBytesRead, size25Percent, size50Percent, size75Percent, progress, tolerance);
                    }
                }

                ui.addLog("File downloaded and saved in: " + tempFile);
            }

        } catch (IOException e) {
            // Manejar la excepción de manera más específica según tus requisitos
            popup.fatalError("Internet connection error. Details: " + e.getMessage());
        }
    }

    /**
     *
     * @param ui
     * @param path
     */
    public void installMongo(InstallerUI ui, String path) {
        // Create a folder into the path
        String fullPath = path + "\\" + createNameMongoFolder;

        // Creación de la carpeta donde se guardará MongoDB
        ui.addLog("Starting a creation of a folder to save MongoDB");
        createFolder(fullPath, ui);

        // Instalación de MongoDB
        ui.addLog("Installing...");
        ui.addLog("Please, accept the permissions level request to process the instalation");
        String command = createCommandInstalation(fullPath);
        install(command);

    }

    /**
     *
     * @param ui
     */
    public void configUsers(InstallerUI ui) {
        
    }

    // Reserved functions to the principal functions
    /**
     * PercentDownload function
     *
     * This watching the progress of download. This advice of the download
     * progress.
     *
     * This works with downloadMongo function
     *
     * @param ui InstallerUI JFrame to advice in log layout
     * @param totalBytesRead Total bytes downloaded
     * @param size25Percent 25% of the total file size
     * @param size50Percent 50% of the total file size
     * @param size75Percent 75% of the total file size
     * @param progress Total bytes readed in percent
     * @param tolerance Tolerance mistake (5%)
     */
    private void percentDownload(InstallerUI ui, long totalBytesRead, long size25Percent, long size50Percent, long size75Percent, long progress, long tolerance) {
        // Loggear detalles cuando se aproxima al 25%, 50% y 75%
        if (isApproximately(totalBytesRead, size25Percent, tolerance) && (size25PercentVerifier == false)) {
            size25PercentVerifier = true;
            ui.addLog("Approximate downloaded: " + (progress + 5) + "%, Current file size: " + Math.round(totalBytesRead / (1024.0 * 1024.0)) + " MB");
        }

        if (isApproximately(totalBytesRead, size50Percent, tolerance) && (size50PercentVerifier == false)) {
            size50PercentVerifier = true;
            ui.addLog("Approximate downloaded: " + (progress + 5) + "%, Current file size: " + Math.round(totalBytesRead / (1024.0 * 1024.0)) + " MB");
        }

        if (isApproximately(totalBytesRead, size75Percent, tolerance) && (size75PercentVerifier == false)) {
            size75PercentVerifier = true;
            ui.addLog("Approximate downloaded: " + (progress + 5) + "%, Current file size: " + Math.round(totalBytesRead / (1024.0 * 1024.0)) + " MB");

        }
    }

    /**
     * isApproximately function
     *
     * This work with the total bytes downloaded, target bytes and tolerance
     * mis- take
     *
     * @return True if is close to the target
     */
    private boolean isApproximately(long actual, long target, long tolerance) {
        return actual >= target - tolerance && actual <= target + tolerance;
    }

    /**
     *
     */
    private void createFolder(String fullPath, InstallerUI ui) {
        // Crea un objeto File con la ruta de la carpeta
        File carpeta = new File(fullPath);

        if (!carpeta.exists()) {
            // Intenta crear la carpeta
            boolean carpetaCreada = carpeta.mkdirs();

            // Verifica si la carpeta se creó con éxito
            if (carpetaCreada) {
                ui.addLog("MongoDB folder was created");
            } else {
                popup.fatalError("ERROR IN MONGODB FOLDER CREATION");
            }
        } else {
            ui.addLog("Folder already exists");
        }
    }

    /**
     *
     */
    private String createCommandInstalation(String fullPath) {
        String paramPathInstalation = " INSTALLLOCATION=" + "\"" + fullPath + "\"";
        String paramNoInstallMongoCompass = " SHOULD_INSTALL_COMPASS=\"0\"";
        String paramActiveMongoService = " ADDLOCAL=\"ServerService\"";
        String paramNameFile = " " + createNameFile;

        // Creation of command and return it
        String fullCommand = "msiexec.exe /l*v mdbinstall.log  /qb /i" + paramNameFile + paramPathInstalation + paramNoInstallMongoCompass + paramActiveMongoService;
        return fullCommand;
    }

    /**
     *
     */
    private void install(String command) {
        String fullCommand = "powershell.exe " + "cd " + pathFolder + "; " + command;

        // Logic
        Runtime runtime = Runtime.getRuntime();
        long startTime = System.currentTimeMillis();
        long elapsedTime;
        try {
            Process process = runtime.exec(fullCommand);
            process.getOutputStream().close();

            while (waitingServiceStatus() == false) {
                // Obtener el tiempo transcurrido en milisegundos
                elapsedTime = System.currentTimeMillis() - startTime;

                // Verificar si ha pasado 1 minuto (60000 milisegundos)
                if (elapsedTime >= 60000) {
                    popup.fatalError("Ha ocurrido un error durante la instalación");
                }

                waitingServiceStatus();
            }

            process.waitFor();

        } catch (IOException | InterruptedException ex) {
            popup.fatalError("Error installing MongoDB");
        }
    }

    // Exception
    /**
     *
     * @return  */
    public boolean waitingServiceStatus() {
        // True: Existe el servicio
        // False: No existe/corre el servicio
        
        String serviceName = "MongoDB";
        try {
            Process process = Runtime.getRuntime().exec("cmd.exe /c sc query " + serviceName);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("STATE")) {
                        String[] tokens = line.split("\\s+");
                        String state = tokens[tokens.length - 1];

                        if ("RUNNING".equals(state)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (IOException ex) {
            popup.fatalError("An occured error installing MongoDB");
            return false;
        }
    }
}
