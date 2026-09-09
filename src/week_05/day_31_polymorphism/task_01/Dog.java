package week_05.day_31_polymorphism.task_01;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
