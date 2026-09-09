package week_05.day_29_inheritance.src.task_01;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void openTrunk() {
        System.out.println("Trunk opened");
    }
}
