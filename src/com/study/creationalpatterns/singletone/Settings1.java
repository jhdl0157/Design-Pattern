package com.study.creationalpatterns.singletone;

public class Settings1 {
    //멀티 쓰레드에 취약한 싱글톤
private static Settings1 instance;
private Settings1(){

}
public static Settings1 getInstance(){
    if(instance==null){
        instance= new Settings1();
    }
    return instance;
}
}
