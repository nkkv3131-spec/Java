import java.util.Scanner;
public class Q01_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong(), value = Math.abs(n), reversed = 0;
        while (value > 0) { reversed = reversed * 10 + value % 10; value /= 10; }
        if (n < 0) reversed = -reversed;
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
