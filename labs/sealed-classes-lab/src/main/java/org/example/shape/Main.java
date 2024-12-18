package org.example.shape;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        makeCircle();
        makeRectangle();
        makeSquare();
        makeTriangle();
    }



    private static void makeCircle() {
        System.out.println("Making A Circle:");
        do {
            try {
                System.out.println("Please enter the radius of the circle:");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                Circle circle = new Circle(radius);

                System.out.printf("The Area of the circle with radius: %.2f is %.2f.",
                        circle.getRadius(), circle.area());
                System.out.printf("\nThe Perimeter of the circle with radius: %.2f is %.2f.\n",
                        circle.getRadius(), circle.perimeter());
                return;
            } catch (Exception e) {
                System.out.println("Invalid Input.");
                scanner.nextLine();
            }
        } while (true);
    }

    private static void makeRectangle() {
        System.out.println("\nMaking a Rectangle:");
        do {
            try {
                System.out.println("Please enter width of the rectangle:");
                double width = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please enter height of the rectangle:");
                double height = scanner.nextDouble();
                scanner.nextLine();
                Rectangle rectangle = new Rectangle(width, height);

                System.out.printf("The Area of a rectangle with width: %.2f and height: %.2f is: %.2f.",
                        rectangle.getWidth(), rectangle.getHeight(), rectangle.area());
                System.out.printf("\nThe Perimeter of a rectangle with width: %.2f and height: %.2f is %.2f.\n",
                        rectangle.getWidth(), rectangle.getHeight(), rectangle.perimeter());
                return;
            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        } while (true);
    }

    private static void makeSquare() {
        System.out.println("\nMaking a Square:");
        do {
            try {
                System.out.println("Please enter the side of the rectangle:");
                double side = scanner.nextDouble();
                scanner.nextLine();
                Square square = new Square(side);

                System.out.printf("The Area of the square with side: %.2f is %.2f.",
                        square.getSide(), square.area());
                System.out.printf("\nThe Perimeter of the square with side: %.2f is %.2f.\n",
                        square.getSide(), square.perimeter());
                return;
            } catch (Exception e) {
                System.out.println("Invalid Input.");
                scanner.nextLine();
            }
        } while (true);
    }

    private static void makeTriangle() {
        System.out.println("\nMaking a Triangle:");
        do {
            try {
                System.out.println("Please enter the base of the triangle:");
                double base = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Please enter the height of the triangle:");
                double height = scanner.nextDouble();
                scanner.nextLine();

                Triangle triangle = new Triangle(base, height);

                System.out.printf("The Area of the triangle with base: %.2f and height: %.2f is %.2f.",
                        triangle.getBase(), triangle.getHeight(), triangle.area());

                System.out.printf("\nThe Perimeter of the triangle with base: %.2f and height: %.2f is %.2f.",
                        triangle.getBase(), triangle.getHeight(), triangle.perimeter());

                return;
            } catch (Exception e) {
                System.out.println("Invalid Input.");
                scanner.nextLine();
            }
        } while (true);
    }
}