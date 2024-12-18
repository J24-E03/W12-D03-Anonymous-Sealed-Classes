package org.example.banking;

public final class SavingsAccount implements Account {

    private double balance;

    public SavingsAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
