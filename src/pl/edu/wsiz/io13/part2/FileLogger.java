package pl.edu.wsiz.io13.part2;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private PrintWriter writer;

    public FileLogger(String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName, true);
            this.writer = new PrintWriter(fileStream, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info(String message) {
        Date now = new Date();
        String dateTimeString = simpleDateFormat.format(now);

        writer.printf("[%s] INFO : %s\n", dateTimeString, message);
    }

    public void error(String message) {
        Date now = new Date();
        String dateTimeString = simpleDateFormat.format(now);

        writer.printf("[%s] ERROR: %s\n", dateTimeString, message);
    }

}
