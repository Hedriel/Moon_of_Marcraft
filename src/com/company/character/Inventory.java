package com.company.character;

import com.company.items.Item;
import com.company.items.gear.Bag;

import java.util.ArrayList;

public class Inventory {
    private static final int SLOTS=20;
    private ArrayList<Item> mainBag=new ArrayList<>();

    public void store(Item item)
    {
        if (SLOTS>mainBag.size())
        {
            this.mainBag.add(item);
        }else
            {
                System.err.println("Inventory is Full");
            }

    }

    public void openInventory()
    {
        System.out.println("ITEMS IN BACKPACK");
        for (Item item:mainBag)
        {
            System.out.println(item.toString());
        }
    }

    public void sockOnBag(Item item, Bag bag)
    {
        bag.store(item);
    }
}
