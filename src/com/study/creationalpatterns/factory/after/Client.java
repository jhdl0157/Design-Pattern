package com.study.creationalpatterns.factory.after;

public class Client implements printShip {

    public static void main(String[] args) {
        //변경후
        Client client=new Client();
        client.print(new WhiteShipFactory(),"WhiteShip","jhdl0157@naver.com");
        client.print(new BlackShipFactory(),"BlackShip","jhdl0157@naver.com");


        //클라이언트의 코드가 변경되는 문제
//        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip","jhdl0157@naver.com");
//        System.out.println(whiteship);
//        Ship blackship = new BlackShipFactory().orderShip("WhiteShip","jhdl0157@naver.com");
//        System.out.println(blackship);

    }


}