package week_04.day_25_object_tostring.src.task_01;

public class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title = " + title + ", author = " + author + "}";
    }
}
