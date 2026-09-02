package week_03.day_15_classes_objects.task_02;

public class Book {
    String title;
    String author;
    int pages;

    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();

        book.title = "Java Basics";
        book.author = "John";
        book.pages = 300;

        book1.title = "Spring Boot";
        book1.author = "Alex";
        book1.pages = 500;
    }
}
