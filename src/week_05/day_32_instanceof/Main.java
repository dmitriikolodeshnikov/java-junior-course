package week_05.day_32_instanceof;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        for (Animal animal : animals) {
            if (animal instanceof Dog dog) {
                dog.burk();
            } else if (animal instanceof Cat cat) {
                cat.meow();
            } else if (animal instanceof Bird bird) {
                bird.fly();
            }
        }
    }
}
