package week_04.day_25_object_tostring.src.task_02;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name= " + name + ", price= " + price + "}";
    }
}
