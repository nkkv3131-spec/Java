import java.util.Scanner;

public class SignedUnsigned {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = input.nextInt();

        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        int signedResult = Integer.compare(first, second);
        int unsignedResult = Integer.compareUnsigned(first, second);

        System.out.println("Signed comparison: " + signedResult);
        System.out.println("Unsigned comparison: " + unsignedResult);
    }
}
