package week_06.day_41_Comparable_and_Comparator.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,
                "Laptop",
                1000,
                4.5));

        products.add(new Product(2L,
                "Monitor",
                500,
                5));

        products.add(new Product(3L,
                "Mouse",
                100,
                3.5));

        Comparator<Product> byId = Comparator.comparingLong(Product::getId);
        Comparator<Product> byName = Comparator.comparing(Product::getName);
        Comparator<Product> byRating = Comparator.comparingDouble(Product::getRating);

        products.sort(null);

        for (var product : products) {
            System.out.println(product.getId()
                    + " " + product.getName()
                    + " " + product.getPrice()
                    + " " + product.getRating());
        }

        System.out.println();
        System.out.println("Sort by Id");
        System.out.println();

        products.sort(byId);

        for (var product : products) {
            System.out.println(product.getId()
                    + " " + product.getName()
                    + " " + product.getPrice()
                    + " " + product.getRating());
        }

        System.out.println();
        System.out.println("Sort by name");
        System.out.println();

        products.sort(byName);

        for (var product : products) {
            System.out.println(product.getId()
                    + " " + product.getName()
                    + " " + product.getPrice()
                    + " " + product.getRating());
        }

        System.out.println();
        System.out.println("Sort by rating");
        System.out.println();

        products.sort(byRating);

        products.forEach(System.out::println);
    }
}
