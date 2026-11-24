import java.util.Scanner;

public class Q17_MenuDrivenCalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = input.nextInt();
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + (first + second)); break;
            case 2: System.out.println("Result: " + (first - second)); break;
            case 3: System.out.println("Result: " + (first * second)); break;
            case 4:
                if (second == 0) {
                    System.out.println("Error: division by zero");
                } else {
                    System.out.println("Result: " + ((double) first / second));
                }
                break;
            default: System.out.println("Invalid menu choice");
        }
        input.close();
    }
}
