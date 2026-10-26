package week_06.day_42_Store_Management_System.src;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private User user;
    private OrderStatus status = OrderStatus.NEW;
    private List<OrderItem> items = new ArrayList<>();

    public Order(long id, User user) {
        this.id = id;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(Product product, int quantity) {
        if (quantity <=0) {
            System.out.println("Invalid quantity!");
            return;
        }

        items.add(new OrderItem(product, quantity));
    }

    public double getTotalPrice() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printItems() {
        for (var item : items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user.getName() +
                ", status=" + status +
                ", total=" + getTotalPrice() +
                '}';
    }
}
