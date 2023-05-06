package zjazd4;

public class Main {

    public static void main(String[] args) {
        //test 1
        Logger logger = new FileLogger();
        SoundAlarm alarm = new SoundAlarm(logger);
        Safe safe = new Safe("1234");
        safe.addAlarm(alarm);
        safe.enterPin("124");
        // test 2
        Logger logger1 = new FileLogger();
        DogAlarm alarm1 = new DogAlarm(logger1);
        Safe safe1 = new Safe("2137");
        safe1.addAlarm(alarm1);
        safe1.enterPin("2137");
        // test 3
        Logger logger2 = new ConsoleLogger();
        PoliceAlarm alarm2 = new PoliceAlarm(logger2);
        Safe safe2 = new Safe("8871");
        safe2.addAlarm(alarm2);
        safe2.removeAlarm(alarm2);
        // test 4
        Logger logger3 = new FileLogger();
        DogAlarm alarm3 = new DogAlarm(logger3);
        Safe safe3 = new Safe("4234");
        safe3.addAlarm(alarm3);
        safe3.enterPin("234234");

    }
}
