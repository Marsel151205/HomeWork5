package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(50);
        boss.setDefenceType("Magical");
        System.out.println("Здоровье Босса: " + boss.getBossHealth() + "   Урон Босса: " + boss.getBossDamage()
                + "  Тип защиты: " + boss.getDefenceType());
       // System.out.println(createHeroes());
        for (Hero hero: createHeroes()) {
            System.out.println(hero.getHeroHealth() + " [" + hero.getHeroDamage() +"] " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero warrior = new Hero(250,30,"Battle Cry");

        Hero ninja = new Hero(180, 20, "Destruction");

        Hero mage = new Hero(220, 35, "Icing");

        return new Hero[]{warrior, ninja, mage};
    }
}
