import java.util.Scanner;

public class Q23_CustomPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            printStars(i);
        }
        for (int i = rows; i >= 1; i--) {
            printStars(i);
        }
        input.close();
    }

    private static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*  ");
        }
        System.out.println();
    }
}
