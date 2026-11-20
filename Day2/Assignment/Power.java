import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        double cube = square * number;
        double fourthPower = cube * number;

        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);
    }
}
