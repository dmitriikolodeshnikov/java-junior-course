package week_01_java_basics.day_04_if_else.src;

public class Main {
    public static void main(String[] args) {
        int experience = 3;
        double salary = 3500;
        boolean isActive = false;

        String level;
        if (experience < 1) {
            level = "Intern";
        } else if (experience <= 2) {
            level = "Junior";
        } else if (experience <= 5) {
            level = "Middle";
        } else {
            level = "Senor";
        }

        System.out.println("=================================");
        System.out.println("    Employee Level Calculator");
        System.out.println("=================================");
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + isActive);
        System.out.println("Level: " + level);
        if (isActive) {
            System.out.println("Status: Active " + level);
        } else {
            System.out.println("Status: Invalid");
        }
        System.out.println("=================================");
    }
}
