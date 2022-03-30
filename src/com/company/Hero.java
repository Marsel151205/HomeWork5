package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superPower;

    public Hero(int heroHealth, int heroDamage, String superPower){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superPower = superPower;
    }

    public Hero(int heroHealth, int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
