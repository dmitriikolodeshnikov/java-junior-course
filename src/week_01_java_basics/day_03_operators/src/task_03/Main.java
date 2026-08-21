package week_01_java_basics.day_03_operators.src.task_03;

public class Main {
    public static void main(String[] args) {
        int age =25;
        double salary = 2500;

        boolean canGetLoan = age >= 18 && salary >= 2000;
        System.out.println(canGetLoan);
    }
}
