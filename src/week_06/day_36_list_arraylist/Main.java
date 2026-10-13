package week_06.day_36_list_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Alex"));
        users.add(new User(2, "Mary"));
        users.add(new User(3, "John"));
        users.add(new User(4, "Max"));
        users.add(new User(5, "Ann"));

        for (var user : users) {
            System.out.println(user);
        }

        for (var user : users) {
            if (user.getName().equals("Mary")) {
                System.out.println("Found: " + user);
            }
        }
        users.remove(4);
        System.out.println("User count: " + users.size());
    }
}
