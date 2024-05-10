import java.util.Scanner;

class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите тип операции: [adder, divider, multiplier, subtractor] ");
        String operation = scanner.next();

        switch (operation) {
            case "adder":
                System.out.println(Calculator.add(a, b));
                break;
            case "divider":
                System.out.println(Calculator.divide(a, b));
                break;
            case "multiplier":
                System.out.println(Calculator.multiply(a, b));
                break;
            case "subtractor":
                System.out.println(Calculator.subtract(a, b));
                break;
            default:
                System.out.println("Неизвестная операция.");
                break;
        }
    }
}
