package com.study.creationalpatterns.abstractFactory.after;

import com.study.creationalpatterns.factory.after.WhiteShip;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
