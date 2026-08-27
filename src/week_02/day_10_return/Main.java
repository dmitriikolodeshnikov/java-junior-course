package week_02.day_10_return;

public class Main {
    public static void main(String[] args) {
        int sum = add(10, 20);
        int difference = subtract(20, 10);
        int product = multiply(5, 4);

        boolean even = isEven(10);
        boolean positive = isPositive(15);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static  int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

}
