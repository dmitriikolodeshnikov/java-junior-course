package week_04.day_22_static_final.task_02.src;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex");
        User user2 = new User("Ivan");
        User user3 = new User("Maria");
        User user4 = new User("Petr");
        User user5 = new User("John");

        System.out.println(User.userCount);
    }
}
