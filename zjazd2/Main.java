package zjazd2;

//Autor: Kamil Bogdanski

public class Main {
    public static void main(String[] args) {

        // test 1
        Card card1 = new Card(5, Card.kolor.kier);
        Card card2 = new Card(4, Card.kolor.pik);
        Card card3 = new Card(2, Card.kolor.trefl);

        // test 2
        Student student1 = new Student("Kamil", "Bogdański", 27083, 90, 4);
        Student student2 = new Student("Kamil", "Nowakowaski", 24234, 90, 3);
        Student student3 = new Student("", "", 2234, 70, 3);
        System.out.println(student3.getImie());
        System.out.println(student3.getNazwisko());

        // test 3
        MyDate date = new MyDate(3, 4, 2023);
        date.displayDate();

        // test 4
        Clock clock = new Clock();
        System.out.println(clock.toString());
        clock.tick();
        System.out.println(clock.toString());
        clock.tickDown();
        System.out.println(clock.toString());

        // test 5
        Numbers num = new Numbers(10, 20, 30);
        System.out.println("Suma: " + num.sum());
        System.out.println("Średnia arytmetyczna: " + num.average());
        System.out.println("Najmniejsza liczba: " + num.min());
        System.out.println("Największa liczba: " + num.max());
        System.out.println("Średnia geometryczna: " + num.geometric());

        // test 6
        Invoice invoive = new Invoice("s24234", "apple", 5, 1);
        System.out.println("Wartość przedmiotów: " + invoive.amount());

    }

}
