package com.company.items.gear.weapons;

public class Sword extends Weapon {


    public Sword(String item_name, int damage,float weight) {
        super(item_name, damage,weight);
    }



    public double getDamage()
    {
        return damage;
    }


}
