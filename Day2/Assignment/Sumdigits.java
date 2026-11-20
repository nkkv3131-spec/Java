import java.util.Scanner;

public class Sumdigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("The sum of all digits in "
                + original + " is " + sum);
    }
}