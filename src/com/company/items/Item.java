package com.company.items;

public abstract class Item {
    protected String item_name;
    protected float weight;

    public Item(String item_name,float weight) {
        this.item_name = item_name;
        this.weight=weight;
    }

    public float getWeight()
    {
        return weight;
    }

    public String getItem_name() {
        return item_name;
    }
}
