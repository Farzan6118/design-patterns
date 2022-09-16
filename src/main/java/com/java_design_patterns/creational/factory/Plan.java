package com.java_design_patterns.creational.factory;

public abstract class Plan {
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.err.println(units * rate);
    }
}