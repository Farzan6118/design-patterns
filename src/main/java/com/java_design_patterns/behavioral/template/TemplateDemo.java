package com.java_design_patterns.behavioral.template;

public class TemplateDemo {

    public static void main(String[] args) {

        HouseTemplate houseTemplate1 = new GlassHouse();
        houseTemplate1.buildHouse();

        HouseTemplate houseTemplate2 = new WoodenHouse();
        houseTemplate2.buildHouse();

    }

}
