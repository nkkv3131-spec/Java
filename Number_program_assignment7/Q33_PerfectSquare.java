import java.util.Scanner;
public class Q33_PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long r = n >= 0 ? (long)Math.sqrt(n) : -1;
        System.out.println(n >= 0 && r * r == n ? "Perfect square" : "Not a perfect square");
        sc.close();
    }
}
