package week_01_java_basics.day_05_switch.task_04;

public class Main {
    public static void main(String[] args) {
        String role = "ADMIN";
        switch (role) {
            case "ADMIN" -> System.out.println("Admin");
            case "USER" -> System.out.println("User");
            case "MODERATOR" -> System.out.println("Moderator");
            default -> System.out.println("Unknown role");
        }
    }
}
