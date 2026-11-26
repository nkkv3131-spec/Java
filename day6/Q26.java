import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) printRow(i);
        for (int i = n - 1; i >= 1; i--) printRow(i);
        input.close();
    }

    private static void printRow(int level) {
        for (int j = 0; j < level; j++) System.out.print((char)('A' + j));
        for (int j = level - 2; j >= 0; j--) System.out.print((char)('A' + j));
        System.out.println();
    }
}
