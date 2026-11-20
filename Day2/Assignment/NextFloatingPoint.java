import java.util.Scanner;

public class NextFloatingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double number = input.nextDouble();

        double nextPositive = Math.nextAfter(number, Double.POSITIVE_INFINITY);
        double nextNegative = Math.nextAfter(number, Double.NEGATIVE_INFINITY);

        System.out.println("Next value towards positive infinity: " + nextPositive);
        System.out.println("Next value towards negative infinity: " + nextNegative);
    }
}
