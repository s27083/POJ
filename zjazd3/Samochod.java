public class Samochod extends Pojazd {
    private Segment segment;
    private String VIN;

    enum Segment {
        SEGMENT_A,
        SEGMENT_B,
        SEGMENT_C,
        SEGMENT_D,
        SEGMENT_E,
        SEGMENT_F,
        SEGMENT_SUV,
        SEGMENT_SPORTOWY
    }

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
            double momentObrotowy, Segment segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
        this.nrPojazdu++;
    }

    @Override
    public void wyswietl() {
        System.out.println("Samochod " + nrPojazdu + " z " + maxLiczbaPojazdow + ": " + marka + " " + nazwa +
                ", pojemnosc silnika: " + pojemnoscSilnika + ", rodzaj silnika: " + rodzajSilnika +
                ", moc: " + moc + ", moment obrotowy: " + momentObrotowy + ", segment: " + segment +
                ", VIN: " + VIN);
    }
}