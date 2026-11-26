import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
        input.close();
    }
}
