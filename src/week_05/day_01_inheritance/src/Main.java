package week_05.day_01_inheritance.src;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog("Sharik", 3);
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Murka", 2);
        cat.eat();
        cat.meow();

        Bird bird = new Bird("Kesha", 1);
        bird.eat();
        bird.fly();
    }
}
