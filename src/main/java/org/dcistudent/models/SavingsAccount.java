package org.dcistudent.models;

public final class SavingsAccount implements Account {
    private final Double balance;

    public SavingsAccount(Double balance) {
        this.balance = balance;
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
