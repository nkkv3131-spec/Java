import java.util.Scanner;
public class Q05_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int original = n, digits = String.valueOf(n).length(), temp = n;
            long sum = 0;
            do {
                int digit = temp % 10;
                sum += (long) Math.pow(digit, digits);
                temp /= 10;
            } while (temp > 0);
            System.out.println(sum == original
                    ? original + " is an Armstrong number."
                    : original + " is not an Armstrong number.");
        }
        sc.close();
    }
}
