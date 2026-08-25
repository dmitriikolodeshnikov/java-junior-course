package week_01_java_basics.day_05_switch.src;

public class Main {
    public static void main(String[] args) {
        int choice = 2;

        System.out.println("===================");
        System.out.println("        ATM");
        System.out.println("===================");
        System.out.println();
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.println();
        System.out.println("Choice: " + choice );
        System.out.println();

        switch (choice) {
            case 1 -> System.out.println("Balance selected");
            case 2 -> System.out.println("Deposit selected");
            case 3 -> System.out.println("Withdraw selected");
            case 4 -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown");
        }


    }
}
