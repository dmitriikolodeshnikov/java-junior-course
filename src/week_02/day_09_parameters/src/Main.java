package week_02.day_09_parameters.src;

public class Main {
    static void printAddition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    static  void printSubtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    static void printMultiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    static void printDivision(int a, int b) {
        if (b == 0) {
            System.out.println("Can not divide by zero");
        }
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        printAddition(10, 5);
        printSubtraction(10, 5);
        printMultiplication(10, 5);
        printDivision(10, 5);
    }
}
