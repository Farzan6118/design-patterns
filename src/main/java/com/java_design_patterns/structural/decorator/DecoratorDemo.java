package com.java_design_patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Car sportsCar = new SportsCar(new SportsCar(new LuxuryCar(new CarImpl())));
        System.out.println(sportsCar.assemble() + " the price will be " + sportsCar.price());
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new CarImpl()));
        System.out.println(sportsLuxuryCar.assemble() + " the price will be " + sportsLuxuryCar.price());

    }
}
