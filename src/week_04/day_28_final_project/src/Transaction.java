package week_04.day_28_final_project.src;

public class Transaction {
    private double amount;
    private TransactionType type;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                '}';
    }
}
