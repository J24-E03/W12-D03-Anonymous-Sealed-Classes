package org.example.banking;

public class LoanAccount /*implements Account*/ {
    private double balance;

    public LoanAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

