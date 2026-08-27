package week_02.day_09_parameters.task_03;

public class Main {
    static void printEmployee(String name, String position, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        printEmployee("Alex", "Developer", 3500);
    }
}
