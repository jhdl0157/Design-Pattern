package com.study.creationalpatterns.abstractFactory.after;

import com.study.creationalpatterns.factory.after.Ship;
import com.study.creationalpatterns.factory.after.ShipFactory;
import com.study.creationalpatterns.factory.after.WhiteShip;

public class WhiteshipFactory extends  DefaultShipFactory{
    private ShipPartsFactory shipPartsFactory;
    public WhiteshipFactory(ShipPartsFactory shipFactory){
        this.shipPartsFactory=  shipFactory;
    }
    @Override
    public Ship createShip() {
       Ship ship=new WhiteShip();
       ship.setAnchor(shipPartsFactory.createAnchor());
       ship.setWheel(shipPartsFactory.createWheel());
       return ship;
    }
}
