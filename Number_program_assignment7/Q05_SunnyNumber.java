import java.util.Scanner;
public class Q05_SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong(), r = (long)Math.sqrt(n + 1);
        System.out.println(n >= 0 && r * r == n + 1 ? "Sunny number" : "Not a sunny number");
        sc.close();
    }
}
