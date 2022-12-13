package com.java_design_patterns.structural.decorator;

public class CarImpl implements Car {


    @Override
    public String assemble() {
        return "Basic Car " + counter();
    }

    @Override
    public Integer price() {
        return 100;
    }

    @Override
    public Integer counter() {
        return 1;
    }
}
