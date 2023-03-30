package zjazd2;

public class MyDate {
    private int month;
    private int day;
    private int year;

    MyDate(int month, int day, int year) {
        if (month < 0 && month > 12)
            throw new IllegalArgumentException("nie prawidlowa wartosc miesiac zakres od 1 do 12");
        else if (day < 0 && day > 31)
            throw new IllegalArgumentException("nie prawidlowa wartosc dnia zakres od 1 do 31");
        else if (year < 1990 && year > 2050)
            throw new IllegalArgumentException("nie prawidlowa wartosc roku zakres od 1990 do 2050");

        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d", month, day, year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}