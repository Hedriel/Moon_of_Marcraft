package com.company.items.gear;

import com.company.items.Item;

import java.util.ArrayList;

public class Bag extends Item {
    private final int SLOTS;
    private ArrayList<Item> bag=new ArrayList<>();
    public Bag(String item_name, float weight, int slots) {
        super(item_name, weight);
        this.SLOTS = slots;
    }

    public void store(Item item)
    {
        if (SLOTS>bag.size())
        {
            this.bag.add(item);
        }
    }

    public void openInventory()
    {
        System.out.println("{item_name= " +"'"+ item_name + "'}");
        for (Item item:bag)
        {
            System.out.println("---"+item.toString());
        }
    }


    public String toString()
    {
        openInventory();
        return "";
    }
}
