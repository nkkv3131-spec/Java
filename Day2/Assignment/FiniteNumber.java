import java.util.Scanner;

public class FiniteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double number = input.nextDouble();

        if (Double.isFinite(number)) {
            System.out.println(number + " is a finite number");
        } else {
            System.out.println(number + " is not a finite number");
        }
    }
}
