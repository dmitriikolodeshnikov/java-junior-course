package week_01_java_basics.day_07_atm_v1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double deposit = 1000;
        boolean running = true;


        while (running) {
            System.out.println();
            System.out.println("================");
            System.out.println("    ATM");
            System.out.println("================");
            System.out.println();
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Make a choice: ");
            int input  = scanner.nextInt();
            System.out.println("Choose: " + input);
            System.out.println();
            switch (input) {
                case 1 -> System.out.println("Balance: " + deposit);
                case 2-> {System.out.print("Enter amount: ");
                            double amount = scanner.nextDouble();
                            if (amount < 0) {
                                System.out.println("Invalid amount");
                                continue;
                            }
                            deposit += amount;
                            System.out.println("Deposit successful");
                            System.out.println("Balance: " + deposit);
                        }
                case 3 -> {System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    if (amount > deposit) {
                        System.out.println("Insufficient funds");
                        continue;
                    }
                    deposit -= amount;
                    System.out.println("Withdrawal successful");
                    System.out.println("Balance: " + deposit);
                }
                case 4 -> {System.out.println("Goodbye!");
                          running = false;
                        }
                default -> System.out.println("Unknown");
            }
        }
    }
}
