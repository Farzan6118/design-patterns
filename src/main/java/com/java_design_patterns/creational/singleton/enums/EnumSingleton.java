package com.java_design_patterns.creational.singleton.enums;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println("EnumSingleton called");
    }
}
