package week_02.day_08_methods.src;

public class Main {
    static void printHeader() {
        System.out.println("====================");
        System.out.println("    GREETING APP");
        System.out.println("====================");
    }

    static void printWelcome() {
        System.out.println("Welcome to the application");
    }

    static void printMenu() {
        System.out.println("1. Start");
        System.out.println("2. Help");
        System.out.println("3. Exit");
    }

    static void printFooter() {
        System.out.println();
        System.out.println("====================");
        System.out.println("Goodbye!");

    }

    public static void main(String[] args) {
        printHeader();
        printWelcome();
        printMenu();
        printFooter();
    }
}
