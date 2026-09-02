package week_03.day_21_bank_system.src;

public class Bank {
    public void showAccount(User user, BankAccount account) {
        System.out.println("==================");
        System.out.println("BANK ACCOUNT");
        System.out.println("==================");

        System.out.println("Owner: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

    }
}
