package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor{
    private final int defense;
    public EnchantedRobes(){
        this.defense = 10;
    }

    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public String getArmorInfo(){
        return "Enchanted Robes (Magic)";
    }
}
