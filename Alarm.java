package zjazd4;

public interface Alarm {
    public Logger logger = new FileLogger();

    public void alarmTurnOn(PinEvent event);

    public void alarmTurnOff(PinEvent event);
}