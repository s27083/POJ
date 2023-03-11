import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
       // zad1();
       // zad2();
       // zad3();
       // zad4();
       // zad5();
       // zad6();
       // zad7();
       // zad8();
       // zad9("kajak");
       // zad10();
        // zad11();
        //   zad12(1000000000,"Ziemia");
       // zad13();
    }
    public  static  void zad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc prostokata ");
        int height = scanner.nextInt();
        System.out.println("Podaj szerokosc prostokata ");
        int width = scanner.nextInt();
        System.out.println("Wynik: "+(height*width));
        scanner.close();
    }
    public static void zad2(){
        double number = Math.sqrt(Math.PI);
        System.out.format("%.2f", number);
    }
    public static void zad3(){
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] out = words.split(" ");
        System.out.println("\"%"+out[1]+" "+out[0]+"%\"");
        scanner.close();

    }
    public static void zad4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj boka a");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c");
        int c = scanner.nextInt();
        //a+b>c a+c>b b+c>a
        if(a < 0 || b < 0 || c < 0 ){
            System.out.println("BLAD");
            scanner.close();

            return;
        }
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }

        scanner.close();

        System.out.println();
    }
    public static void zad5(){
        String out = "";
        try {
            System.out.println("Podaj miesiac");
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            scanner.close();
            if(month < 0 || month > 12) throw new Exception("Bledne dane");
            switch (month) {
                case 1:
                    out = "Styczen 31 dni";
                    break;
                case 2:
                    out = "Luty 28 dni";
                    break;
                case 3:
                    out = "Marzec 31 dni";
                    break;
                case 4:
                    out = "Kwiecien 30 dni";
                    break;
                case 5:
                    out = "Maj 31 dni";
                    break;
                case 6:
                    out = "Czerwiec 30 dni";
                    break;
                case 7:
                    out = "Lipiec 31 dni";
                    break;
                case 8:
                    out = "Sierpien 31 dni";
                    break;
                case 9:
                    out = "Wrzesien 30 dni";
                    break;
                case 10:
                    out = "Pazdziernik 31 dni";
                    break;
                case 11:
                    out = "Listopad 30 dni";
                    break;
                case 12:
                    out = "Grudzien 31 dni";
                    break;
                default:
                    System.out.println("Blad");
            }
            scanner.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(out);
    }
    public static void zad6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe");
        double b = scanner.nextDouble();
        System.out.println("Podaj trzecia liczbe");
        double c = scanner.nextDouble();
        double[] out = new double[3];
       if ((a > b) && (a > c)){
           out[0] = a;
           if (b > c) {
               out[1] = b;
               out[2] = c;
           }
           else {
               out[1] = c;
               out[2] = b;
           }
       }
        if ((b > a) && (b > c)) {
            out[0] = b;
            if (a > c) {
                out[1] = a;
                out[2] = c;
            }
            else {
                out[1] = c;
                out[2] = a;
            }
        }
        else {
            out[0] = c;
            if(a > b){
                out[1] =a;
                out[2] = b;
            }
            else {
                out[1] =b;
                out[2] =a;
            }
        }
        System.out.println(out[0]+" "+out[1]+" "+out[2]+" "+out[2]+" "+out[1]+" "+out[0]+" ");
        scanner.close();

    }
    public static void zad7(){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe elementow tablicy A: ");
        int n = scanner.nextInt();
        System.out.print("Podaj liczbe elementow tablicy B: ");
        int m = scanner.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];
        System.out.println("Wprowadz liczby do tablicy A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Wprowadz liczby do tablicy B:");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int iloczynSkalarny = 0;
        int mniejszyRozmiar = Math.min(n, m); 
        for (int i = 0; i < mniejszyRozmiar; i++) {
            iloczynSkalarny += A[i] * B[i];
        }

        scanner.close();
        System.out.println("Iloczyn skalarny: " + iloczynSkalarny);
    }

    public static void zad8(){
        Scanner scanner = new Scanner(System.in);
        int n;
            System.out.print("Podaj liczbę ");
            n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
    
    public static boolean zad9(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println("nie");
                return false;
            }
        }
        System.out.println("tak");
        return true;
    }
    

    public static void zad10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int rows = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Transpozycja macierzy:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }



    public static boolean zad11(String text) {
        Set<Character> uniqueLetters = new HashSet<>();
        String lowerCaseText = text.toLowerCase();
    
        for (int i = 0; i < lowerCaseText.length(); i++) {
            char c = lowerCaseText.charAt(i);
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }
    
        return uniqueLetters.size() == 26;
    }
    

    public static double zad12(double seconds, String planet) {
        double EARTH_YEAR_IN_SECONDS = 31557600;
        double planetYearInSeconds = 0;

    switch (planet.toUpperCase()) {
        case "MERCURY":
            planetYearInSeconds = 0.2408467 * EARTH_YEAR_IN_SECONDS;
            break;
        case "VENUS":
            planetYearInSeconds = 0.61519726 * EARTH_YEAR_IN_SECONDS;
            break;
        case "ZIEMIA":
            planetYearInSeconds = EARTH_YEAR_IN_SECONDS;
            break;
        case "MARS":
            planetYearInSeconds = 1.8808158 * EARTH_YEAR_IN_SECONDS;
            break;
        case "JUPITER":
            planetYearInSeconds = 11.862615 * EARTH_YEAR_IN_SECONDS;
            break;
        case "SATURN":
            planetYearInSeconds = 29.447498 * EARTH_YEAR_IN_SECONDS;
            break;
        case "URANUS":
            planetYearInSeconds = 84.016846 * EARTH_YEAR_IN_SECONDS;
            break;
        case "NEPTUNE":
            planetYearInSeconds = 164.79132 * EARTH_YEAR_IN_SECONDS;
            break;
        default:
            System.out.println("BLAD");
    }

    double ageInYears = seconds / planetYearInSeconds;
    ageInYears = Math.round(ageInYears * 100.0) / 100.0;
    System.out.println(ageInYears);
    return ageInYears;
    }
    
    public static int zad13(int[] arr) {
        {
            if (arr.length == 1) {
                return arr[0];
            } else {
                int max = zad13(Arrays.copyOfRange(arr, 1, arr.length)); 
                int result = arr[0] > max ? arr[0] : max; 
                return result;
            }
        }   

    }
    
}
