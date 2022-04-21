package com.company.character;
import com.company.items.gear.armor.*;
import com.company.items.gear.weapons.Weapon;

public class Equipment {
    private Head head;
    private Shoulder shoulder;
    private Chest chest;
    private Hand hand;
    private Leg leg;
    private Weapon weapon;



    public void equipItem(Chest chest)
    {
        this.chest=chest;
    }

    public void equipItem(Shoulder shoulder)
    {
        this.shoulder=shoulder;
    }

    public void equipItem(Weapon weapon)
    {
        this.weapon=weapon;
    }

    public void equipItem(Head head)
    {
        this.head=head;
    }

    public void equipItem(Leg leg)
    {
        this.leg=leg;
    }

    public void equipItem(Hand hand)
    {
        this.hand=hand;
    }



    public Chest unEquipChest()
    {
        Chest item=this.chest;
        this.chest=null;
        return item;
    }

    public Shoulder unEquipShoulder()
    {
        Shoulder item=this.shoulder;
        this.shoulder=null;
        return item;
    }

    public Weapon unEquipWeapon()
    {
        Weapon item=this.weapon;
        this.weapon=null;
        return item;
    }

    public Head unEquipHead()
    {
        Head item=this.head;
        this.head=null;
        return item;
    }

    public Hand unEquipHand()
    {
        Hand item=this.hand;
        this.hand=null;
        return item;
    }

    public Leg unEquipLeg()
    {
        Leg item=this.leg;
        this.leg=null;
        return item;
    }

    public int getTotalArmor()
    {
        int totalArmor=0;
        if (chest!=null)
        {
            totalArmor+=chest.getArmorValue();
        }
        if (head!=null)
        {
            totalArmor+=head.getArmorValue();
        }
        if (shoulder!=null)
        {
            totalArmor+=shoulder.getArmorValue();
        }
        if (hand!=null)
        {
            totalArmor+=hand.getArmorValue();
        }
        if (leg!=null)
        {
            totalArmor+=leg.getArmorValue();
        }
        return totalArmor;
    }

    public double getDamage()
    {
        if (weapon!=null)
        {
            return this.weapon.getDamage();
        }
      return 5;
    }

    public String display() {
        return "\nEQUIPMENT:" +"\n" +
                "Chest=" + chest +"\n" +
                "Shoulder=" + shoulder+"\n"+
                "Weapon=" + weapon+"\n"+
                "Head=" + head +"\n"+
                "Leg=" + leg +"\n"+
                "hand=" + hand +"\n";
    }
}
