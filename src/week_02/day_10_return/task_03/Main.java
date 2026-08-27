package week_02.day_10_return.task_03;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(20));
        System.out.println(test(5));
    }
    static int test(int x) {
        if (x > 10) {
            return 100;
        }
        return 50;
    }
}
