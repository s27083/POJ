package zjazd4;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message) {
        try {
            FileWriter writer = new FileWriter("logs1.txt", true);
            writer.write(severity + ":" + message + "\n");
            writer.close();
            System.out.println("Log saved");
        } catch (IOException e) {
            System.out.println("Error while saving log");
            e.printStackTrace();
        }

    }


}
