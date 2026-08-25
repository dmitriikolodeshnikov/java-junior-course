package week_01_java_basics.day_06_loops.task_03;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int N = 5;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
