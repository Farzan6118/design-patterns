package com.java_design_patterns.structural.bridge;

public class Blue implements Color {
    public static final String ANSI_BLUE = "\u001B[34m";

    @Override
    public String fill() {
        return ANSI_BLUE;
    }

}
