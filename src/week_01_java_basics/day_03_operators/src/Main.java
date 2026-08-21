package week_01_java_basics.day_03_operators.src;

public class Main {
    public static void main(String[] args) {
        double salary =5000;
        double bonusPercent = 20;
        double taxPercent = 20;

        double bonus = salary * bonusPercent /100;
        double total = salary + bonus;
        double tax = total * taxPercent / 100;
        double netSalary = total - tax;
        System.out.println("=========================");
        System.out.println("    SALARY CALCULATOR");
        System.out.println("=========================");
        System.out.println("Salary: " + salary);
        System.out.println("Bonus " + bonusPercent + "%: " + bonus);
        System.out.println("Gross total: " + total);
        System.out.println("Tax " + taxPercent + "%: " + tax);
        System.out.println("Net salary: " + netSalary);
        System.out.println("=========================");
    }
}
