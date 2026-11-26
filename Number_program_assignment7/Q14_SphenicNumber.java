import java.util.Scanner;
public class Q14_SphenicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), x = n, count = 0;
        for (int p = 2; p <= x / p; p++) {
            if (x % p == 0) {
                int exponent = 0;
                while (x % p == 0) { x /= p; exponent++; }
                if (exponent == 1) count++; else count = -100;
            }
        }
        if (x > 1) count++;
        System.out.println(n > 1 && count == 3 ? "Sphenic number" : "Not a Sphenic number");
        sc.close();
    }
}
