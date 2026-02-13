package com.narxoz.rpg;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");
        demo("Ares", new WarriorFactory(), new MedievalEquipmentFactory());
        System.out.println("\n---\n");
        demo("Merlin", new MageFactory(), new MagicEquipmentFactory());
        System.out.println("\n---\n");
        demo("Robin", new ArcherFactory(), new RangerEquipmentFactory());

        System.out.println("\n=== Demo Complete ===");
    }

    private static void demo(String name, CharacterFactory characterFactory, EquipmentFactory equipmentFactory) {
        Character character = characterFactory.createCharacter(name);
        Weapon weapon = equipmentFactory.createWeapon();
        Armor armor = equipmentFactory.createArmor();

        character.displayStats();
        character.useSpecialAbility();


        System.out.println("Equipped Weapon: " + weapon.getWeaponInfo() + " | Damage: " + weapon.getDamage());
        System.out.println("Equipped Armor: " + armor.getArmorInfo() + " | Defense: " + armor.getDefense());

    }
}