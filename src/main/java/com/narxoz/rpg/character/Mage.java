package com.narxoz.rpg.character;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    public Mage(String name) {
        this.name = name;
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
    }
public String getName(){
        return name;
}

public void displayStats(){
    System.out.println("=== " + name + " (Mage) ===");
    System.out.println("Health: "+health);
    System.out.println("Mana: "+mana);
    System.out.println("Strength: " + strength);
    System.out.println("Intelligence: " +intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + "casts FIREBALL");
    }
}
