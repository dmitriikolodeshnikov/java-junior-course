package week_05.day_35_oop_project.src;

public class Main {
    static void main(String[] args) {
        Developer developer1 = new Developer(
                1,
                "Alex",
                2500,
                "Java"
        );

        Developer developer2 = new Developer(
                2,
                "Maria",
                3000,
                "Kotlin"
        );

        Manager manager = new Manager(
                3,
                "John",
                2000,
                50
        );

        Employee[] employees = {
                developer1,
                developer2,
                manager
        };

        Company company = new Company(employees);
        company.printEmployees();

        System.out.println();

        company.startWorkingDay();

        System.out.println();

        developer1.generateReport();
    }
}
