package week_04.day_27_oop_model.src;

import java.util.Objects;

public class Product {
    long id;
    String name;
    double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
