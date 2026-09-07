package week_04.day_24_enum.src;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.printStatus();

        order.process();
        order.printStatus();

        order.ship();
        order.printStatus();

        order.deliver();
        order.printStatus();
    }
}
