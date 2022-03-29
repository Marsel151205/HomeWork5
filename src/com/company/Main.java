package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(50);
        boss.setDefenceType("Magical");
        System.out.println("Здоровье Босса: " + boss.getBossHealth() + "   Урон Босса: " + boss.getBossDamage()
        + "  Тип защиты: " + boss.getDefenceType());
    }
}
