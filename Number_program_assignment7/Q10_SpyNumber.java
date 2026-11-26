import java.util.Scanner;
public class Q10_SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), t = n, sum = 0, product = 1;
        if (n >= 0) {
            do { int d = t % 10; sum += d; product *= d; t /= 10; } while (t > 0);
            System.out.println(sum == product ? "Spy number" : "Not a Spy number");
        } else System.out.println("Please enter a non-negative number.");
        sc.close();
    }
}
