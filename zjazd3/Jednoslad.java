public class Jednoslad extends Pojazd {
    private TypJednosladu typ;

    enum TypJednosladu {
        MOTOCYKL,
        ROWER,
        HULAJNOGA
    }

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
            double momentObrotowy, TypJednosladu typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
        this.nrPojazdu++;
    }

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
            double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.nrPojazdu++;
    }

    @Override
    public void wyswietl() {
        String typJednosladu = typ == null ? "" : ", typ: " + typ;
        String markaJednosladu = marka == null ? "" : ", marka: " + marka;
        String nazwaJednosladu = nazwa == null ? "" : ", nazwa: " + nazwa;
        String pojemnoscSilnikaJednosladu = ", pojemnosc silnika: " + pojemnoscSilnika;
        String rodzajSilnikaJednosladu = rodzajSilnika == null ? "" : ", rodzaj silnika: " + rodzajSilnika;
        String mocJednosladu = ", moc: " + moc;
        String momentObrotowyJednosladu = typ == null ? "" : ", moment obrotowy: " + momentObrotowy;

        System.out.println(
                "Jednoslad " + nrPojazdu + " z " + maxLiczbaPojazdow + ": " + markaJednosladu + " " + nazwaJednosladu +
                        ", " + pojemnoscSilnikaJednosladu + ", " + rodzajSilnikaJednosladu +
                        ", " + mocJednosladu + ", " + momentObrotowyJednosladu + typJednosladu);
    }
}