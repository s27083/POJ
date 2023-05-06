package zjazd4;

import java.awt.Toolkit;

public class SoundAlarm implements Alarm {


    public Logger logger;

    SoundAlarm(Logger logger) {
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
        Toolkit.getDefaultToolkit().beep();
    }
}
