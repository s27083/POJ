public class Lokomotywa extends Maszyna {
    private int liczbaKol;
    private int liczbaWagonow;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
            int liczbaKol, int liczbaWagonow) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.liczbaKol = liczbaKol;
        this.liczbaWagonow = liczbaWagonow;
    }

    public void wyswietl() {
        System.out.println("Lokomotywa " + marka + " " + nazwa + ", pojemnosc silnika: " + pojemnoscSilnika +
                ", rodzaj silnika: " + rodzajSilnika + ", liczba kol: " + liczbaKol + ", liczba wagonow: "
                + liczbaWagonow);
    }
}