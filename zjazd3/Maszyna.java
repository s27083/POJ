public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;

    protected enum RodzajSilnika {
        BENZYNA,
        DIESEL,
        ELEKTRYCZNY
    }

}
