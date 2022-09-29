package com.java_design_patterns.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        Animal doggy = new Dog("wolfy", "woof", 20.0, 20.0);
        Animal tweet = new Bird("sparrow", "twitter", 2.0, 5.0);

        System.out.println(tweet);
        System.out.println(doggy);
    }
}
