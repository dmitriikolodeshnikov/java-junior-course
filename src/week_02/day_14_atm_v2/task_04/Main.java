package week_02.day_14_atm_v2.task_04;

public class Main {
    static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        boolean result = isValidEmail("user@yahoo.com");
        System.out.println(result);
    }
}
