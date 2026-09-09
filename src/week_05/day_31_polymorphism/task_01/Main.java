package week_05.day_31_polymorphism.task_01;

public class Main {
    static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();


        Animal.makeAnimalSound(new Dog());
        Animal.makeAnimalSound(new Cat());

        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Cat()};

        for (Animal animal1 : animals) {
            animal1.makeSound();
        }
    }
}
