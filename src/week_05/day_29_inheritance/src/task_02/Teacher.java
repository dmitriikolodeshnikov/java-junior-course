package week_05.day_29_inheritance.src.task_02;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(name + " is teaching");
    }
}
