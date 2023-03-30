package zjazd2;
// Autor: Kamil Bogdański

// Zadanie 5 (3 punkty) Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer. Dodaj metody:
// sum(), zwraca sumę liczb;
// average(), zwraca średnią arytmetyczną liczb;
// min(), zwraca najmniejszą z liczb;
// max(), zwraca największą z liczb;
// geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.

public class Numbers {

    private int num1;
    private int num2;
    private int num3;

    Numbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public int sum() {
        return this.num1 + this.num2 + this.num3;
    }

    public double average() {
        return sum() / 3;
    }

    public int min() {
        return Math.min(Math.min(this.num1, this.num2), this.num3);
    }

    public int max() {
        return Math.max(Math.max(this.num1, this.num2), this.num3);
    }

    public double geometric() {
        return Math.cbrt(this.num1 * this.num2 * this.num3);
    }

}