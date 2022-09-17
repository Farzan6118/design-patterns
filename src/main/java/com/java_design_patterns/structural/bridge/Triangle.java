package com.java_design_patterns.structural.bridge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color.fill() + "▲" + color.fill();
    }
}
