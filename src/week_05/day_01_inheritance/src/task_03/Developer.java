package week_05.day_01_inheritance.src.task_03;

public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    public void writeCode() {
        System.out.println(name + " writes code");
    }
}
