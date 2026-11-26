import java.util.Scanner;
public class Q13_EmirpNumber {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) if (n % i == 0) return false;
        return true;
    }
    static int reverse(int n) { int r = 0; while (n > 0) { r = r * 10 + n % 10; n /= 10; } return r; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), rev = reverse(n);
        System.out.println(prime(n) && prime(rev) && n != rev ? "Emirp number" : "Not an Emirp number");
        sc.close();
    }
}
