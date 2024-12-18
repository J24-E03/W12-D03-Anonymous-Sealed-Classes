package org.example.banking;

public sealed interface Account permits CheckingAccount, SavingsAccount{
    double getBalance();
}
