package week_06.day_36_list_arraylist.task_03.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> users  = new ArrayList<>();
        users.add("Alex");
        users.add("Maria");
        users.add("David");
        users.add("Kate");

        if (users.contains("Alex")) {
            System.out.println("Alex exists");
        }
        if (users.contains("John")) {
            System.out.println("John exists");
        }
    }
}
