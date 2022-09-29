package com.java_design_patterns.structural.decorator;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return this.car.assemble();
    }

    @Override
    public Integer price() {
        return this.car.price();
    }

    @Override
    public Integer counter() {
        return this.car.counter();
    }
}
