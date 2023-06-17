import java.util.Date;

public class Action {
    public int id;
    public Date date;
    public General general;
    public Secretary secretary;
    public boolean checkGold(General general) throws Exception {
        int battleCost = 0;
        for (Soldier soldier : general.getArmy().getSoldiers()) {
            battleCost = battleCost + soldier.getRankValue();
        }

        if(!general.checkGold(battleCost)) throw new Exception("General " + general.getId() + " " + general.getName() + " doesn't have enough gold to attack");

        return true;
    }


}
