package zjazd4;

import java.awt.Toolkit;

public class SoundAlarm implements Alarm {


    public Logger logger;

    SoundAlarm(Logger logger) {
        this.logger = logger;

    }

    @Override
    public void alarmTurnOff() {

        logger.LogMessage(Severity.INFO, "Correct pin entered");
        logger.LogMessage(Severity.INFO, "Turning off alarm");

    }

    @Override
    public void alarmTurnOn() {
        logger.LogMessage(Severity.ERROR, "Wrong pin!");
        logger.LogMessage(Severity.INFO, "Turning on alarm");
        Toolkit.getDefaultToolkit().beep();
    }
}
