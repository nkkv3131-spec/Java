import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) printRow(i);
        for (int i = n - 1; i >= 1; i--) printRow(i);
        input.close();
    }

    private static void printRow(int level) {
        for (int space = 0; space < 0; space++) System.out.print(" ");
        for (int j = level; j >= 1; j--) System.out.print(j);
        for (int j = 2; j <= level; j++) System.out.print(j);
        System.out.println();
    }
}
