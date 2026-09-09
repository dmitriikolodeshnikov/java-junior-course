package week_05.day_29_inheritance.src;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    void fly() {
        System.out.println(name + " is flying");
    }
}
