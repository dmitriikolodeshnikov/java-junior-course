package week_05.day_33_abstract_classes;

public class Main {
    static void main(String[] args) {
        Payment[] payments = {new CardPayment(500), new CashPayment(800), new BankTransferPayment(2000)};
        for (Payment payment : payments) {
            payment.pay();
        }
    }
}
