package com.company.items.gear.armor;

public class Shoulder extends Armor {


    public Shoulder(String item_name, int armorValue,float weight) {
        super(item_name, armorValue,weight);
    }

    @Override
    public int getArmorValue() {
        return armorValue;
    }

    }

