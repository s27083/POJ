import java.util.*;

public class Task3 {
    Task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź ciąg znaków:");
        String input = scanner.nextLine();

        Map<String, Integer> wordCountMap = new TreeMap<>();

        String[] words = input.split(" ");
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCountMap);
    }
}
