package SealedClass;

final class Square extends Rectangle {

    // Constructor, passing the side to the Rectangle constructor
    public Square(double side) {
        super(side, side);  // A square is a special rectangle with equal sides
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return 4 * super.area() / super.perimeter(); // perimeter = 4 * side
    }
}


