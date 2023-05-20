import java.util.*;

public class HamsterMaze {
    private static boolean uniqueId(List<Hamster> hamsters, int id) {
        for (Hamster hamster : hamsters) {
            if (hamster.getHamsterNumber() == id) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<Hamster>();
        Map<String, Hamster> hamsterMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean invalidData = false;

        while (!invalidData) {
            try {
                    System.out.print("Wprowadź identyfikator chomika (unikatowy dodatni): ");
                int id = Integer.parseInt(scanner.nextLine());

                if (id < 0 || uniqueId(v,id)) {
                    throw new NumberFormatException();
                }

                System.out.print("Wprowadź imię chomika: ");
                String name = scanner.nextLine();

                v.add(new Hamster(id, name));
                hamsterMap.put(name, new Hamster(id, name));

                System.out.print("Chcesz dodać kolejnego chomika? Y/N ");
                String input = scanner.nextLine();
                if(input.toLowerCase().equals("n")) {
                    break;
                }

            } catch (NumberFormatException e) {
                invalidData = true;
                System.out.println("Nieprawidłowy identyfikator");
            }
        }

        Printer.printAll(hamsterMap);
       // System.out.println(hamsterMap.keySet());
    }
}

