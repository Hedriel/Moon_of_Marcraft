package com.company.items.gear.weapons;

import java.util.ArrayList;

public class Bow extends Weapon {
    private Arrow arrow;

    public Bow(String item_name, int damage,float weight) {
        super(item_name, damage,weight);
    }



    public void equipArrows(Arrow arrow)
    {
        this.arrow=arrow;
    }


    public double getDamage()
    {
        if (arrow!=null)
        {
            return damage+arrow.damage;
        }else
            {
            return damage;
            }
    }

    @Override
    public String toString() {
        return  "{item_name='" + item_name + '\'' +
                "arrow=" + arrow +
                ", damage=" + damage +
                '}';
    }
}
