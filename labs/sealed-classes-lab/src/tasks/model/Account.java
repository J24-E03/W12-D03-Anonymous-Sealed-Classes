package tasks.model;

public sealed interface Account permits CheckingAccount, SavingsAccount {
    double getBalance();

}
