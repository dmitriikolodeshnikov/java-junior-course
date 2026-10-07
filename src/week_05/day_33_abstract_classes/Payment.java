package week_05.day_33_abstract_classes;

public abstract class Payment {
    protected double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    abstract void pay();
}
