package zad6;

import java.util.*;

public class HamsterMazev2 {
    public static void main(String[] args) {
        List<Hamsterv2> v = new ArrayList<Hamsterv2>();

        Scanner scanner = new Scanner(System.in);
        Map<String, Hamsterv2> hamsterMap = new HashMap<>();
        boolean invalidData = false;
        while (!invalidData) {
            try {
                System.out.print("Wprowadź identyfikator chomika (unikatowy dodatni): ");
                int id = Integer.parseInt(scanner.nextLine());

                if (id < 0 || uniqueId(v, id)) {
                    throw new NumberFormatException();
                }

                System.out.print("Wprowadź imię chomika: ");
                String name = scanner.nextLine();

                v.add(new Hamsterv2(id, name));
                hamsterMap.put(name, new Hamsterv2(id, name));

                System.out.print("Chcesz dodać kolejnego chomika? Y/N ");
                String input = scanner.nextLine();
                if (input.toLowerCase().equals("n")) {
                    break;
                }

            } catch (NumberFormatException e) {
                invalidData = true;
                System.out.println("Nieprawidłowy identyfikator");
            }
        }
        Printerv2.printAll(v);
        Collections.sort(v);
        System.out.println("Lista posortowana:");
        Printerv2.printAll(v);
        System.out.println("Usuwanie chomika o id 5:");
        removeHamster(v, 5);
        Printerv2.printAll(v);
    }

    public static void removeHamster(List<Hamsterv2> hl, int id) {
        Iterator<Hamsterv2> iterator = hl.iterator();
        while (iterator.hasNext()) {
            Hamsterv2 hamster2 = iterator.next();
            if (hamster2.getHamsterNumber() == id) {
                iterator.remove();
                break;
            }
        }
    }

    private static boolean uniqueId(List<Hamsterv2> hamsters, int id) {
        for (Hamsterv2 hamster : hamsters) {
            if (hamster.getHamsterNumber() == id) {
                return true;
            }
        }
        return false;
    }

}



