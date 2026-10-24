package week_06.day_40_iterator.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Alex", 35));
        users.add(new User(2, "Tom", 15));
        users.add(new User(3, "John", 25));
        users.add(new User(4, "Bob", 18));
        users.add(new User(5, "Mat", 17));

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getAge() < 18) {
                iterator.remove();
            }
        }

        for (var user : users) {
            System.out.println(user.getId() + ". " + user.getName() + " -> " + user.getAge());
        }
    }
}
