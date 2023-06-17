import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {
    public int id;
    private ArrayList<Soldier> soldiers ;
    private int totalStrenght;

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    Army() {
        setSoldiers();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoldiers() {
        this.soldiers = new ArrayList<Soldier>();;
    }



    public int getTotalStrenght() {
        calculateTotalStrenght();
        return totalStrenght;
    }


    public void decresSoldiersExp() {
        List<Soldier> army = this.getSoldiers();
        for (Soldier soldier : army) {
            soldier.decresExp();
            if(soldier.getExperiance() > 1) {
                army.remove(soldier);
            }
        }
    };
    public void increaseSoldiersExp() {
        for (Soldier soldier : this.getSoldiers()) {
            soldier.incressExp();
        }
    };

    private void calculateTotalStrenght() {
        int totalStrenght = 0;
        for (Soldier soldier : this.getSoldiers()) {
            totalStrenght = totalStrenght + soldier.getStrenght();
        }
        this.totalStrenght = totalStrenght;
    }

    public Soldier killRandomSoldier() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.getSoldiers().size());
        Soldier solider =  this.getSoldiers().remove(randomIndex);
        return solider;
    }


    private void addSolder(Rank rank) {
        getSoldiers().add(new Soldier(rank));
    }




    public void addSoldiers(int amount, Rank rank){
        for (int i = 0; i < amount; i++) {
            addSolder(rank);
        }
    }

}
