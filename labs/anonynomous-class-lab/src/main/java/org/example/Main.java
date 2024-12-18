package org.example;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }

    private static void part1() {
        Shape myShape = () -> System.out.println("Drawing the shape!");

        System.out.println("Part1:");
        myShape.draw();
    }

    private static void part2() {
        Animal myDog = new Animal() {
            @Override
            public void speak() {
                System.out.println("Dog barking!");
            }
        };
        System.out.println("\nPart2:");
        myDog.speak();
    }

    private static void part3() {
       Calculator adder = (a, b) -> a + b;
        Calculator multiplier = (a, b) -> a * b;
        int num1 = 10;
        int num2 = 20;

        System.out.println("\nPart3:");
        System.out.printf("Sum of %d and %d is %d.", num1, num2, adder.calculate(num1, num2));
        System.out.printf("\nMultiplication of %d and %d is %d.", num1, num2, multiplier.calculate(num1, num2));

    }

    private static void part4() {
        UserValidation adminValidation = (username, password) -> username.equals("admin") && password.equals("admin123");
        UserValidation guestValidation = (username, password) -> username.equals("guest") && password.equals("guest123");

        System.out.println("\n\nPart4:");

        String adminUsername = "admin";
        String adminPassword = "admin123";
        String adminFakeUsername = "admin_user";
        String adminFakePassword = "admin1234";

        System.out.println("Admin Validation");
        System.out.printf("Is username: %s and password: %s as an admin valid? %b", adminUsername, adminPassword, adminValidation.validate(adminUsername, adminPassword));
        System.out.printf("\nIs username: %s and password: %s as an admin valid? %b", adminFakeUsername, adminPassword, adminValidation.validate(adminFakeUsername, adminPassword));
        System.out.printf("\nIs username: %s and password: %s as an admin valid? %b", adminUsername, adminFakePassword, adminValidation.validate(adminUsername, adminFakePassword));



        String guestUsername = "guest";
        String guestPassword = "guest123";
        String guestFakeUsername = "guest_user";
        String guestFakePassword = "guest1234";

        System.out.println("\nGuestValidation:");

        System.out.printf("Is username: %s and password: %s as a guest valid? %b", guestUsername, guestPassword, guestValidation.validate(guestUsername, guestPassword));
        System.out.printf("\nIs username: %s and password: %s as a guest valid? %b", guestFakeUsername, guestPassword, guestValidation.validate(guestFakeUsername, guestPassword));
        System.out.printf("\nIs username: %s and password: %s as a guest valid? %b", guestUsername, guestFakePassword, guestValidation.validate(guestUsername, guestFakePassword));


    }
}