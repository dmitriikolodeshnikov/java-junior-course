package week_04.day_22_static_final;

public class Statistics {

    private static int users;
    private static int orders;
    private static final String TITLE = "APPLICATION STATISTICS";

    public static void addUser() {
        users++;
    }

    public static void addOrder() {
        orders++;
    }

    public static void print() {
        System.out.println(TITLE);
        System.out.println("Users: " + users);
        System.out.println("Orders: " + orders);
    }




}
