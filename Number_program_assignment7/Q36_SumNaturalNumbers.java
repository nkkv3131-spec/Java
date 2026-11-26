import java.util.Scanner;
public class Q36_SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int n = sc.nextInt();
        if (n < 1) System.out.println("Please enter a positive integer.");
        else {
            long sum = (long)n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
        sc.close();
    }
}
