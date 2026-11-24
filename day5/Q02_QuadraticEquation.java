import java.util.Scanner;

public class Q02_QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The roots are equal: " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are " + realPart + " + " + imaginaryPart
                        + "i and " + realPart + " - " + imaginaryPart + "i");
            }
        }
        input.close();
    }
}
