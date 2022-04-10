package com.study.creationalpatterns.singletone;

public class EagerInitialization {
    //이른 초기화로 아예 먼저 생성을 한다. 객체 생성이 적은 리소스로 완성이 가능하다면
    private static final EagerInitialization INSTANCE=new EagerInitialization();
    private EagerInitialization(){

    }
    public static  EagerInitialization getInstance(){
        return INSTANCE;
    }
}


