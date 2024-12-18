package org.dcistudent;

import org.dcistudent.models.*;

public class SealedClasses {
    public SealedClasses() {
        System.out.println("2.1 ============================================================================");
        Circle circle = new Circle(5.5);
        System.out.printf("Circle area: %.2f%n", circle.area());
        System.out.printf("Circle perimeter: %.2f%n", circle.perimeter());
        Rectangle rectangle = new Rectangle(5.5, 6.5);
        System.out.printf("Rectangle area: %.2f%n", rectangle.area());
        System.out.printf("Rectangle perimeter: %.2f%n", rectangle.perimeter());

        System.out.println("2.2 ============================================================================");
        Square square = new Square(5.5);
        System.out.printf("Square area: %.2f%n", square.area());
        System.out.printf("Square perimeter: %.2f%n", square.perimeter());

        System.out.println("2.3 ============================================================================");
        CheckingAccount checkingAccount = new CheckingAccount(100.0);
        System.out.printf("Checking account balance: %.2f%n", checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(234.56);
        System.out.printf("Savings account balance: %.2f%n", savingsAccount.getBalance());

        System.out.println("2.4 ============================================================================");
        System.out.println("'Triangle' is not allowed in the sealed hierarchy.");
        System.out.println("'LoanAccount' is not allowed in the sealed hierarchy.");
    }
}
