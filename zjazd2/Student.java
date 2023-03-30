package zjazd2;

// Autor: Kamil Bogdański

// Zadanie 2 (2 punkty)
// Zaimplementuj klasę `Student`, do przechowywania `imienia`, `nazwiska`, `numer indeksu` i `obecność` (wyrażonej w procentach) `oceny z POJ` (typu int).
// Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko, pola powinny być ustawione wartością "Unknown".
// Dodaj odpowiednie metody set i get do wszystkich pól klasy. Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2.
// Przetestuj program, tworząc trzy różne obiekty klasy `Student`.

public class Student {

    private String imie = "Unknown";
    private String nazwisko = "Unknown";
    private int numerIndexu;
    private int obecnosc;

    private int ocenyZPoj;

    Student(String imie, String nazwisko, int numerIndexu, int obecnosc, int ocenyZPoj) {
        if (imie.length() > 1)
            setImie(imie);
        if (nazwisko.length() > 1)
            setNazwisko(nazwisko);
        setNumerIndexu(numerIndexu);
        setObecnosc(obecnosc);
        if (obecnosc < 50)
            setOcenyZPoj(2);
        setOcenyZPoj(ocenyZPoj);
    }

    public void setOcenyZPoj(int ocenyZPoj) {
        this.ocenyZPoj = ocenyZPoj;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNumerIndexu(int numerIndexu) {
        this.numerIndexu = numerIndexu;
    }

    public void setObecnosc(int obecnosc) {
        this.obecnosc = obecnosc;
    }

    public int getOcenyZPoj() {
        return ocenyZPoj;
    }

    public String getImie() {
        return this.imie;
    };

    public String getNazwisko() {
        return this.nazwisko;
    };

    public int getNumerIndexu() {
        return this.numerIndexu;
    };

    public int getObecnosc() {
        return this.obecnosc;
    };
}