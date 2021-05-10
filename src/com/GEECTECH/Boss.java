package com.GEECTECH;

public class Boss {
    private  int health;
    private  int damage;
    private  String megaDamage;
    public  Boss(int health,int damage,String megaDamage){
        this.health =  health;
        this.damage = damage;
        this.megaDamage =megaDamage;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getMegaDamage() {
        return megaDamage;
    }

    public void setMegaDamage(String megaDamage) {
        this.megaDamage = megaDamage;
    }
}
