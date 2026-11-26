import java.util.Scanner;
public class Q25_NthPrimeNumber {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt(), count = 0, number = 1;
        if (n > 0) {
            while (count < n) { number++; if (prime(number)) count++; }
            System.out.println("The " + n + "th prime number is " + number);
        } else System.out.println("n must be positive.");
        sc.close();
    }
}
