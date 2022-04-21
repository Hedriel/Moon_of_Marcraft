package com.company;

import com.company.character.Entity;
import com.company.items.Consumable;
import com.company.items.gear.Bag;
import com.company.items.gear.armor.*;

import com.company.items.gear.weapons.*;

public class Main{

    public static void main(String[] args) {
        //Crear Entidades
        Entity Jose = new Entity("Jose");
        Entity Marcelo = new Entity("Marcelo");




        //Crear Armas
        Axe gorehoul = new Axe("Gorehoul", 40, 20, 5);
        Bow frostbow = new Bow("Frostbow", 40, 5);
        Arrow frostarrow = new Arrow("Frostarrow", 15, 30, 5);
        //Crear Armaduras
        Chest breastplate = new Chest("Breastplate", 25, 5);
        Shoulder shoulder = new Shoulder("Shoulder", 5, 40);
        Head head = new Head("Helmet", 8, 5);
        Hand hand = new Hand("Hand", 5, 5);
        Leg leg = new Leg("Leg", 6, 5);
        //Crear Mochilas
        Bag linenbag = new Bag("linenbag", 0, 10);
        //Crear Consumible
        Consumable Steak = new Consumable("Steak",1,20,20);


        frostbow.equipArrows(frostarrow);

        Marcelo.equipItem(gorehoul);

        //Guardar Items en Mochila
        Jose.store(linenbag);
        Jose.storeInBag(breastplate,linenbag);
        Jose.storeInBag(frostbow,linenbag);
        Jose.store(gorehoul);
        //Equipar Items
        Jose.equipItem(head);
        Jose.equipItem(leg);
        Jose.equipItem(hand);

        Marcelo.attack(Jose);
        Jose.displayInfo();

        //Consumir items
        Jose.consume(Steak);

        Jose.displayInfo();
	     }
}
