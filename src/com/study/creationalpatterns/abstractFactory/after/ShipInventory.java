package com.study.creationalpatterns.abstractFactory.after;

import com.study.creationalpatterns.factory.after.Ship;
import com.study.creationalpatterns.factory.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args){
        ShipFactory shipFactory =new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship=shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());

        System.out.println(ship.getWheel().getClass());
    }
}
