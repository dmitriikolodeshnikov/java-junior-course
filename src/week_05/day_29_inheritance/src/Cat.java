package week_05.day_29_inheritance.src;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    void meow() {
        System.out.println(name + ": meow");
    }
}
