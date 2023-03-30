package zjazd2;

public class Card {
    public Card(int wartosc, kolor kolor) {
        checkWartosc(wartosc);
    }

    public enum kolor {
        kier, karo, pik, trefl;
    };

    private int checkWartosc(int wartosc) {
        if (wartosc > 9 || wartosc < 1) {
            throw new IllegalArgumentException("nie prawidlowa wartosc");
        }
        return wartosc;
    }
}