package SealedClass;

public class Main {
    public static void main(String[] args) {
        //creating a circle object
        Shape circle = new Circle(4.0);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        //Creating a rectangle object
        Shape rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        //Creating a square object
        Shape square = new Square(5.0);
        System.out.println("Square Area : " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
