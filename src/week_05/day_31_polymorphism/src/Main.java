package week_05.day_31_polymorphism.src;

public class Main {
    static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };
        for (Animal animal :animals) {
            animal.makeSound();
        }
    }
}
