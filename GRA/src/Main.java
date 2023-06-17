public class Main {
    public static void main(String[] args) {
        General Kamil = new General("Kamil");
        General Wiki = new General("Wiki");
        try {
            Kamil.buySolider(2,Rank.KAPRAL);
            Wiki.buySolider(3,Rank.KAPRAL);
            Kamil.attack(Wiki);

        }
        catch (Exception err) {
            System.err.println(err);
            return;
        }


    }
}