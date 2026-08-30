package week_02.day_11_scope_static.task_01;

public class Main {
    static double balance = 1000;

    static void showBalance() {
        System.out.println("Balance: " + balance);
    }

    static void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        showBalance();
        deposit(500);
        showBalance();
    }
}
