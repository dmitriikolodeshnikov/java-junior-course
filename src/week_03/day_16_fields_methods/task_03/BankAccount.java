package week_03.day_16_fields_methods.task_03;

public class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
