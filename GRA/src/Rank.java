public enum Rank {
    SZEREGOWY(1),
    KAPRAL(2),
    KAPITAN(3),
    MAJOR(4);

    int value;
    private Rank(int value) {
        this.value = value;
    }
    private static final Rank[] vals = values();

    public Rank next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }


}
