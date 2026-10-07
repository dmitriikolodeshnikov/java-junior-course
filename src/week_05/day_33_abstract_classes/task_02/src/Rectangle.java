package week_05.day_33_abstract_classes.task_02.src;

import week_05.day_33_abstract_classes.task_01.src.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double side1, double side2) {
        this.width = side1;
        this.height = side2;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
