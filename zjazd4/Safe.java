package zjazd4;

import java.util.Date;

public class Safe {


    Safe(Alarm alarm, String pin) {
        addAlarm(alarm);
        this.pin = pin;
    }

    public Alarm alarm;

    private String pin;

    public void addAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void removeAlarm(Alarm alarm) {
        this.alarm = null;
    }

    public void enterPin(String pin) {
        PinEvent event = new PinEvent(this, new Date());
        if (pin.equals(this.pin)) correctPin();
        else wrongPin();
    }

    private void wrongPin() {
        PinEvent event = new PinEvent(this, new Date());
        this.alarm.alarmTurnOn();

    }

    private void correctPin() {
        PinEvent event = new PinEvent(this, new Date());
        alarm.alarmTurnOff();
    }
}
