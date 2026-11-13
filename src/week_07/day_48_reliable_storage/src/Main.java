package week_07.day_48_reliable_storage.src;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    static void main(String[] args) {
        CustomerFileRepository repository =
                new CustomerFileRepository(
                        Path.of("data", "customers.csv")
                );

        try {
            List<Customer> customers = repository.findAll();

            if (customers.isEmpty()) {
                customers = List.of(
                        new Customer(1, "Alice", "alice@example.com")
                );
                repository.saveAll(customers);
            }

            for (Customer customer : customers) {
                System.out.println(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
