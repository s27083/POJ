package zjazd4;


public interface Logger {

    Severity logLevel = null;

    public void LogMessage(Severity severity, String message);
}
