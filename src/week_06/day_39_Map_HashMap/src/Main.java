package week_06.day_39_Map_HashMap.src;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Alex", "+11111");
        phoneBook.put("John", "+22222");
        phoneBook.put("Bill", "+33333");
        phoneBook.put("Tom", "+44444");

        String phone = phoneBook.get("John");
        System.out.println("John: " + phone);

        if (phoneBook.containsKey("Alex")) {
            System.out.println("Alex exists");
        }

        phoneBook.remove("Bill");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
