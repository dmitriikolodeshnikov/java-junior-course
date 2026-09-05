package week_04.day_22_static_final.task_02.src;

public class User {
    static int userCount;

    private String name;
    public User(String name) {
        this.name = name;
        userCount++;
    }

}
