package week_07.day_47_csv_storage.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("data", "customers.csv");

        List<Customer> customers = List.of(
                new Customer(1, "Alice", "alice@example.com"),
                new Customer(2, "Bob", "alice@example.com")
        );

        try {
            Files.createDirectories(path.getParent());
            List<String> lines = customers.stream()
                    .map(Customer::toCsv)
                    .toList();
            Files.write(path, lines);

            List<Customer> loaded = Files.readAllLines(path).stream()
                    .map(Customer::fromCsv)
                    .toList();

            loaded.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Ошибка не удалось обработать клиентов: " + e.getMessage());
        }
    }
}
