package week_05.day_33_abstract_classes;

public class CardPayment extends Payment {

    public CardPayment (double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Card payment " + amount);
    }
}
