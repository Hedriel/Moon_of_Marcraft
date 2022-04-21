package com.company.items.gear.weapons;

public class Arrow extends Weapon {
    private int stock;

    public Arrow(String item_name, int damage,int stock,float weight) {
        super(item_name, damage,weight);
        this.stock=stock;
    }

    @Override
    public double getDamage() {
        return damage;
    }


    @Override
    public String toString() {
        return "Arrow{" +
                "stock=" + stock +
                ", damage=" + damage +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
