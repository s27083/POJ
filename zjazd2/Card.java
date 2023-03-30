package zjazd2;

// Autor: Kamil Bogdański

// Zadanie 1(1 punkt)
// Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartośći kolor:kier,karo,pik,trefl.W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący,który stworzy trzy różne obiekty klasy Card.

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