package week_01_java_basics.day_06_loops.task_05;

public class Main {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
