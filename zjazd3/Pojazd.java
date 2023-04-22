public class Pojazd extends Maszyna {
    protected static int maxLiczbaPojazdow = 1000;
    protected static int nrPojazdu = 0;
    protected double moc;
    protected double momentObrotowy;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
            double momentObrotowy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.nrPojazdu++;
    }

    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow + ": " + marka + " " + nazwa +
                ", pojemnosc silnika: " + pojemnoscSilnika + ", rodzaj silnika: " + rodzajSilnika +
                ", moc: " + moc + ", moment obrotowy:" + momentObrotowy);
    }
}
