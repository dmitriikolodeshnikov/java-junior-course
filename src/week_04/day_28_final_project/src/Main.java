package week_04.day_28_final_project.src;

public class Main {
    static void main(String[] args) {
        Bank bank = new Bank();

        User user = new User(1, "Alex");

        Account account = bank.createAccount(user, "DE12345", 1000);

        bank.showAccount(account);

        account.deposit(500);

        account.withdraw(200);

        account.withdraw(5000);

        bank.showAccount(account);


    }
}
