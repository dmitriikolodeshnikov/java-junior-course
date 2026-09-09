package week_05.day_30_super_override.src;

public class Employee extends Person{
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }
}
