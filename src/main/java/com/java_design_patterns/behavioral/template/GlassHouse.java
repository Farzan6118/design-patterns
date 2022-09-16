package com.java_design_patterns.behavioral.template;

public class GlassHouse extends HouseTemplate {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void buildWalls() {
        System.out.println(ANSI_BLUE + "Building Glass Walls" + ANSI_RESET);
    }

    @Override
    public void buildPillars() {
        System.out.println(ANSI_BLUE + "Building Pillars with glass coating" + ANSI_RESET);
    }
}
