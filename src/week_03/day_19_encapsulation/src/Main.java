package week_03.day_19_encapsulation.src;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.showBalance();

        account.deposit(500);
        account.showBalance();

        account.withdraw(300);
        account.withdraw(2000);
        account.showBalance();
    }
}
