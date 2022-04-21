package com.company.items.gear.armor;

public class Chest extends Armor {


    public Chest(String item_name, int armorValue,float weight) {
        super(item_name, armorValue,weight);
    }

    @Override
    public int getArmorValue() {
        return armorValue;
    }



}
