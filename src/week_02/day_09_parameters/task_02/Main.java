package week_02.day_09_parameters.task_02;

public class Main {
    static void printRectangle(int width, int height) {
        int area = width * height;
        System.out.println(area);
    }

    public static void main(String[] args) {
        printRectangle(5,4);
    }
}

