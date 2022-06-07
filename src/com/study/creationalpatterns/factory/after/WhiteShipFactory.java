package com.study.creationalpatterns.factory.after;

public class WhiteShipFactory implements ShipFactory{
    @Override
    //배를 만드는 부분을 구현
    public Ship createShip() {
   //여기에 화이트쉽만의 특별한 공정을 추가하면 된다.
        return new WhiteShip();
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {

    }


    //새로운 기능을 넣을려면 코드가 고쳐져야한다. 변경에 닫혀져있는 객체지향의 원치 위반 만들어지는 과정이 이리저리 산만해서 코드 가독성이 떨어진다.
//    public static Ship orderShip(String name, String email) {
//        // validate
//        if (name == null || name.isBlank()) {
//            throw new IllegalArgumentException("배 이름을 지어주세요.");
//        }
//        if (email == null || email.isBlank()) {
//            throw new IllegalArgumentException("연락처를 남겨주세요.");
//        }
//
//        prepareFor(name);
//        //쉡을 만든는 과정을 하위 클래스에게 위임을 한다.
//        Ship ship = new Ship();
//        ship.setName(name);
//
//        // Customizing for specific name
//        if (name.equalsIgnoreCase("whiteship")) {
//            ship.setLogo("\uD83D\uDEE5️");
//        } else if (name.equalsIgnoreCase("blackship")) {
//            ship.setLogo("⚓");
//        }
//
//        // coloring
//        if (name.equalsIgnoreCase("whiteship")) {
//            ship.setColor("whiteship");
//        } else if (name.equalsIgnoreCase("blackship")) {
//            ship.setColor("black");
//        }
//
//        // notify
//        sendEmailTo(email, ship);
//
//        return ship;
//    }
//
//    private static void prepareFor(String name) {
//        System.out.println(name + " 만들 준비 중");
//    }
//
//    private static void sendEmailTo(String email, Ship ship) {
//        System.out.println(ship.getName() + " 다 만들었습니다.");
//    }

}
