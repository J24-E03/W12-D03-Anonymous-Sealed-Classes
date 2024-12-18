package tasks;

import tasks.model.*;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Circle circle = new Circle(200);
        Rectangle rectangle = new Rectangle(300, 400);
        System.out.println("circle [radius=200, area=" + circle.area() + ", perimeter=" + circle.perimeter() + "]");
        System.out.println("rectangle [width=300, height=400, area=" + rectangle.area() + ", perimeter=" + rectangle.perimeter() + "]");

        // Exercise 2
        Square square = new Square(500);
        System.out.println("square [side=500, area=" + square.area() + ", perimeter=" + square.perimeter());

        // Exercise 3
        Account checkingAccount = new CheckingAccount(50_500.0);
        Account savingsAccount = new SavingsAccount(37_400.0);
        System.out.println("checkingAccount=" + checkingAccount.getBalance() + ", savingsAccount=" + savingsAccount);


    }
}
