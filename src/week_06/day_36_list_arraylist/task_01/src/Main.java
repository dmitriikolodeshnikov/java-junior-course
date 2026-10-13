package week_06.day_36_list_arraylist.task_01.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Maria");
        names.add("John");
        names.add("Kate");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
