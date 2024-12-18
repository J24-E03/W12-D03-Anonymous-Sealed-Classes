package org.example.banking;

public class Main {
    public static void main(String[] args) {

        Account checkingAccount = new CheckingAccount(1500.0);
        System.out.printf("Checking Account Balance: $%.2f%n", checkingAccount.getBalance());

        Account savingsAccount = new SavingsAccount(3000.0);
        System.out.printf("Savings Account Balance: $%.2f%n", savingsAccount.getBalance());

        // doesn't implement Account interface
        LoanAccount loanAccount = new LoanAccount(25000.0);
        System.out.printf("Loan Account Balance: $%.2f%n", loanAccount.getBalance());



    }
}
