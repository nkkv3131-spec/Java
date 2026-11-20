import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}
