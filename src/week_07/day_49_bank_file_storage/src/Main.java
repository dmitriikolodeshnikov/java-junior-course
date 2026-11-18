package week_07.day_49_bank_file_storage.src;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepository(Path.of("data"));

        Bank bank = new Bank();
        try {
            bank.load(repository);
            if (bank.listCustomersSortedByName().isEmpty()) {
                bank.registerCustomer(new Customer(
                        1,
                        "Alice",
                        "alise@example.com")
                );
                bank.registerCustomer(new Customer(
                        2,
                        "Bob",
                        "bob@examle.com")
                );

                bank.openAccount("Acc1001", 1);
                bank.openAccount("Acc1002", 2);

                bank.deposit("Acc1001", new BigDecimal("1500"));
                bank.deposit("Acc1002", new BigDecimal("700"));

                bank.save(repository);

                System.out.println("Клиенты: ");
                bank.listCustomersSortedByName()
                        .forEach(System.out::println);

                bank.withdraw("Acc1001", new BigDecimal("200"));
                bank.save(repository);

                System.out.println("После снятия: ");
                System.out.println(bank.getAccount("Acc1001"));
            }
        } catch (IOException e) {
            System.out.println("Ошибка хранения данных" + e.getMessage());
        } catch (BankException | IllegalArgumentException e) {
            System.out.println("Банковская операция отменена: " + e.getMessage());

        }
    }
}
