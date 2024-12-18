package exercises;

import exercises.model.Animal;
import exercises.model.Calculator;
import exercises.model.Shape;
import exercises.model.UserValidation;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        class Circle implements Shape {

            @Override
            public void draw() {

            }
        }
        new Circle() {
            @Override
            public void draw() {
                System.out.println("Drawing the shape!");
            }
        }.draw();

        // Exercise 2
        class Dog extends Animal {
            @Override
            public void speak() {
                System.out.println("Dog barking!");
            }
        }

        new Dog().speak();

        // Exercise 3
        class Addition implements Calculator {

            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        }

        class Multiplication implements Calculator {

            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        }

        System.out.println("10 + 10 = " + new Addition().calculate(10, 10));
        System.out.println("10 * 10 = " + new Multiplication().calculate(10, 10));

        //Exercise 4
        class Admin implements UserValidation {

            @Override
            public boolean validate(String username, String password) {
                return username.equals("admin") && password.equals("admin123");
            }
        }

        class Guest implements UserValidation {

            @Override
            public boolean validate(String username, String password) {
                return username.equals("guest") && password.equals("guest123");
            }
        }

        System.out.println(new Admin().validate("admin", "admin123") ? "Login successful. Hello Admin!" : "Login failed!");
        System.out.println(new Admin().validate("test", "test") ? "Login successful. Hello Admin!" : "Login failed!");
        System.out.println(new Guest().validate("guest", "guest123") ? "Login successful. Welcome Guest!" : "Login failed!");
        System.out.println(new Guest().validate("test", "test") ? "Login successful. Welcome Guest!" : "Login failed!");
    }
}
