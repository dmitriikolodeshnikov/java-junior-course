package week_07.day_46_file_io.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Path path = Path.of("data", "notes.txt");

       try(Scanner scanner = new Scanner(System.in)) {
           System.out.print("Введите заметку: ");
           String line = scanner.nextLine();

           Files.createDirectories(path.getParent());

           Files.writeString(path,line + System.lineSeparator());

           System.out.println("Заметка сохранена");
           System.out.println("Содержание файла :");

           System.out.println(Files.readString(path));

       } catch (IOException e) {
           System.out.println(" Не удалось сохранить заметку: " + e.getMessage());
       }
    }
}
