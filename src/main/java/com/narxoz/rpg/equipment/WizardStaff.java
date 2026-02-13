package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon{
    private final int damage;
    public WizardStaff() {
        this.damage = 15;
    }

    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic)";
    }




}
