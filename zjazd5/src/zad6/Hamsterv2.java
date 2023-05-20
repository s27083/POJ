package zad6;

class Hamsterv2 implements Comparable<Hamsterv2> {
    private int hamsterNumber;
    private String hamsterName;

    Hamsterv2(int i, String name) {
        this.hamsterNumber = i;
        this.hamsterName = name;
    }

    @Override
    public int compareTo(Hamsterv2 obj2) {
        return Integer.compare(this.hamsterNumber, obj2.hamsterNumber);
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }
    public String hamsterName() {
        return " and his name is " +hamsterName;
    }
}
