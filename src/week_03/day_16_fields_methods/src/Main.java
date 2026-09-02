package week_03.day_16_fields_methods.src;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 1000;

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);

        account.showBalance();
    }
}
