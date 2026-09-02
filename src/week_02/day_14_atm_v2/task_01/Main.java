package week_02.day_14_atm_v2.task_01;

public class Main {
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println(max(5, 10));
    }
}
