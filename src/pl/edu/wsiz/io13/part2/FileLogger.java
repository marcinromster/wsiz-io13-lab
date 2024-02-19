package pl.edu.wsiz.io13.part2;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Logger {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private final boolean logInfo;
    private final boolean logError;
    private PrintWriter writer;

    public FileLogger(String fileName, boolean logInfo, boolean logError) {
        this.logInfo = logInfo;
        this.logError = logError;
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName, true);
            this.writer = new PrintWriter(fileStream, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info(String message) {
        if (!logInfo) {
            return;
        }

        Date now = new Date();
        String dateTimeString = simpleDateFormat.format(now);

        writer.printf("[%s] INFO : %s\n", dateTimeString, message);
        writer.flush();
    }

    public void error(String message) {
        if (!logError) {
            return;
        }

        Date now = new Date();
        String dateTimeString = simpleDateFormat.format(now);

        writer.printf("[%s] ERROR: %s\n", dateTimeString, message);
        writer.flush();
    }

}
