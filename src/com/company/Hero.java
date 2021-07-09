package com.company;

import java.util.Random;

public class Hero {        //Создать класс Игрока (Hero)
    public int Herohealth;             //с переменной уровня класса для здоровья
    public int Herodamage;            //количество наносимого им урона (сила атаки)
    public int HerosuperPowerDamage;  //типом суперспособности (int

    public int getHerohealth() {      //Написать конструктор для создания объекта
        return Herohealth;
    }

    public void setHerohealth(int Herohealth) {
        this.Herohealth = Herohealth;
    }

    public int getHerodamage() {
        return Herodamage;
    }
    public void setHerodamage(int Herodamage){
        this.Herodamage=Herodamage;
    }


    public void setHerosuperPowerDamage(int HerosuperPowerDamage) {
        this.HerosuperPowerDamage = HerosuperPowerDamage;
    }
    public int getHerosuperPowerDamage(){
        return HerosuperPowerDamage;
    }

    public void superpower() {
        Random random = new Random();
        int power = random.nextInt(5);
        if (power == 1) {
            System.out.println("using power: magic");

        }
        if(power == 2){
            System.out.println("using power: magic");

        }

        if(power == 3) {
            System.out.println("using power:magic");

        }


        if(power == 4){
            System.out.println("using power: magic");

        }

        if(power == 5){
            System.out.println("using power: magic");

        }


    }
}
