import java.util.List;

public class General {
    public String name;
    public int id;
    private int goldCoins = 100;
    public Army army;

    General(String name) {
        setName(name);
        setArmy(new Army());
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Army getArmy() {
        return army;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGoldCoins(int goldCoins) throws Exception {

        if (goldCoins > -1) {
            this.goldCoins = goldCoins;
        }
        else {
            throw new Exception("Gold cannot fall below zero");
        }

    }

    public int removeGoldCoins(int amount) throws IllegalArgumentException {
        if(amount < 1) {
            throw new IllegalArgumentException("gold value must be positive");
        }
        this.goldCoins = goldCoins - amount;
        return this.goldCoins;
    }
    public int addGoldCoins(int amount) throws IllegalArgumentException {
        if(amount < 1) {
            throw new IllegalArgumentException("gold value must be positive");
        }
        this.goldCoins = goldCoins + amount;
        return this.goldCoins;
    }

    public Battle attack(General target) throws Exception {
        try {
            return new Battle(this,target);
        }
        catch (Exception err) {
            throw new Exception(err);
        }
    };

    public void buySolider(int amount, Rank rank) throws Exception {
        int cost = (int) Math.round(rank.value * amount * 10);
        if(!checkGold(cost)) {
            throw new Exception("This general cannot afford this action");
        }
        this.removeGoldCoins(cost);
        getArmy().addSoldiers(amount,rank);
    }

    public boolean checkGold(int cost) {
        if(getGoldCoins() < cost) return false;
        return true;
    }
    public void trainSoldiers() {

    }

    public void showArmy() {
        System.out.println(this.getArmy().getSoldiers());
    }

}
