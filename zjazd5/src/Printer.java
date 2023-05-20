import java.util.*;
import java.lang.String;

class Printer {
    static void printAll(Map<String,Hamster> hl) {
        for (String key: hl.keySet()){
            System.out.println(hl.get(key).hamsterNumber()+hl.get(key).hamsterName());
        }
    }
}