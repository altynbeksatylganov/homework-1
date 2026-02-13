package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor{
    private final int defense;
    public PlateArmor(){
        this.defense = 30;
    }

    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public String getArmorInfo(){
        return "Plate Armor (Medieval)";
    }



}
