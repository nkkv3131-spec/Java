import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows (half of the diamond): ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            printRow(rows - i, 2 * i - 1);
        }
        for (int i = rows - 1; i >= 1; i--) {
            printRow(rows - i, 2 * i - 1);
        }
        input.close();
    }

    private static void printRow(int spaces, int stars) {
        for (int i = 0; i < spaces; i++) System.out.print(" ");
        for (int i = 0; i < stars; i++) System.out.print("*");
        System.out.println();
    }
}
