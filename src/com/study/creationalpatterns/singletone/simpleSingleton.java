package com.study.creationalpatterns.singletone;

public class simpleSingleton {
    private simpleSingleton(){

    }
    public static simpleSingleton getSimplesingleton(){
        return  new simpleSingleton();
    }
}
