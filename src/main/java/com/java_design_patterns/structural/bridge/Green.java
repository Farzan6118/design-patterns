package com.java_design_patterns.structural.bridge;

public class Green implements Color {
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public String fill() {
        return ANSI_GREEN;
    }

}
