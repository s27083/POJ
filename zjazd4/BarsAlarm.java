package zjazd4;


public class BarsAlarm implements Alarm {


    public Logger logger;

    BarsAlarm(Logger logger) {
        this.logger = logger;

    }

    @Override
    public void alarmTurnOff(PinEvent event) {

        logger.LogMessage(Severity.INFO, "Correct pin entered", event);
        logger.LogMessage(Severity.INFO, "Turning off alarm", event);
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        logger.LogMessage(Severity.ERROR, "Wrong pin!", event);
        logger.LogMessage(Severity.INFO, "Turning on alarm", event);
        logger.LogMessage(Severity.INFO, "Bars down!", event);
    }
}
