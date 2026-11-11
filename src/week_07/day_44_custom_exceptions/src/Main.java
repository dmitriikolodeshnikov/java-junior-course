package week_07.day_44_custom_exceptions.src;

public class Main {
    static void main(String[] args) {
        double balance = 500;

        try {
            balance = withdraw(balance, 200);
            System.out.println("Новый баланс: " + balance);

            balance = withdraw(balance, 400);
            System.out.println("Новый баланс: " + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    static double withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new InsufficientFundsException("Сумма должна быть положительной");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств");
        }

        return balance - amount;
    }
}
