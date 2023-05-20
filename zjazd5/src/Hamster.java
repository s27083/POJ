class Hamster {
    private int hamsterNumber;
    private String hamsterName;
    Hamster(int i,String name) {
        hamsterNumber = i;
        hamsterName = name;
    }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }

    public String getHamsterName() {
        return hamsterName;
    }

    public String hamsterName() {
        return " and his name is " +hamsterName;
    }
}