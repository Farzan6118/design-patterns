package com.java_design_patterns.behavioral.template;

public abstract class HouseTemplate {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println(ANSI_RED + "House is built." + ANSI_RESET);
    }

    //default implementation
    private void buildWindows() {
        System.out.println(ANSI_YELLOW + "Building Glass Windows" + ANSI_RESET);
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println(ANSI_YELLOW + "Building foundation with cement,iron rods and sand" + ANSI_RESET);
    }
}
