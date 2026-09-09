package week_05.day_30_super_override.task_02;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }
}
