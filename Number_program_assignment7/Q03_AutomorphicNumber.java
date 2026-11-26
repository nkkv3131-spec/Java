import java.util.Scanner;
public class Q03_AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        if (n < 0) { System.out.println("Please enter a non-negative number."); }
        else {
            long square = n * n, divisor = 1, t = n;
            do { divisor *= 10; t /= 10; } while (t > 0);
            System.out.println(square % divisor == n ? "Automorphic number" : "Not an automorphic number");
        }
        sc.close();
    }
}
