package com.java_design_patterns.behavioral.strategy;

public class Bird extends Animal {

    public Bird(String birdName, String birdSound, Double weight, Double height) {
        this.setName(birdName);
        this.setWeight(weight);
        this.setHeight(height);
        this.setSound(birdSound);
        this.setFlyingAbility(new CanFly());
    }

}
