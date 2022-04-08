package com.study.creationalpatterns.singletone;


public class Settings {
    private static Settings instance;
    private Settings(){

    }
    //더블 체킹 락킹 멀티 쓰레드의 안전하게 두법 체킹을 한다.
    public static Settings getInstance(){
        if(instance==null){
            synchronized (Settings.class){
                if(instance==null){
                    instance=new Settings();
                }
            }
        }
        return  instance;
    }
}
