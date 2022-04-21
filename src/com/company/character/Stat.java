package com.company.character;

public class Stat {
    private int armor;
    private double damage;
    private Status status=Status.Healty;
    private float weight=0;



    public void checkStatus(int hp)
    {
        if (hp<=0)
        {
            status=Status.Dead;
        }else if(hp<50) {
            status=Status.Wounded;
        }else
            {
                status=Status.Healty;
            }
    }

    public boolean setWeight(float weight)
    {
        if(100>=this.weight+weight) {
            this.weight = this.weight + weight;
            return true;
        }else{
            return false;
        }

    }

    public float getWeight() {
        return weight;
    }

    public void setArmor(int armor)
    {
        this.armor=armor;
    }

    public void setDamage(double damage)
    {
        this.damage=damage;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return
                "armor="    + armor +
                ", damage=" + damage +
                ", Status=" + status;
    }
}
