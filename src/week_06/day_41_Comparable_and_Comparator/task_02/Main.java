package week_06.day_41_Comparable_and_Comparator.task_02;

import week_06.day_41_Comparable_and_Comparator.task_01.src.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();
        products.add(new Product("laptop", 1000));
        products.add(new Product("monitor", 500));
        products.add(new Product("mouse", 100));
        products.sort(Comparator.comparing(Product::getPrice));
        for (var product : products) {
            System.out.println(product.getName() + " -> " + product.getPrice());
        }
    }
}
