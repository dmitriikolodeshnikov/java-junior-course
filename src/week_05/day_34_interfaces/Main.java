package week_05.day_34_interfaces;

public class Main {
    static void main(String[] args) {
        Payable[] payments = {new CardPayment(), new CashPayment(), new BankTransferPayment()};
        for (Payable payment : payments) {
            payment.pay();
        }
    }
}
