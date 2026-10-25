package week_06.day_41_Comparable_and_Comparator.task_04.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var employees = new ArrayList<Employee>();
        Collections.addAll(employees,
                new Employee("Bob", 2500, 21),
                new Employee("Tom", 3000, 18),
                new Employee("Alex", 2000, 25));

        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
        Comparator<Employee> byAge = Comparator.comparing(Employee::getAge);

        employees.sort(null);
        for (var employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getSalary() + ", " + employee.getAge());
        }
    }


}
