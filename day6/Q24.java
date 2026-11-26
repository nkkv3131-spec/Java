import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("@");
            System.out.println();
        }
        input.close();
    }
}
