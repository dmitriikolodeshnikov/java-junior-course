package week_05.day_31_polymorphism.task_01;

public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }

    static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
