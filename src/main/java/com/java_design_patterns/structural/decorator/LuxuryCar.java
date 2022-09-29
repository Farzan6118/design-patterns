package com.java_design_patterns.structural.decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " Adding features of Luxury Car "+ counter();
    }

    @Override
    public Integer price() {
        return super.price() + 200;
    }

    @Override
    public Integer counter() {
        return super.counter()+1;
    }
}
