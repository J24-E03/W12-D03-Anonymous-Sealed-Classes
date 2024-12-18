package org.example.banking;

public final class CheckingAccount implements Account {

    double balance;
    public CheckingAccount(double balance) {
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
