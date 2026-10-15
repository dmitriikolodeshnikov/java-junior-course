package week_06.day_38_set_hashSet.task_02.src;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numbers.size());
    }
}
