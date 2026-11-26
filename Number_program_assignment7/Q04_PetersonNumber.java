import java.util.Scanner;
public class Q04_PetersonNumber {
    static int fact(int n) { int f = 1; for (int i = 2; i <= n; i++) f *= i; return f; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), temp = n, sum = 0;
        if (n >= 0) {
            do { sum += fact(temp % 10); temp /= 10; } while (temp > 0);
            System.out.println(sum == n ? "Peterson number" : "Not a Peterson number");
        } else System.out.println("Please enter a non-negative number.");
        sc.close();
    }
}
