import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int first = input.nextInt();

        System.out.print("Input second number: ");
        int second = input.nextInt();

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " x " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + (first / second));
        System.out.println(first + " mod " + second + " = " + (first % second));
    }
}
