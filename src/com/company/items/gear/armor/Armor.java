package com.company.items.gear.armor;

import com.company.items.gear.Gear;

public abstract class Armor extends Gear
{
    protected int armorValue;

    public Armor(String item_name, int armorValue,float weight) {
        super(item_name,weight);
        this.armorValue=armorValue;
    }


    @Override
    public String toString() {
        return

                "{item_name='" + item_name + '\'' +
                " | armorValue=" + armorValue +
                '}';
    }

    public abstract int getArmorValue();
}
