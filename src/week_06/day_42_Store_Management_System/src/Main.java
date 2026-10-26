package week_06.day_42_Store_Management_System.src;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        User alex = new User(1L, "Alex", "alex@gmail.com");
        User mary = new User(2L, "Mary", "mary@gmail.com");
        User bob = new User(3L, "Bob", "bob@gmail.com");

        Product laptop = new Product(1L, "Laptop", 1500);
        Product mouse = new Product(2L, "Mouse", 100);
        Product keyboard = new Product(3L, "Keyboard", 200);

        store.addUser(alex);
        store.addUser(mary);
        store.addUser(bob);

        store.addProduct(laptop);
        store.addProduct(mouse);
        store.addProduct(keyboard);

        System.out.println("User #1: " + store.findUserById(1));

        System.out.println();

        System.out.println("Sort products by price: " );
        store.sortProductsByPrice();

        System.out.println();
        System.out.println("Sort products by name: ");
        store.sortProductsByName();

        Order order = new Order(1L, alex);
        order.addItem(laptop, 1);
        order.addItem(keyboard, 2);

        order.setStatus(OrderStatus.PROCESSING);

        store.addOrder(order);

        System.out.println("Order: ");
        System.out.println(order);

        System.out.println("Items: ");

        order.printItems();

        System.out.println("Orders: ");
        store.printOrders();



    }
}
