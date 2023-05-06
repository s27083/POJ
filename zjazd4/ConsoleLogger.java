package zjazd4;


public class ConsoleLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message) {

        switch (severity) {
            case INFO -> {
                System.out.println(severity + ":" + message);
            }
            case ERROR -> {
                System.err.println(severity + ":" + message);
            }
            case WARNING -> {
                System.err.println(severity + ":" + message);
            }
        }


    }
}
