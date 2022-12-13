package com.java_design_patterns.behavioral.strategy;

public class CanNotFly extends Flying {

    @Override
    public String Fly() {
        return "can NOT fly";
    }
}
