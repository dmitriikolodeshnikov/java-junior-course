package week_05.day_01_inheritance.src.task_02;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(name + " is studying");
    }
}
