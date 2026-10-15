package week_06.day_38_set_hashSet.src;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Alex"));
        users.add(new User(2, "John"));
        users.add(new User(2, "Mary"));
        users.add(new User(1, "Alexander"));

        System.out.println("Users: " + users.size());

        for (User user : users) {
            System.out.println(user);
        }
    }
}
