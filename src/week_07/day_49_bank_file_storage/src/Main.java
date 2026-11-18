package week_07.day_49_bank_file_storage.src;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BANK SYSTEM ===");
        System.out.println("Запуск приложения...");

        CustomerRepository repository =
                new CustomerRepository(Path.of("data"));

        Bank bank = new Bank();

        try {
            System.out.println("Загрузка данных...");

            bank.load(repository);

            if (bank.listCustomersSortedByName().isEmpty()) {
                System.out.println("Данные не найдены. Создаём тестовых клиентов...");

                bank.registerCustomer(
                        new Customer(1, "Alice", "alice@example.com")
                );

                bank.registerCustomer(
                        new Customer(2, "Bob", "bob@example.com")
                );

                bank.openAccount("ACC-1001", 1);
                bank.openAccount("ACC-1002", 2);

                bank.deposit("ACC-1001", new BigDecimal("1500.00"));
                bank.deposit("ACC-1002", new BigDecimal("700.00"));

                bank.save(repository);

                System.out.println("Тестовые данные сохранены.");
            } else {
                System.out.println("Данные успешно загружены из файлов.");
            }

            System.out.println("\n=== КЛИЕНТЫ ===");

            bank.listCustomersSortedByName()
                    .forEach(System.out::println);

            System.out.println("\n=== БАНКОВСКИЕ СЧЕТА ===");

            bank.listAccountSortedByBalance()
                    .forEach(System.out::println);

            System.out.println("\n=== СНЯТИЕ ДЕНЕГ ===");

            bank.withdraw(
                    "ACC-1001",
                    new BigDecimal("200.00")
            );

            bank.save(repository);

            System.out.println("Снятие выполнено.");
            System.out.println(bank.getAccount("ACC-1001"));

            System.out.println("\n=== ПРИЛОЖЕНИЕ ЗАВЕРШЕНО ===");

        } catch (IOException e) {
            System.out.println("Ошибка файлового хранилища: "
                    + e.getMessage());
            e.printStackTrace();

        } catch (BankException | IllegalArgumentException e) {
            System.out.println("Ошибка банковской операции: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }
}
