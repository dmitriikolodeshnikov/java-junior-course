package week_06.day_40_iterator.task_03.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 30));
        users.add(new User("John", 50));
        users.add(new User("Mary", 15));
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getAge() < 18) {
                iterator.remove();
            }
        }

        for (var user : users) {
            System.out.println(user.getName() + " -> " + user.getAge());
        }
    }
}
