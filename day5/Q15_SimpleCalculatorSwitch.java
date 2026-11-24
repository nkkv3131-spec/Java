import java.util.Scanner;

public class Q15_SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch (operator) {
            case '+': System.out.println("Result: " + (first + second)); break;
            case '-': System.out.println("Result: " + (first - second)); break;
            case '*': System.out.println("Result: " + (first * second)); break;
            case '/':
                if (second == 0) {
                    System.out.println("Error: division by zero");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            default: System.out.println("Invalid operator");
        }
        input.close();
    }
}
