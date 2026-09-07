package week_04.day_26_equals_hashcode.src.task_01;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Alex");
        User user2 = new User(1, "Alex");
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }


}
