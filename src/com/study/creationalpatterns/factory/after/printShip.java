package com.study.creationalpatterns.factory.after;

public interface printShip {
    default void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }
}
