import java.util.Random;
public class Hero {
    public int Herohealth;
    public int Herodamage;
    public int HerosuperPowerDamage;

    public int getHerohealth() {
        return Herohealth;
    }

    public void setHerohealth(int Herohealth) {
        this.Herohealth = Herohealth;
    }

    public int getHerodamage() {
        return Herodamage;
    }

    public void setHerosuperPowerDamage(int HerosuperPowerDamage) {
        this.HerosuperPowerDamage = HerosuperPowerDamage;
    }

    public void superpower() {
        Random random = new Random();
        int power = random.nextInt(5);
        if (power == 1) {
            System.out.println("using power: magic");

        }
        if(power == 2){
            System.out.println("using power: rasenshuriken");

        }

        if(power == 3) {
            System.out.println("using power: odama rasengan");

        }


        if(power == 4){
            System.out.println("using power: shadow cloning");

        }

        if(power == 5){
            System.out.println("using power: barion");

        }


    }
}