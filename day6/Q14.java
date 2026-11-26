import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number (table to be calculated): ");
        int number = input.nextInt();
        System.out.print("Input number of terms: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        input.close();
    }
}
