package week_07.day_48_reliable_storage.src;

public class Customer {
    private final int id;
    private final String name;
    private final String email;

    public Customer(int id, String name, String email) {
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

    public String toCsv() {
        return id + "," + name + "," + email;
    }

    public static Customer fromCsv(String line) {
        String[] parts = line.split(",", -1);
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверный формат CSV");
        }
        return new Customer(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2]
        );
    }

    public String getEmail() {
        return email;
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
