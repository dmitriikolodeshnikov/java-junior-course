package week_01_java_basics.day_06_loops.src;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        int divisibleByThree = 0;
        int min = 1;
        int max = n;
        int evenCount = 0;
        int evenSum = 0;
        int divisibleByFive = 0;
        System.out.println("=======================");
        System.out.println("    NUMBER ANALYZER");
        System.out.println("=======================");
        System.out.println();

        System.out.print("Number: " + n);
        System.out.println();

        System.out.print("Numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
            if (i % 3 == 0) {
                divisibleByThree++;
            }
            if (i % 5 == 0) {
                divisibleByFive++;
            }
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 2; i <= n ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenCount++;
                evenSum += i;
            }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Even count: " + evenCount);
        System.out.println("Even sum: " + evenSum);

        System.out.println("Divisible by 3: " + divisibleByThree);
        System.out.println("Divisible by 5: " + divisibleByFive);
    }
}
