import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = input.nextInt();

        int sum = 0;
        System.out.println("The odd numbers are:");
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.println(odd);
            sum += odd;
        }
        System.out.println("The sum of odd natural numbers up to " + n + " terms is: " + sum);
        input.close();
    }
}
