package week_07.day_49_bank_file_storage.src;

import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {
    private final String accountNumber;
    private final int customerId;
    private BigDecimal balance;

    public BankAccount(String accountNumber, int customerId) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Номер счета обязателен");
        }

        if (customerId <= 0) {
            throw new IllegalArgumentException("Неверный ID клиента");
        }
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = BigDecimal.ZERO;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
    }

    public void deposit(BigDecimal amount) {
        validateAmount(amount);
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        validateAmount(amount);
        if (amount.compareTo(balance) > 0) {
            throw new InsufficientFundsException(accountNumber);
        }

        balance = balance.subtract(amount);
    }

    public String toCsv() {
        return accountNumber + "," + customerId + "," + balance;
    }

    public static BankAccount fromCsv(String line) {
        String[] parts = line.split(",", -1);
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверный Csv счета");
        }

        BankAccount account =  new BankAccount(parts[0], Integer.parseInt(parts[1]));
        BigDecimal balance = new BigDecimal(parts[2]);

        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }

        if (balance.compareTo(BigDecimal.ZERO) > 0) {
            account.deposit(balance);
        }

        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BankAccount that)) return false;
        return Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerId=" + customerId +
                ", balance=" + balance +
                '}';
    }
}
