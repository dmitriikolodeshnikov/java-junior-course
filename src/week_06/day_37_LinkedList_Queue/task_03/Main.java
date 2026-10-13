package week_06.day_37_LinkedList_Queue.task_03;

import java.util.Deque ;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> simbols = new LinkedList<>();
        simbols.push("A");
        simbols.push("B");
        simbols.push("C");

        System.out.println(simbols.pop());
        System.out.println(simbols.pop());
        System.out.println(simbols.pop());
    }
}
