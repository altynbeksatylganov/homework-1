package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private int defense;

    public LeatherArmor() {
        this.defense = 20;
    }

    @Override
    public int getDefence() {
        return defense;
    }
    @Override
    public String getArmourInfo(){
        return "Leather Armor (Ranger)";
    }


}


