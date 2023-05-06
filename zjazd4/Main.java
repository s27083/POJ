package zjazd4;

public class Main {

    public static void main(String[] args) {

        Logger logger = new ConsoleLogger();
        SoundAlarm alarm = new SoundAlarm(logger);
        Safe safe = new Safe(alarm, "1234");
        safe.enterPin("124");
    }
}
