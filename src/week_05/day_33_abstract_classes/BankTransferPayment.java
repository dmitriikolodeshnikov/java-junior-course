package week_05.day_33_abstract_classes;

import week_05.day_34_interfaces.task_02.src.Payable;

public class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Bank transfer " + amount);
    }
}
