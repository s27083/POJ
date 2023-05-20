import java.util.*;

public class Task1 {

    Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers type q to quit");
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
        }
        System.out.println("Input "+ numbers + "\n");
        Set<Number> uniqueNumbers = new TreeSet<>(numbers);
        System.out.println("Output "+ uniqueNumbers + "\n");
    }



}