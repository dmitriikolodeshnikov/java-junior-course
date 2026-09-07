package week_04.day_23_composition.src;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();

        Car car = new Car(engine);

        car.start();
        car.stop();
    }
}
