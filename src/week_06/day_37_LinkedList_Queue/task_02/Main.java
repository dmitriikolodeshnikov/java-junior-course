package week_06.day_37_LinkedList_Queue.task_02;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> users = new LinkedList<>();
        users.offer("Mary");
        users.offer("Tom");
        users.offer("Bill");
        String first = users.poll();
        System.out.println(first);

    }
}
