import java.util.Scanner;
public class Q26_AlternatePrimeNumbers {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = sc.nextInt(), count = 0;
        System.out.println("Alternate prime numbers:");
        for (int i = 2; i <= limit; i++) {
            if (prime(i)) {
                if (count % 2 == 0) System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        sc.close();
    }
}
