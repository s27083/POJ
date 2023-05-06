package zjazd4;


public class ConsoleLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message, PinEvent eventSource) {

        switch (severity) {
            case INFO -> {
                System.out.println(severity + ":" + message + " Source: " + eventSource.getSafe() + " Date: " + eventSource.eventDate);
                break;
            }
            case ERROR -> {
                System.err.println(severity + ":" + message + " Source: " + eventSource.getSafe() + " Date: " + eventSource.eventDate);
                break;
            }
            case WARNING -> {
                System.out.println(severity + ":" + message + " Source: " + eventSource.getSafe() + " Date: " + eventSource.eventDate);
                break;

            }
        }
    }
}
