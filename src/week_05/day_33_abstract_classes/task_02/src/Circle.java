package week_05.day_33_abstract_classes.task_02.src;

import week_05.day_33_abstract_classes.task_01.src.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }
}
