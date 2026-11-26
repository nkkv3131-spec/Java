import java.util.Scanner;
public class Q21_MysteryNumber {
    static int reverse(int n) { int r = 0; while (n > 0) { r = r * 10 + n % 10; n /= 10; } return r; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean found = false;
        for (int a = 1; a < n && !found; a++) {
            int b = n - a;
            if (reverse(a) + reverse(b) == reverse(n)) found = true;
        }
        System.out.println(n > 0 && found ? "Mystery number" : "Not a Mystery number");
        sc.close();
    }
}
