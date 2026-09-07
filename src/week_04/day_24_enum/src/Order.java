package week_04.day_24_enum.src;

public class Order {

    OrderStatus status = OrderStatus.NEW;
    public void process() {
        status = OrderStatus.PROCESSING;

    }

    public void ship() {
        status = OrderStatus.SHIPPED;

    }

    public void deliver() {
        status = OrderStatus.DELIVERED;
    }

    public void cancel() {
        status = OrderStatus.CANCELED;
    }

    public void printStatus(){
        System.out.println("Status: " + status);
    }
}
