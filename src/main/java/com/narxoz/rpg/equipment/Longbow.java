package com.narxoz.rpg.equipment;

public class Longbow implements Weapon{
    private final int damage;

    public Longbow(){
        this.damage = 30;
    }


    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getWeaponInfo(){
        return "Longbow (Ranger)";
    }


}
