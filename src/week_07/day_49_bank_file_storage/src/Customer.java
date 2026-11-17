package week_07.day_49_bank_file_storage.src;

import java.util.Objects;

public class Customer {
    private final int id;
    private final String name;
    private final String email;

    public Customer(int id, String name, String email) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID должен быть положительным");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя обязательно");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email обязателен");
        }

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toCsv() {
        return id + "," + name + "," + email;
    }

    public static Customer fromCsv(String line) {
        String[] parts = line.split(",", -1);
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверный CSV клиента");
        }

        return new Customer(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer customer)) return false;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
