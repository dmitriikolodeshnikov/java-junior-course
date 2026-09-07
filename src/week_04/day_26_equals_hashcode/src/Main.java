package week_04.day_26_equals_hashcode.src;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,
                "Alexandr",
                "other@gmail.com");

        User user2 = new User(1,
                "Alex",
                "alex@gmail.com");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
