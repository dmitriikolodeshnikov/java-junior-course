package week_02.day_14_atm_v2.src;

public class Main {
    static double balance = 1000;

    static void showHeader() {
        System.out.println("================");
        System.out.println("    ATM");
        System.out.println("================");
    }

    static void showBalance() {
        System.out.println(balance);
    }

    static void deposit(double amount) {
        if (!isValidAmount(amount)) {
            System.out.println("Invalid deposit");
            return;
        }

        balance += amount;

    }

    static void withdraw(double amount) {
        if (!isValidAmount(amount)) {
            System.out.println("Invalid withdrawal");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    static void showFooter() {
        System.out.println("================");
        System.out.println("ATM closed");
        System.out.println("================");
    }

    public static void main(String[] args) {
        showHeader();

        showBalance();
        deposit(500);
        showBalance();

        withdraw(300);
        showBalance();

        withdraw(2000);

        showBalance();

        showFooter();
    }
}
