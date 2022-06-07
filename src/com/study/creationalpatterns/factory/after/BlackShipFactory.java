package com.study.creationalpatterns.factory.after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {

    }
}
