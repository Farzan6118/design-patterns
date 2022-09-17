package com.java_design_patterns.structural.bridge;

public abstract class Shape {
    protected String ANSI_RESET = "\u001B[0m";
    protected Color color;


    public abstract String draw();
}
