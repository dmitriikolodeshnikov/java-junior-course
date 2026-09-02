package week_03.day_21_bank_system.src;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", 25);

        BankAccount account =new BankAccount("DE123456", 1000);

        account.deposit(500);
        account.withdraw(300);

        Bank bank = new Bank();

        bank.showAccount(user, account);

    }
}
