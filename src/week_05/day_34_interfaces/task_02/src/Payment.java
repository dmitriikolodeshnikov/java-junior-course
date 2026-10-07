package week_05.day_34_interfaces.task_02.src;

public class Payment implements Payable, Refundable{
    private double amount;
    public Payment(double amount) {
        this.amount = amount;
    }

    @Override
    public void refund() {
        System.out.println("Refund");
    }

    @Override
    public void print() {
        System.out.println("Pay");
    }
}
