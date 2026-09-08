package week_04.day_27_oop_model.src;

public class Order {
    OrderItem item1;
    OrderItem item2;

    public Order(OrderItem orderItem1, OrderItem orderItem2) {
        this.item1 = orderItem1;
        this.item2 = orderItem2;
    }

    public double getTotalPrice() {
        return item1.getTotalPrice() + item2.getTotalPrice();
    }
}
