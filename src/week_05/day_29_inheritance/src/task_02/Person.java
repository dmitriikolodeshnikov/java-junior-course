package week_05.day_29_inheritance.src.task_02;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", age: " + age);
    }
}
