package week_03.day_16_fields_methods.src;

public class BankAccount {
    double balance;

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
            return;
        }
        balance -= amount;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }


}
