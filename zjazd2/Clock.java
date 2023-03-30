package zjazd2;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock() {
        setHours(12);
    };

    Clock(int seconds) {
        setHours(seconds / 3600);
        setMinutes((seconds % 3600 / 60));
        setSeconds(seconds % 60);
    }

    public void tick() {
        if (seconds == 59) {
            if (minutes == 59) {
                if (hours == 23) {
                    hours = 0;
                } else {
                    hours++;
                }
                minutes = 0;
            } else {
                minutes++;
            }
            seconds = 0;
        } else {
            seconds++;
        }
    }

    public void tickDown() {
        if (seconds == 0) {
            if (minutes == 0) {
                if (hours == 0) {
                    hours = 23;
                } else {
                    hours--;
                }
                minutes = 59;
            } else {
                minutes--;
            }
            seconds = 59;
        } else {
            seconds--;
        }
    }

    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}