package org.dcistudent.models;

public sealed interface Account permits CheckingAccount, SavingsAccount  {
    Double getBalance();
}
