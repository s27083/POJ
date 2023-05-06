package zjazd4;

import java.util.Date;

public class PinEvent {

    PinEvent(Safe safe, Date date) {
        this.safe = safe;
        this.eventDate = date;
    }

    ;
    private Safe safe;
    public Date eventDate;

    public Safe getSafe() {
        return safe;
    }
}
