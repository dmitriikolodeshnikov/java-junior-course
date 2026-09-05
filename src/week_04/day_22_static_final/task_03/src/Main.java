package week_04.day_22_static_final.task_03.src;

public class Main {

    public static void main(String[] args) {
        int attempts = 5;
        if (attempts >= SecurityConfig.MAX_LOGIN_ATTAMPTS) {
            System.out.println("Account blocked");
        }
    }
}
