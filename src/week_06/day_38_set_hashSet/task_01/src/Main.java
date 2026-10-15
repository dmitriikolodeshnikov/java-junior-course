package week_06.day_38_set_hashSet.task_01.src;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Python");

        System.out.println(languages.size());

    }
}
