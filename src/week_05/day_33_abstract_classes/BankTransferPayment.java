package week_05.day_33_abstract_classes;

public class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Bank transfer " + amount);
    }
}
