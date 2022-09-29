package com.java_design_patterns.behavioral.strategy;

public class Dog extends Animal {

    public Dog(String dogName, String dogSound, Double weight, Double height) {
        this.setName(dogName);
        this.setWeight(weight);
        this.setHeight(height);
        this.setSound(dogSound);
        this.setFlyingAbility(new CanNotFly());
    }

}
