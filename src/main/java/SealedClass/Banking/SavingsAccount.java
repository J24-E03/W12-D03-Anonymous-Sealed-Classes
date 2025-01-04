package SealedClass.Banking;

public final class SavingsAccount implements Account{
    public float balance;

    public SavingsAccount(float balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
