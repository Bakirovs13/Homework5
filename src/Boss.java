import java.util.Random;

public class Boss {
    public int Bosshealth;
    public int BossDamage;
    public int BossDefenceType;

    public int getBosshealth(){
        return Bosshealth;
    }
    public void setBosshealth(int Bosshealth){this.Bosshealth = Bosshealth;}
    public int getBossDamage(){return BossDamage;}
    public int getBossDefenceType(){  return BossDefenceType;}
    public void setBossDefenceType(int BossDefenceType){this.BossDefenceType=BossDefenceType;}
    public void Defend(){
        Random random = new Random();
        int a = random.nextInt(5);
        if(a == 1){
            System.out.println(" power: magic");
        }
        if(a == 2){
            System.out.println(" power: magic");

        }

        if(a == 3) {
            System.out.println(" power: magic");

        }

        if(a == 4){
            System.out.println(" power: magic");

        }

        if(a == 5){
            System.out.println(" power: magic");

        }
    }



}
