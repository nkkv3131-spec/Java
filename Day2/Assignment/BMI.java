import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double height = input.nextDouble();

        double bmi = (weight * 703) / (height * height);

        System.out.println("Body Mass Index is " + bmi);
    }
}
