package com.study.creationalpatterns.abstractFactory.after;

import com.study.creationalpatterns.factory.after.Ship;
import com.study.creationalpatterns.factory.after.ShipFactory;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}

