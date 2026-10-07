package week_05.day_34_interfaces;

public class CardPayment implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment by card");
    }
}
