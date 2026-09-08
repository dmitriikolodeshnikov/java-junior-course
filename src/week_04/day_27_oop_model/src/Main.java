package week_04.day_27_oop_model.src;

public class Main {
    static void main(String[] args) {
        Product product1 = new Product(1, "laptop", 1000);
        Product product2 = new Product(2, "mouse", 500);

        OrderItem orderItem1 = new OrderItem(product1, 2);
        OrderItem orderItem2 = new OrderItem(product2, 3);

        Order order = new Order(orderItem1, orderItem2);
        System.out.println("Total: " + order.getTotalPrice());
    }
}
