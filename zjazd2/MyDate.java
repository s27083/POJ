package zjazd2;

// Autor: Kamil Bogdański

// Zadanie 3 (3 punkty)
// Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int). 
// Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050). 
// Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051. 
// Przetestuj zaimplementowaną klasę.

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