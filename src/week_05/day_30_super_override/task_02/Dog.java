package week_05.day_30_super_override.task_02;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}
