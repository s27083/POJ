public class Soldier {
    public int id;
    public Rank rank;
    private int experiance =1;
    private int strenght;
    boolean alive = true;

    Soldier(Rank rank) {
        setRank(rank);
        setId();
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public void setId() {
        this.id = (int) Math.round( Math.random());
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public Rank getRank() {
        return rank;
    }
    public int getRankValue() {
        return rank.value;
    }


    public int getExperiance() {
        return experiance;
    }

    public void decresExp() {
        this.experiance = this.experiance -1;
        if(this.experiance < 1) {
            this.alive = false;
        }
    }
    public void incressExp() {
        this.experiance = this.experiance +1;
        if(experiance == getRankValue() * 5) {
            this.rank = increseRank(this);
            this.experiance = 1;
        }
    }

    public Rank increseRank(Soldier soldier) {
        Rank currentRank = soldier.rank;
        return currentRank;
    };
    private void updateStrenght() {
        this.strenght = getRankValue() * this.experiance;

    }

    public int getStrenght() {
        updateStrenght();
        return this.strenght;
    }
}
