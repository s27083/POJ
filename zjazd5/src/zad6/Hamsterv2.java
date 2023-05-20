package zad6;

class Hamsterv2 implements Comparable<Hamsterv2> {
    private int hamsterNumber;
    private String name;

    Hamsterv2(int i, String name) {
        this.hamsterNumber = i;
        this.name = name;
    }

    @Override
    public int compareTo(Hamsterv2 obj2) {
        return Integer.compare(this.hamsterNumber, obj2.hamsterNumber);
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + " named: " + name;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }
}
