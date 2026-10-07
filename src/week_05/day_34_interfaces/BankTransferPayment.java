package week_05.day_34_interfaces;

public class BankTransferPayment implements Payable{
    @Override
    public void pay() {
        System.out.println("Payment by bank transfer");
    }
}
