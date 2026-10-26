package week_06.day_42_Store_Management_System.src;

import java.util.*;

public class Store {

    private Map<Long, User> users = new HashMap<>();
    private Map<Long, Product> products = new HashMap<>();
    private List<Order> orders = new ArrayList<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User findUserById(long id) {
        return users.get(id);
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product findProductById(long id) {
        return products.get(id);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void printProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void sortProductsByPrice() {
        List<Product> productList = new ArrayList<>(products.values());
        productList.sort(null);

        for (Product product : productList) {
            System.out.println(product);
        }
    }
    public void sortProductsByName() {
        List<Product> productList = new ArrayList<>(products.values());
        productList.sort(Comparator.comparing(Product::getName));

        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void printOrders() {
        for (var order : orders) {
            System.out.println(order);
        }
    }
}
