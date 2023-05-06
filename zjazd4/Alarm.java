package zjazd4;

public interface Alarm {
    public static Logger logger = new FileLogger();

    public void alarmTurnOn();

    public void alarmTurnOff();
}