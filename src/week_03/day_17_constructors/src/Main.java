package week_03.day_17_constructors.src;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000, 5);
        System.out.println(product.getTotalPrice());
    }
}
