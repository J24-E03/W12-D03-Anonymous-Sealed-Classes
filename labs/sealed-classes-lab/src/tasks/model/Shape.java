package tasks.model;

public sealed class Shape permits Circle, Rectangle {
    double area() {
        return 0;
    }

    double perimeter() {
        return 0;
    }
}
