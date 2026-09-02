package week_03.day_21_bank_system.src;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        if (balance >= 0) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("invalid amount");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }
}
