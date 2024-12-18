package org.dcistudent.models;

public final class CheckingAccount implements Account {
    private final Double balance;

    public CheckingAccount(Double balance) {
        this.balance = balance;
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
