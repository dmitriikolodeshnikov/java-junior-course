package week_06.day_40_iterator.task_02.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 15, 3, 20, 7, 30);
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number < 10) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }

}
