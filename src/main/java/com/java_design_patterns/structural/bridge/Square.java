package com.java_design_patterns.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color.fill() + "■" + ANSI_RESET;
    }
}
