package com.java_design_patterns.structural.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " Adding features of Sports Car " + counter();
    }

    @Override
    public Integer price() {
        return super.price() + 150;
    }

    @Override
    public Integer counter() {
        return super.counter()+1;
    }
}
