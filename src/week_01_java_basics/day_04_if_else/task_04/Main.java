package week_01_java_basics.day_04_if_else.task_04;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);

    }
}
