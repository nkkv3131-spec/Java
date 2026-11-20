import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        String number = input.next();

        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i) + " ");
        }

        System.out.println();
    }
}
