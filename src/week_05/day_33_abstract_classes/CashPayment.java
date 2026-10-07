package week_05.day_33_abstract_classes;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Cash payment " + amount);
    }
}
