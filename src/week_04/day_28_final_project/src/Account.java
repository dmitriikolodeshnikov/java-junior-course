package week_04.day_28_final_project.src;

public class Account {
    private String accountNumber;
    private double balance;
    private User owner;

    public Account(String accountNumber, double balance, User owner) {
        this.accountNumber = accountNumber;
        if (balance < 0) {
            System.out.println("Invalid balance");
            return;
        }
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
            return;
        }
        balance += amount;

        Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT);

        System.out.println(transaction);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;

        Transaction transaction = new Transaction(amount, TransactionType.WITHDRAW);

        System.out.println(transaction);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }
}
