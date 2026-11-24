import java.util.Scanner;

public class Q03_GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        double first = input.nextDouble();
        System.out.print("Input the 2nd number: ");
        double second = input.nextDouble();
        System.out.print("Input the 3rd number: ");
        double third = input.nextDouble();

        double greatest = Math.max(first, Math.max(second, third));
        System.out.println("The greatest: " + greatest);
        input.close();
    }
}
