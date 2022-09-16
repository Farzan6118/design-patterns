package com.java_design_patterns.behavioral.template;

public class WoodenHouse extends HouseTemplate {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void buildWalls() {
        System.out.println(ANSI_GREEN + "Building Wooden Walls" + ANSI_RESET);
    }

    @Override
    public void buildPillars() {
        System.out.println(ANSI_GREEN + "Building Pillars with Wood coating" + ANSI_RESET);
    }
}
