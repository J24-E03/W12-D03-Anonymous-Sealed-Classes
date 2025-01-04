package SealedClass.Banking;

public class Main {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(1000);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        Account savingsAccount = new SavingsAccount(1500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}
