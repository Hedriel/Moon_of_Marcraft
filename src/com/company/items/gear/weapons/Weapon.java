package com.company.items.gear.weapons;

import com.company.items.gear.Gear;

public abstract class Weapon extends Gear {

    protected double damage;

    public Weapon(String item_name,int damage,float weight) {
        super(item_name,weight);
        this.damage=damage;
    }


    @Override
    public String toString() {
        return "{" +
                "item_name='" + item_name + '\'' +
                " | damage=" + damage +
                '}';
    }

    public abstract double getDamage();
}
