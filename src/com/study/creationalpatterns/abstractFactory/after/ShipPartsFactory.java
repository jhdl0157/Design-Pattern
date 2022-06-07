package com.study.creationalpatterns.abstractFactory.after;


//추상팩토리
public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();

}
