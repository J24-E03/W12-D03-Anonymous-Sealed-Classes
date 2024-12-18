package org.example.shape;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public double area() {
        return getWidth() * getWidth();
    }

    @Override
    public double perimeter() {
        return 4 * getWidth();
    }
}
