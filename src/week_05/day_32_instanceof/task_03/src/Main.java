package week_05.day_32_instanceof.task_03.src;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};

        for (Animal animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog");;
            }

            if (animal instanceof Cat) {
                System.out.println("Cat");
            }
        }


    }
}
