package com.java_design_patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeDemo {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle(new Red()));
        shapeList.add(new Triangle(new Green()));
        shapeList.add(new Triangle(new Blue()));
        shapeList.add(new Square(new Blue()));
        shapeList.add(new Square(new Red()));
        shapeList.add(new Square(new Green()));
        shapeList.add(new Circle(new Green()));
        shapeList.add(new Circle(new Blue()));
        shapeList.add(new Circle(new Red()));
        shapeList.forEach(shape -> System.out.print(shape.draw() + " "));
    }
}
