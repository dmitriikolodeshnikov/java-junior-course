package week_02.day_12_method_overloading.task_01;

public class Main {
    static String convert(int value) {
        return "int: " + value;
    }

    static String convert(double value) {
        return "double: " + value;
    }

    static String convert(String value) {
        return "String: " + value;
    }

    public static void main(String[] args) {
        System.out.println(convert(10));
        System.out.println(convert(5.0));
        System.out.println(convert("text"));

    }
}
