import java.util.Scanner;

public class Q01_PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        double number = input.nextDouble();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        input.close();
    }
}
