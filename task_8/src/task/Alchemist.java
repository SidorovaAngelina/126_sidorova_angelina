package task;

public class Alchemist extends BattleUnitBase{
    public Alchemist(String name, int maxHealth, int baseStrength, int maxArmor){
        super(name, maxHealth, baseStrength, maxArmor);
    }
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam){
        int minHealth=1000000000;
        int healthMax=0;

        BattleUnit minPlayer=ownTeam[0];
        BattleUnit maxPlayer=ownTeam[0];
        for(int i=0;i<ownTeam.length;i++){
            if(ownTeam[i].health()<minHealth && ownTeam[i].health()>0){
                minHealth=ownTeam[i].health();
                minPlayer=ownTeam[i];
            }
            else if(ownTeam[i].health()>healthMax && ownTeam[i].health()>0){
                healthMax=ownTeam[i].health();
                maxPlayer=ownTeam[i];
            }
        }
        minPlayer.heal(10);
        maxPlayer.setStrength(maxPlayer.strength()+1);
    }
    public void attack(BattleUnit other){
        other.setStrength(other.strength()-2);
        other.setMaxHealth(other.maxHealth()-4);
    }

}
