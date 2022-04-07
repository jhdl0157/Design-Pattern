package com.study.creationalpatterns.factory.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip","jhdl0157@naver.com");
        System.out.println(whiteship);
        Ship blackship = new BlackShipFactory().orderShip("WhiteShip","jhdl0157@naver.com");
        System.out.println(blackship);

    }

}