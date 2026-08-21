package week_01_java_basics.day_04_if_else.task_05;

public class Main {
    public static void main(String[] args) {
        int experience = 5;
        if (experience < 1) {
            System.out.println("Intern");
        } else if (experience <= 2) {
            System.out.println("Junior");
        } else if (experience <= 5) {
            System.out.println("Middle");
        } else {
            System.out.println("Senior");
        }
    }
}
