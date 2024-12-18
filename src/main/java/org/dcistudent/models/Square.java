package org.dcistudent.models;

public class Square extends Rectangle {
    public Square(Double side) {
        super(side, side);
    }

    @Override
    public Double area() {
        return Math.pow(super.area(), 2);
    }

    @Override
    public Double perimeter() {
        return 4 * super.perimeter();
    }
}
