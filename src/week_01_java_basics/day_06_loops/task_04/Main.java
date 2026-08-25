package week_01_java_basics.day_06_loops.task_04;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        for (int i = 1; i < 6; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
