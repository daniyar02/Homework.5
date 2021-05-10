package com.GEECTECH;

public class Main {


    public static void main(String[] args) {
        Boss Thanos = new Boss(500, 1000, "control of the five infinity stones  ");

        System.out.println("Thanos " + Thanos.getHealth() + " "
                + Thanos.getDamage() + " "
                + Thanos.getMegaDamage());

    }

    public static void createHeroes() {
        Hero Ironman = new Hero(50, 300, "mind");
        Hero Thor = new Hero(1500, 900, "lighting");
        Hero capitanAmerica = new Hero(200, 350);
String createHeroes [] ={"Ironman","Thor","capitanAmerica"};

    }
}