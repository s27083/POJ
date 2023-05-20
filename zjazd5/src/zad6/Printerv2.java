package zad6;
import java.util.*;

class Printerv2 {
    static void printAll(List<Hamsterv2> hl) {
        Iterator<Hamsterv2> iterator = hl.iterator();
        while (iterator.hasNext()) {
            Hamsterv2 hamster = iterator.next();
            System.out.println(hamster.hamsterNumber()+hamster.hamsterName());
        }
    }
}