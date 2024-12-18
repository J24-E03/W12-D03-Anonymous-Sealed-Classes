package org.dcistudent.models;

public non-sealed class Rectangle extends Shape {
    private final Double length;
    private final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double area() {
        return this.length * this.width;
    }

    @Override
    public Double perimeter() {
        return 2 * (this.length + this.width);
    }
}
