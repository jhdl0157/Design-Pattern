package com.study.creationalpatterns.singletone;

//레이지 로딩도 가능하고 더블 체킹처럼 복잡하지 않고 간단하게 구현이 가능
public class StaticInnerClass {
    private StaticInnerClass() {}

    private static class SettingsHolder {
        private static final StaticInnerClass INSTANCE=new StaticInnerClass();
    }
    public static StaticInnerClass getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
