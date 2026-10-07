package week_05.day_33_abstract_classes.task_03.src;

import week_05.day_33_abstract_classes.task_01.src.Shape;
import week_05.day_33_abstract_classes.task_02.src.Circle;
import week_05.day_33_abstract_classes.task_02.src.Rectangle;

public class Main {
    static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(10, 5)};
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
