package SealedClass.Banking;

public sealed interface Account permits CheckingAccount, SavingsAccount{
    double getBalance();


}
