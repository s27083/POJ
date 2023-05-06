package zjazd4;

import java.awt.Toolkit;

public class DogAlarm implements Alarm {


    @Override
    public void alarmTurnOff() {

        logger.LogMessage(Severity.INFO, "Correct pin entered");
        logger.LogMessage(Severity.INFO, "Turning off alarm");
    }

    @Override
    public void alarmTurnOn() {
        logger.LogMessage(Severity.ERROR, "Wrong pin!");
        logger.LogMessage(Severity.INFO, "Turning on alarm");
        System.out.println("Dogs out!");
    }
}
