package SealedClass;

public final class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // π * radius²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;    //2 * π * radius
    }
}

