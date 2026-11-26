import java.util.Scanner;
public class Q27_SquareRootWithoutSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        double n = sc.nextDouble();
        if (n < 0) System.out.println("Square root of a negative number is not real.");
        else if (n == 0) System.out.println("Square root: 0.0");
        else {
            double low = 0, high = Math.max(1, n), mid = 0;
            for (int i = 0; i < 100; i++) {
                mid = (low + high) / 2;
                if (mid > n / mid) high = mid; else low = mid;
            }
            System.out.printf("Square root: %.6f%n", (low + high) / 2);
        }
        sc.close();
    }
}
