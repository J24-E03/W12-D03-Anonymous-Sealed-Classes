package SealedClass.Banking;

public final class CheckingAccount implements Account {
    public float balance;

    public CheckingAccount(float balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
