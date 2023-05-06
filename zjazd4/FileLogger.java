package zjazd4;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message, PinEvent eventSource) {
        try {
            FileWriter writer = new FileWriter(eventSource.getSafe().toString() + "_logs.txt", true);
            writer.write(severity + ":" + message + " Source: " + eventSource.getSafe() + " Date: " + eventSource.eventDate + "\n");
            writer.close();
            System.out.println("Log saved");
        } catch (IOException e) {
            System.out.println("Error while saving log");
            e.printStackTrace();
        }

    }


}
