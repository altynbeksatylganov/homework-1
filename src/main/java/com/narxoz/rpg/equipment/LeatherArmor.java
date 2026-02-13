package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private final int defense;

    public LeatherArmor() {
        this.defense = 20;
    }

    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public String getArmorInfo(){
        return "Leather Armor (Ranger)";
    }


}


