package week_06.day_41_Comparable_and_Comparator.task_01.src;

public class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
