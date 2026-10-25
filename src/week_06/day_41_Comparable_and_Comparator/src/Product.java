package week_06.day_41_Comparable_and_Comparator.src;

public class Product implements Comparable<Product> {
    private long id;
    private String name;
    private double price;
    private double rating;

    public Product(long id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
