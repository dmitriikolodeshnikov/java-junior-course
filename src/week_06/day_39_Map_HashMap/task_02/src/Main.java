package week_06.day_39_Map_HashMap.task_02.src;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<Long, String> users = new HashMap<>();
        users.put(1L, "Mary");
        users.put(2L, "John");
        users.put(3L, "Alex");

        System.out.println(users.get(2L));
        if (users.containsValue("Mary"))
        System.out.println("User exists");
    }
}
