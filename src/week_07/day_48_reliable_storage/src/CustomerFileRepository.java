package week_07.day_48_reliable_storage.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CustomerFileRepository {
    private final Path path;

    public CustomerFileRepository(Path path) {
        this.path = path;
    }

    public void saveAll(List<Customer> customers) throws IOException {
        Files.createDirectories(path.getParent());

        List<String> lines = new ArrayList<>();

        for (Customer customer : customers) {
            lines.add(customer.toCsv());
        }

        Files.write(path, lines);
    }

    public List<Customer> findAll() throws IOException {
        if (Files.notExists(path)) {
            return new ArrayList<>();
        }

        List<Customer> customers = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);

        for (int i = 0; i < lines.size(); i++) {
            try {
                customers.add(Customer.fromCsv(lines.get(i)));
            } catch (IllegalArgumentException e) {
                throw new IOException(
                        "Ошибка в строке " + (i + 1)
                                + ": " + e.getMessage(),
                        e
                );
            }
        }

        return customers;
    }
}
