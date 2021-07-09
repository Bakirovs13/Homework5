package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setHerohealth(500);
        hero1.setHerodamage(50);
        hero1.setHerosuperPowerDamage(100);
        System.out.println("Hero health:" + hero1.getHerohealth());
        System.out.println("Hero damage: " + hero1.getHerodamage());
        System.out.println("Hero superpowerDamage: " + hero1.getHerosuperPowerDamage());


        Magicdoor door = new Magicdoor();

        Boss boss1 = new Boss();
        boss1.setBosshealth(700);
        boss1.setBossDamage(60);
        boss1.setBossDefenceType(120);
        System.out.println("Boss health:" + boss1.getBosshealth());
        System.out.println("Boss damage: " + boss1.getBossDamage());
        System.out.println("Boss DefenceType:" + boss1.getBossDefenceType());
        System.out.println("_________________________");
        int fight = 0;

        while (fight < 5) {
            fight = fight + 1;
            hero1.Herohealth = hero1.Herohealth - boss1.BossDamage;
            System.out.println("Hero health: " + hero1.Herohealth);
            boss1.Bosshealth = boss1.Bosshealth - hero1.Herodamage;
            System.out.println("Boss health:" + boss1.Bosshealth);
            System.out.println("____________________________");
            hero1.superpower();

            boss1.Defend();
            System.out.println("_____________________________");

        }

        if (hero1.Herohealth < 0) {
            System.out.println("Boss won");
        } else {
            System.out.println("Hero won");

        }






    }
}
