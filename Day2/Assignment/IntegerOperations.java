import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int first = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int second = input.nextInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        double average = (first + second) / 2.0;
        int distance = Math.abs(first - second);
        int maximum = Math.max(first, second);
        int minimum = Math.min(first, second);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f%n", average);
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + maximum);
        System.out.println("Min integer: " + minimum);
    }
}
