package org.dcistudent;

import org.dcistudent.interfaces.anonymous.Calculator;
import org.dcistudent.interfaces.anonymous.Shape;
import org.dcistudent.interfaces.anonymous.UserValidation;
import org.dcistudent.models.Animal;

public class AnonymousClasses {
    public AnonymousClasses() {
        System.out.println("1.1 ============================================================================");
        Shape shape = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a shape");
            }
        };
        shape.draw();

        System.out.println("1.2 ============================================================================");
        Animal animal = new Animal() {
            @Override
            public void speak() {
                System.out.println("Dog is speaking");
            }
        };
        animal.speak();

        System.out.println("1.3 ============================================================================");
        Calculator calculator = new Calculator() {
            @Override
            public Integer calculate(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println(calculator.calculate(13, 12));

        System.out.println("1.4 ============================================================================");
        UserValidation validation = new UserValidation() {
            @Override
            public Boolean validate(String username, String password) {
                return username.equals("admin") && password.equals("admin123");
            }
        };
        System.out.printf("U: %s, P: %s, R: %b%n", "admin", "admin123", validation.validate("admin", "admin123"));
        System.out.printf("U: %s, P: %s, R: %b%n", "admin", "admin", validation.validate("admin", "admin"));

        System.out.println("1.5 ============================================================================");
        UserValidation validation2 = new UserValidation() {
            @Override
            public Boolean validate(String username, String password) {
                return username.equals("guest") && password.equals("guest123");
            }
        };
        System.out.printf("U: %s, P: %s, R: %b%n", "guest", "guest123", validation2.validate("guest", "guest123"));
        System.out.printf("U: %s, P: %s, R: %b%n", "guest", "guest", validation2.validate("guest", "guest"));
    }
}
