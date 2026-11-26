import java.util.Scanner;
public class Q19_KrishnamurthyNumber {
    static int fact(int n) { int f = 1; for (int i = 2; i <= n; i++) f *= i; return f; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), t = n, sum = 0;
        if (n >= 0) {
            do { sum += fact(t % 10); t /= 10; } while (t > 0);
            System.out.println(sum == n ? "Krishnamurthy number" : "Not a Krishnamurthy number");
        } else System.out.println("Please enter a non-negative number.");
        sc.close();
    }
}
