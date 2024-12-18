package org.example.banking;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1500.0);
        System.out.printf("Checking Account Balance: $%.2f%n", checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(3000.0);
        System.out.printf("Savings Account Balance: $%.2f%n", savingsAccount.getBalance());

    }
}
