import java.util.Scanner;

public class Q06_CompareThreeDecimalPlaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double first = input.nextDouble();
        System.out.print("Input floating-point another number: ");
        double second = input.nextDouble();

        // Compare after rounding both values to three decimal places.
        long firstRounded = Math.round(first * 1000);
        long secondRounded = Math.round(second * 1000);

        if (firstRounded == secondRounded) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
        input.close();
    }
}
