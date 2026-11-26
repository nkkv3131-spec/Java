import java.util.Scanner;
public class Q09_NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), square = n * n, sum = 0;
        while (square > 0) { sum += square % 10; square /= 10; }
        System.out.println(n >= 0 && sum == n ? "Neon number" : "Not a Neon number");
        sc.close();
    }
}
