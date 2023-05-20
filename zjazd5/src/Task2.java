import java.util.*;
public class Task2 {

    Task2() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> zbior1 = new HashSet<>();
        Set<Integer> zbior2 = new HashSet<>();
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        for (String s : input1) {
            zbior1.add(Integer.parseInt(s));
        }
        for (String s : input2) {
            zbior2.add(Integer.parseInt(s));
        }
        Set<Integer> czescWspolna = new HashSet<>(zbior1);
        czescWspolna.retainAll(zbior2);
        Set<Integer> wynik = new HashSet<>(zbior1);
        wynik.addAll(zbior2);
        wynik.removeAll(czescWspolna);
        System.out.println(wynik);
    }
}