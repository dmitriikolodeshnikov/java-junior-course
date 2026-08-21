package week_01_java_basics.day_04_if_else.task_01;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
