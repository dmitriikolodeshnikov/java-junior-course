package week_06.day_37_LinkedList_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Fix bugs");
        tasks.offer("Create endpoints");
        tasks.offer("Write tests");

        System.out.println("Next task: " + tasks.peek());

        String task = tasks.poll();
        System.out.println("Completed: " + task);

        System.out.println("Remaining: " + tasks);

    }
}
