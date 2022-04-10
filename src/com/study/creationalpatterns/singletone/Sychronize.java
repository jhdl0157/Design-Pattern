package com.study.creationalpatterns.singletone;

public class Sychronize {

    private static Sychronize instance;
    private Sychronize(){

    }
    //락을 가지고 하나씩의 쓰레드만 접근이 가능하다. 하지만 웹 앱 에서 성능이 안좋다.
    public static synchronized Sychronize getInstance(){
        if(instance==null){
            instance= new Sychronize();
        }
        return instance;
    }
}