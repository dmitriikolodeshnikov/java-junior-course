package week_05.day_32_instanceof.task_01.src;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        if (animal instanceof Dog) {
            System.out.println("Object is dog");
        }
    }
}
