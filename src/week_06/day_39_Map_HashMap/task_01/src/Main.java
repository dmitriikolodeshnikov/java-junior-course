package week_06.day_39_Map_HashMap.task_01.src;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, String> numbersBook = new HashMap<>();
        numbersBook.put("Alex", "+111");
        numbersBook.put("Maria", "+222");
        numbersBook.put("John", "+333");

        for (Map.Entry<String, String> book : numbersBook.entrySet()) {
            System.out.print("Name: " + book.getKey() + " ");
            System.out.println("Phone: " + book.getValue());
        }
    }
}
