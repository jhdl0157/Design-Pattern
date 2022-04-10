package com.study.creationalpatterns.singletone;


public class doublechecking {
    private static doublechecking instance;
    private doublechecking(){

    }
    //더블 체킹 락킹 멀티 쓰레드의 안전하게 두법 체킹을 한다.
    public static doublechecking getInstance(){
        if(instance==null){
            synchronized (doublechecking.class){
                if(instance==null){
                    instance=new doublechecking();
                }
            }
        }
        return  instance;
    }
}
