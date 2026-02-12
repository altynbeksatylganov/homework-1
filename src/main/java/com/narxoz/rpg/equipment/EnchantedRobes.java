package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor{
    private int defense;
    public EnchantedRobes(){
        this.defense = 10;
    }

    @Override
    public int getDefence() {
        return defense;
    }
    @Override
    public String getArmourInfo(){
        return "Enchanted Robes (Magic)";
    }
}
