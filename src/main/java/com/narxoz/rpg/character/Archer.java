package com.narxoz.rpg.character;

public class Archer implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
     public Archer(String name){
         this.name = name;
         this.health = 100;
         this.mana = 60;
         this.strength = 60;
         this.intelligence = 50;
     }
    public String getName(){
         return name;
    }
    public void displayStats(){
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: "+health);
        System.out.println("Mana: "+mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " +intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name+"uses MULTI SHOT!");
    }
}
