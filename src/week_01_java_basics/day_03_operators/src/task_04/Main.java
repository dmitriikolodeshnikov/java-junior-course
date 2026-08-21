package week_01_java_basics.day_03_operators.src.task_04;

public class Main {
    public static void main(String[] args) {
        double price = 150;
        double discount = 20;

        double discountPrice = price - price * discount / 100;
        System.out.println(discountPrice);
    }
}
