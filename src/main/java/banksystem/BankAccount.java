package banksystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("So du khong duoc am");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("So tien nap phai lon hon 0");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}