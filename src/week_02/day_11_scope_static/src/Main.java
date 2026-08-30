package week_02.day_11_scope_static.src;

public class Main {
    static double balance = 1000;

    static void showBalance() {
        System.out.println("Balance: " + balance);
    }

    static void deposit(double amount) {
        if (amount <= 0 ) {
            System.out.println("Invalid deposit.");
            return;
        }

        balance += amount;
    }

    static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
            return;
        }

        balance -= amount;
    }

    public static void main(String[] args) {
        showBalance();

        deposit(500);
        showBalance();

        withdraw(300);
        showBalance();

        withdraw(2000);
        showBalance();
    }
}
