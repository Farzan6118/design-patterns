package com.java_design_patterns.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color.fill() + "●" + ANSI_RESET;
    }
}
