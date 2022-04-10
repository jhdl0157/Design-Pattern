package com.study.creationalpatterns.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        simpleSingleton settings = simpleSingleton.getSimplesingleton();
//        simpleSingleton settings1 = simpleSingleton.getSimplesingleton();
//        System.out.println(settings==settings1);
        Settings1 settings11=Settings1.getInstance();
        Settings1 settings12=Settings1.getInstance();
        System.out.println(settings11 == settings12);

        //이넘타입의 싱글톤
        EnumSettins settins=EnumSettins.INSTANCE;
        //리플렉션으로 인스턴스 생성하기
        Constructor<EnumSettins> constructor = EnumSettins.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSettins settins1=constructor.newInstance();
        System.out.println(settins==settins1);
    }

}
