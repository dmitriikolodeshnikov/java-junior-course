package week_07.day_49_bank_file_storage.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final Path customersPath;
    private final Path accountsPath;

    public CustomerRepository(Path directory) {
        this.customersPath = directory.resolve("customers.csv");
        this.accountsPath = directory.resolve("accounts.csv");
    }

    public void saveCustomers(List<Customer> customers) throws IOException {
        Files.createDirectories(customersPath.getParent());
        List<String> lines = new ArrayList<>();
        for (Customer customer : customers) {
            lines.add(customer.toCsv());
        }

        Files.write(customersPath, lines);
    }

    public void saveAccounts(List<BankAccount> accounts) throws IOException {
        Files.createDirectories(accountsPath.getParent());
        List<String> lines = new ArrayList<>();

        for (BankAccount account : accounts) {
            lines.add(account.toCsv());
        }

        Files.write(accountsPath, lines);
    }

    public List<Customer> loadCustomers() throws IOException {
        List<Customer> customers = new ArrayList<>();
        if (Files.notExists(customersPath)) {
            return customers;
        }
        List<String> lines = Files.readAllLines(customersPath);

        for (int i = 0; i < lines.size(); i++) {
            try {
                customers.add(Customer.fromCsv(lines.get(i)));
            } catch (RuntimeException e) {
                throw new IOException("Ошибка клиента в строке: " + (i + 1), e);
            }
        }

        return customers;
    }

    public List<BankAccount> loadAccounts() throws IOException {
        List<BankAccount> accounts = new ArrayList<>();
        if (Files.notExists(accountsPath)) {
            return accounts;
        }

        List<String> lines = Files.readAllLines(accountsPath);

        for (int i = 0; i < lines.size(); i++) {
           try {
               accounts.add(BankAccount.fromCsv(lines.get(i)));
           } catch (RuntimeException e) {
               throw new IOException("Ошибка счета в строке: " + (i + 1), e);
           }
        }

        return accounts;
    }
}
