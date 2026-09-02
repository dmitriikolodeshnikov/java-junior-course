package week_02.day_14_atm_v2.task_05;

public class Main {

    static int calculate(int number) {
        if (number > 10) {
            return 100;
        }
        return number * 2;
    }

    public static void main(String[] args) {
        int result = calculate(5);
        System.out.println(result);
    }
}
