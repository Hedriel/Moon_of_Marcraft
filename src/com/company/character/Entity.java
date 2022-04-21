package com.company.character;

import com.company.items.Consumable;
import com.company.items.Item;
import com.company.items.gear.Bag;
import com.company.items.gear.armor.*;
import com.company.items.gear.weapons.Axe;
import com.company.items.gear.weapons.Bow;

public class Entity {
    private String name;
    private float life=50;
    private Stat stats;
    private Inventory inventory;
    private Equipment equipment;


    public Entity(String name) {
        this.name = name;
        stats = new Stat();
        inventory = new Inventory();
        equipment = new Equipment();
    }

    public void store(Item item)
    {
        if (stats.setWeight(item.getWeight()))
        {
        inventory.store(item);
        }else
        {
            System.err.println("Cannot equip: "+item.getItem_name()+" You have reached you maximum weight");
        }
    }
    public void storeInBag(Item item,Bag bag)
    {
        if (stats.setWeight(item.getWeight()))
        {
             inventory.sockOnBag(item,bag);
        }else
            {
                System.out.println("Cannot equip: "+item.getItem_name()+"You have reached you maximum weight");
            }
    }

    public void openBackpack()
    {
        System.out.println("--------------Displaying Inventory--------------");
        inventory.openInventory();
        System.out.println("Total Weight= "+stats.getWeight()+" Maximum Weigh = 100");
        System.out.println("----------------------------");
    }

    public void equipItem(Axe axe)
    {

        equipment.equipItem(axe);
        updateStats();

    }
    public void equipItem(Bow bow)
    {
        equipment.equipItem(bow);
        updateStats();
    }
    public void equipItem(Chest chest)
    {
        equipment.equipItem(chest);
        updateStats();
    }
    public void equipItem(Shoulder shoulder)
    {
        equipment.equipItem(shoulder);
        updateStats();
    }
    public void equipItem(Head head)
    {
        equipment.equipItem(head);
        updateStats();
    }
    public void equipItem(Hand hand)
    {
        equipment.equipItem(hand);
        updateStats();
    }
    public void equipItem(Leg leg)
    {
        equipment.equipItem(leg);
        updateStats();
    }

    public void unEquipHead()
    {
        store(equipment.unEquipHead());
    }
    public void unEquipHand()
    {
        store(equipment.unEquipHand());
    }
    public void unEquipLeg()
    {
        store(equipment.unEquipLeg());
    }

    public void unEquipShoulder()
    {
        store(equipment.unEquipShoulder());
    }
    public void unEquipChest()
    {
        store(equipment.unEquipChest());
    }

    public void consume(Consumable item) {
        if (item.getUses()!=0)
        {
            if (life+item.getHealing()>=100)
            {
                life=100;
            }else{
            life+=item.getHealing();
            System.err.println("AMOUNT HEALED = "+item.getHealing());
            }
        }
    }

    public void attack(Entity player)
    {
       float totaldmg= (float) (equipment.getDamage()-player.stats.getArmor());
       player.life=player.life-totaldmg;
       player.stats.checkStatus((int) player.life);

       System.err.println("Damage Dealt = "+totaldmg);
    }




    public void displayInfo()
    {

       System.out.println(name +":\n"+"Hp:"+this.life+"\n"+ equipment.display());

       System.out.println("STATS: "+stats.toString()+"\n");
    }


    private void updateStats()
    {
        stats.setArmor(equipment.getTotalArmor());
        stats.setDamage(equipment.getDamage());
    }


}

