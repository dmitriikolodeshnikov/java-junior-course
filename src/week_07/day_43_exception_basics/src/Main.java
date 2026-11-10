package week_07.day_43_exception_basics.src;

import java.util.Scanner;

public class Main {

    static double calculate(double a, double b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Деление на ноль запрещено");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция " + operation);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Первое число: ");
            double firstNum = Double.parseDouble(scanner.nextLine());

            System.out.print("Операция (+ - * /): ");
            char operation = scanner.nextLine().charAt(0);


            System.out.print("Второе число: ");
            double secondNum = Double.parseDouble(scanner.nextLine());

            double result = calculate(firstNum, secondNum, operation);
            System.out.println("Результат: " + result);
        }catch (NumberFormatException e) {
            System.out.println("Ошибка: необходимо ввести число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }
}
