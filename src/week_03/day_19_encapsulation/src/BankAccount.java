package week_03.day_19_encapsulation.src;

public class BankAccount {
    private double balance;

    BankAccount(double balance) {
        if (balance >= 0) {
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
            System.out.println("Invalid amount");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
