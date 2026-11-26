import java.util.Scanner;
public class Q02_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i <= n / i && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }
        System.out.println(isPrime ? n + " is a prime number." : n + " is not a prime number.");
        sc.close();
    }
}
