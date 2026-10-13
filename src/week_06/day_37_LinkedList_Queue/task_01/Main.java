package week_06.day_37_LinkedList_Queue.task_01;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alex");
        names.add("Mary");
        names.add("Tom");
        names.add("Bill");
        names.add("Ann");
        names.addFirst("John");
        names.addLast("Teddy");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
