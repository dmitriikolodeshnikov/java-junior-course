package week_03.day_15_classes_objects.src;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Alex";
        user1.age = 25;
        user1.email = "alex@yahoo.com";

        User user2 = new User();
        user2.name = "Maria";
        user2.age = 22;
        user2.email = "maria@mail.ru";

        User user3 = new User();
        user3.name = "John";
        user3.age = 20;
        user3.email = "john@gmail.com";

        System.out.println(user1.name + " " + user1.age);
        System.out.println(user2.name + " " + user2.age);
        System.out.println(user3.name + " " + user3.age);
    }
}

class User {
    String name;
    int age;
    String email;
}
