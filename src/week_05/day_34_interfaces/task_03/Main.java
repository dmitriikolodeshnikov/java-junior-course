package week_05.day_34_interfaces.task_03;


import week_05.day_34_interfaces.task_02.src.Payable;

public class Main {
    static void main(String[] args) {
        Payable[] payments = {new CardPayment(500), new CashPayment(1000), new BankTransferPayment(5000)};
        for (Payable payment : payments) {
            payment.print();
        }
    }
}
