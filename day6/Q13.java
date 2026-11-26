import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + (i * i * i));
        }
        input.close();
    }
}
