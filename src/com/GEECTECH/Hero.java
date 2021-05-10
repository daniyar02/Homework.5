package com.GEECTECH;

public class Hero {
    private int health;
    private int damage;
    private String superDamage;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String superDamage) {
        this.health = health;
        this.damage = damage;
        this.superDamage = superDamage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperDamage() {
        return superDamage;
    }

    public int getDamage() {
        return damage;
    }

    public static void createHeroes() {
        Hero Ironman = new Hero(50, 300, "mind");
        Hero Thor = new Hero(1500, 900, "lighting");
        Hero capitanAmerica = new Hero(200, 350);
        String createHeroes[] = {"Ironman", "Thor", "capitanAmerica"};
    }
    String [] heroes = {}
}
