package week_02.day_14_atm_v2.task_03;

public class Main {
    static double calculateDiscount(double price, double percent) {
        return price * percent / 100;
    }

    public static void main(String[] args) {
        double result = calculateDiscount(100, 20);
        System.out.println(result);
    }
}
