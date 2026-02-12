package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor{
    private int defense;
    public PlateArmor(){
        this.defense = 30;
    }

    @Override
    public int getDefence() {
        return defense;
    }
    @Override
    public String getArmourInfo(){
        return "Plate Armor (Medieval)";
    }



}
