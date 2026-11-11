package week_07.day_45_try_with_resources.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path source = Path.of("data/source.txt");
        Path target = Path.of("data/copy.txt");

        try {
            Files.createDirectories(source.getParent());
            Files.writeString(source, "Первая строка\nВторая строка");

            String content = Files.readString(source);
            Files.writeString(target, content);
            System.out.println("Содержимое скопировано");

        } catch (IOException e) {
            System.out.println("Ошибка файловой системы: " + e.getMessage());
        }
    }
}
