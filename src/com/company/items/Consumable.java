package com.company.items;

public class Consumable extends Item {
    private int uses;
    private float healing;

    public Consumable(String item_name,float weight,int uses,float healing) {
        super(item_name,weight);
        this.uses=uses;
        this.healing=healing;
    }

    public float getHealing(){
        return healing;
    }

    public int getUses() {
        return uses;
    }
}
