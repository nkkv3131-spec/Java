import java.util.Scanner;
public class Q22_SmithNumber {
    static int digitSum(int n) { int s = 0; while (n > 0) { s += n % 10; n /= 10; } return s; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), x = n, factorSum = 0;
        boolean composite = false;
        for (int p = 2; p <= x / p; p++) {
            while (x % p == 0) { factorSum += digitSum(p); x /= p; composite = true; }
        }
        if (x > 1) { factorSum += digitSum(x); composite = true; }
        System.out.println(n > 1 && composite && factorSum == digitSum(n) ? "Smith number" : "Not a Smith number");
        sc.close();
    }
}
