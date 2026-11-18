package week_07.day_49_bank_file_storage.src;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class Bank {
    private final Map<Integer, Customer> customers = new HashMap<>();
    private final Map<String, BankAccount> accounts = new HashMap<>();
    private final Set<String> emails = new HashSet<>();

    public void registerCustomer(Customer customer) {
        if (customers.containsKey(customer.getId())) {
            throw new BankException("такой ID клиента уже существует");
        }
        String normalizedEmail = customer.getEmail().toLowerCase();

        if (emails.contains(customer.getEmail())) {
            throw new BankException("Такой email уже зарегистрирован");
        }

        customers.put(customer.getId(), customer);
        emails.add(normalizedEmail);
    }

    public void openAccount(String accountNumber, int customerId) {
        if (!customers.containsKey(customerId)) {
            throw new CustomerNotFoundException(customerId);
        }

        if (accounts.containsKey(accountNumber)) {
            throw new BankException("Номер счета уже существует");
        }

        accounts.put(accountNumber, new BankAccount(accountNumber, customerId));
    }

    public void deposit(String accountNumber, BigDecimal amount) {
        getAccount(accountNumber).deposit(amount);
    }

    public void withdraw(String accountNumber, BigDecimal amount) {
        getAccount(accountNumber).withdraw(amount);
    }

    public Customer findCustomer(int id) {
        Customer customer = customers.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException(id);
        }
        return customer;
    }

    public BankAccount getAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new BankException("Счет " + accountNumber + "не найден");
        }
        return account;
    }

    public List<Customer> listCustomersSortedByName() {
        List<Customer> result = new ArrayList<>(customers.values());
        result.sort(Comparator.comparing(Customer::getName, String.CASE_INSENSITIVE_ORDER));

        return result;
    }

    public List<BankAccount> listAccountSortedByBalance() {
        List<BankAccount> result = new ArrayList<>(accounts.values());
        result.sort(Comparator.comparing(BankAccount::getBalance).reversed());

        return result;
    }

    public void save(CustomerRepository repository) throws IOException {
        repository.saveCustomers(new ArrayList<>(customers.values()));
        repository.saveAccounts(new ArrayList<>(accounts.values()));
    }

    public void load(CustomerRepository repository) throws IOException {
        List<Customer> loadedCustomers = repository.loadCustomers();
        List<BankAccount> loadedAccounts = repository.loadAccounts();

        Map<Integer, Customer> newCustomers = new HashMap<>();
        Set<String> newEmails = new HashSet<>();

        for (Customer customer : loadedCustomers) {
            if (newCustomers.putIfAbsent(customer.getId(), customer) != null) {
                throw new IOException("Повторяется ID клиента");
            }

            if (!newEmails.add(customer.getEmail().toLowerCase())) {
                throw new IOException("Повторяется email клиента");
            }
        }
        Map<String, BankAccount> newAccounts = new HashMap<>();

        for (BankAccount account : loadedAccounts) {
            if (!newCustomers.containsKey(account.getCustomerId())) {
                throw new IOException("Счет ссылается на неизвестного клиента");
            }

            if (newAccounts.putIfAbsent(account.getAccountNumber(), account) != null) {
                throw new IOException("Повторяется номер счета");
            }
        }

        customers.clear();
        customers.putAll(newCustomers);

        accounts.clear();
        accounts.putAll(newAccounts);
    }
}
