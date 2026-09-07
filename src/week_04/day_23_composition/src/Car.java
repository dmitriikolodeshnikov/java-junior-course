package week_04.day_23_composition.src;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car started");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car stopped");
    }
}
