import java.util.Scanner;

public class FloorDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int quotient = Math.floorDiv(dividend, divisor);
            int remainder = Math.floorMod(dividend, divisor);

            System.out.println("Floor division: " + quotient);
            System.out.println("Floor modulus: " + remainder);
        }
    }
}
