package week_02.day_10_return.task_02;

public class Main {
    public static void main(String[] args) {
        boolean result = isEven(6);
        System.out.println(result);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
