import java.util.Scanner;

public class Q19_MaximumOfTwoNumbersSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch (Double.compare(first, second)) {
            case 1: System.out.println("Maximum: " + first); break;
            case -1: System.out.println("Maximum: " + second); break;
            case 0: System.out.println("Both numbers are equal: " + first); break;
        }
        input.close();
    }
}
