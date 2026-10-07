package week_05.day_35_oop_project.src;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void startWorkingDay() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
