package week_01_java_basics.day_05_switch.task_03;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        char operator = '+';
        switch (operator) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println((a * b));
            case '/' -> System.out.println((a / b));
        }
    }
}
