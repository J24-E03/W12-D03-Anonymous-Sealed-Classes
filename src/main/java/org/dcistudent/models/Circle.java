package org.dcistudent.models;

public final class Circle extends Shape {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public Double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
