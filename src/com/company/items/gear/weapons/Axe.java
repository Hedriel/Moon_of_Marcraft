package com.company.items.gear.weapons;

import java.util.Random;

public class Axe extends Weapon{
    private double critChance;

    public Axe( String item_name, int damage,int critChance,float weight) {
        super(item_name, damage,weight);
        this.critChance=critChance;
    }


    private double isCritical()
    {
       int throwADice = new Random().nextInt(99);
       if (this.critChance>=throwADice)
        {
            return damage*2;
        }
       return damage;
    }


    @Override
    public double getDamage() {
        return isCritical();
    }



}
