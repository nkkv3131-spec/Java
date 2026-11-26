import java.util.Scanner;

public class Q23_DecreasingStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) System.out.print(" ");
            for (int star = 0; star < n - i; star++) System.out.print("*");
            System.out.println();
        }
        input.close();
    }
}
