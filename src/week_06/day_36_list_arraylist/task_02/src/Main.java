package week_06.day_36_list_arraylist.task_02.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20, 30, 40, 50);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        numbers.set(2, 35);
        numbers.remove(numbers.indexOf(20));
        System.out.println(numbers.size());
    }
}
