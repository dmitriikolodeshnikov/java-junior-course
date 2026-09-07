package week_04.day_23_composition.src.task_01;

public class Computer {
    Processor processor;
    public Computer(Processor processor) {
        this.processor = processor;
    }

    public void start() {
        processor.start();
        System.out.println("Computer started");
    }
}
