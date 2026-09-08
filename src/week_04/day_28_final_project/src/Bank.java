package week_04.day_28_final_project.src;

public class Bank {

    public Account createAccount(User user, String accountNumber, double balance) {
        return new Account(accountNumber, balance, user);
    }

    public void showAccount(Account account) {
        System.out.println("================");
        System.out.println("Owner: " + account.getOwner().getName());
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("================");
    }
}
