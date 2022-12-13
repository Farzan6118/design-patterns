package com.java_design_patterns.structural.bridge;

public class Red implements Color {
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public String fill() {
        return ANSI_RED;
    }
}
