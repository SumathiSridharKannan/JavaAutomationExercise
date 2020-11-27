package org.oop.objectexamples;

public class Circle {
    private final String color = "Red";
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // method
    public double getArea() {
        return (Math.PI * radius * radius);

    }

}


