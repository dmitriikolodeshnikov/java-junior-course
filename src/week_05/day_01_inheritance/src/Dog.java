package week_05.day_01_inheritance.src;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println(name + ":woof");
    }
}
